package datastructure.week5.linkedlist;

import java.util.Iterator;

public class MyStringLinkedList implements StringLinkedList {
	//
	private Node head;
	private Node tail;
	private int size;

	public MyStringLinkedList() {
		//
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	private class Node {
		//
		private String element;
		private Node next;

		public Node(String element) {
			//
			this.element = element;
			this.next = null;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node input) {
			this.next = input;
		}

		public String getElement() {
			return element;
		}
		
	}

	@Override
	public int size() {
		//
		return size;
	}

	@Override
	public boolean isEmpty() {
		//
		boolean result = true;
		if (size == 0) {
			result = false;
		}

		return result;
	}

	@Override
	public boolean contains(String o) {
		//
		boolean result = true;
		while (head != null) {
			//

		}
		//

		return false;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(String e) {
		//
		if (size == 0) {
			//
			addFirst(e);
		} else {
			addLast(e);
		}

		return true;
	}

	@Override
	public boolean add(int index, String e) {
		//
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
	
		if (size == 0) {
			addFirst(e);
		} else {
			//
			
		}
		
		return true;
	}

	@Override
	public String get(int index) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		Node node = head;
		for (int i = 0; i < index; i++) {
			//
			node = head.next;
		}
		
		return node.element;
	}

	@Override
	public void remove(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		//

	}

	@Override
	public void addAll(StringLinkedList c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addFirst(String element) {
		//
		Node newNode = new Node(element);
		newNode.setNext(newNode);
		head = newNode;
		size++;
		if (tail == null) {
			tail = newNode;
		}
	}

	private void addLast(String element) {
		//
		Node newNode = new Node(element);
		newNode.setNext(newNode);
		tail = newNode;
		size++;
	}

	public String toString() {
		//
		StringBuilder builder = new StringBuilder();
		builder.append(head.element);
		builder.append(", ");
		builder.append(tail.element);
		builder.append("\n");
		builder.append("size : " + size);
		return builder.toString();
	}

}
