package datastructure.week8.queue;

public class StringLinkdedQueue implements MyStringQueue {
	//
	private Node head;
	private Node tail;
	private int size;

	public StringLinkdedQueue() {
		//
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public boolean offer(String element) {
		//
		Node newNode = new Node(element);

		newNode.next = head;
		head = newNode;

		size++;

		if (tail == null) {
			tail = newNode;
		}

		return true;
	}

	@Override
	public String peek() {
		//
		if (head == null) {
			return null;
		}

		return head.element;
	}

	@Override
	public String poll() {
		//
		if (head == null) {
			return null;
		}

		String targetElement = tail.element;

		Node node = getNode(size - 1);
		tail = node;
		node.next = null;

		size--;

		return targetElement;
	}

	@Override
	public int size() {
		//
		return size;
	}

	@Override
	public boolean empty() {
		//
		if (size == 0) {
			return true;
		}

		return false;
	}

	public String toString() {
		//
		Node node = head;
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			//
			sb.append(node.element);
			sb.append(", ");
			node = node.next;
		}

		return sb.toString();
	}

	private Node getNode(int targetPosition) {
		//
		Node targetNode = head;
		int position = 1;

		while (true) {
			//
			if (position == targetPosition) {
				break;
			}

			position++;
			targetNode = targetNode.next;
		}

		return targetNode;
	}

	private class Node {
		//
		private Node next;
		private String element;

		public Node(String element) {
			//
			this.next = null;
			this.element = element;
		}
	}
}
