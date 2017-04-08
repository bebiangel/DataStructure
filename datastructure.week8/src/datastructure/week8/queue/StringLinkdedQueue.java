package datastructure.week8.queue;

public class StringLinkdedQueue implements MyStringQueue {
	//
	Node head;
	Node tail;

	public StringLinkdedQueue() {
		//
		this.head = null;
		this.tail = null;
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String push(String element) {
		//
		Node newNode = new Node(element);
		
		newNode.next = head;
		head = newNode;
		
		if(tail == null) {
			tail = newNode;
		}
		
		return newNode.element;
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(String element) {
		// TODO Auto-generated method stub
		return 0;
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
