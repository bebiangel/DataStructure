package datastructure.week9.hashmap;

public class StringHashMap implements MyStringHashMap {
	//
	private int INITIAL_CAPACITY = 4;
	private Node[] bucket;

	public StringHashMap() {
		//
		this.bucket = new Node[INITIAL_CAPACITY];
	}

	@Override
	public void put(String key, String value) {
		//
		if (value == null) {
			throw new NullPointerException();
		}

		Node newNode = new Node(key, value);
		Node targetNode = null;
		Node previousNode = null;

		int hash = hash(key);

		if (bucket[hash] == null) {
			bucket[hash] = newNode;
		} else {
			//
			targetNode = bucket[hash];

			while (targetNode != null) {
				//
				if (targetNode.getKey().equals(newNode.getKey())) {
					targetNode.setValue(newNode.getValue());
					return;
				}
				
				previousNode = targetNode;
				targetNode = targetNode.next;
			}

			previousNode.next = newNode;
			targetNode = newNode;
		}
	}

	@Override
	public String get(String key) {
		//
		int hash = hash(key);
		Node targetNode = bucket[hash];
		String targetValue = null;

		while (targetNode != null) {
			//
			if (key.equals(targetNode.key)) {
				targetValue = targetNode.getValue();
				break;
			}

			targetNode = targetNode.next;
		}

		return targetValue;
	}

	private int hash(String key) {
		//
		return key.hashCode() % INITIAL_CAPACITY;
	}

	@Override
	public void display() {
		//
		for (int i = 0; i < INITIAL_CAPACITY; i++) {
			//
			if (bucket[i] != null) {
				Node node = bucket[i];
				while (node != null) {
					System.out.print("{" + node.key + ":" + node.value + "} ");
					node = node.next;
				}
			}
		}
		System.out.println("");

	}

	private class Node {
		//
		private String key;
		private String value;
		private Node next;

		public Node(String key, String value) {
			//
			this.key = key;
			this.value = value;
			this.next = null;
		}

		public void setValue(String value) {
			//
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
	}
}
