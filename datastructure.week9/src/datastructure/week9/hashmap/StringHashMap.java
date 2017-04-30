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
		Node targetNode = null;
		targetNode = bucket[hash];
		while (targetNode != null) {
			//
			if (key.equals(targetNode.key)) {
				break;
			}

			targetNode= targetNode.next;
		}

		return targetNode.value;
	}

	private int hash(String key) {
		//
		return key.hashCode() % INITIAL_CAPACITY;
	}

	public void display() {
		//
		for (int i = 0; i < INITIAL_CAPACITY; i++) {
			//
			if (bucket[i] != null) {
				Node node = bucket[i];
				while (node != null) {
					System.out.println("{" + node.key + ":" + node.value + "}");
					node = node.next;
				}
			}
		}

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
	}
}
