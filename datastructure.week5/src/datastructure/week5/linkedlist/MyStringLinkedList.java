package datastructure.week5.linkedlist;

import java.util.Iterator;

public class MyStringLinkedList implements StringLinkedList {
	//
	private Node head;
	private Node tail;
	private int size;

	public MyStringLinkedList() {
		//
		clear();
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

		public String toString() {
			//
			StringBuilder builder = new StringBuilder();

			builder.append("element:").append(element);
			builder.append(", nextElement:").append((getNext() == null) ? "null" : getNext().getElement());

			return builder.toString();
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
		boolean result = false;
		Node node = head;

		while (node.next != null) {
			//
			System.out.println(head.getElement());
			if (o.equals(node.getElement())) {
				result = true;
				break;
			}
			node = node.getNext();
		}

		return result;
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
		//

	}

	@Override
	public void remove(int index) {
		//
		Node node = head;
		for (int i = 0; i < index - 1; i++) {
			//
			node = node.getNext();
		}

		Node prevNode = node;
		Node nextNode = node.getNext();

	}

	@Override
	public void addAll(StringLinkedList c) {
		//
		int addedSize = c.size();
		for (int i = 0; i < addedSize; i++) {
			//
			addLast(c.get(i));
		}
	}

	@Override
	public void clear() {
		//
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public String[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addFirst(String element) {
		//
		Node newNode = new Node(element);
		newNode.next = head;
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
		builder.append("head : " + head);
		builder.append(", ");
		builder.append("tail : " + tail);
		builder.append(", ");
		builder.append("size : " + size);

		return builder.toString();
	}

}
