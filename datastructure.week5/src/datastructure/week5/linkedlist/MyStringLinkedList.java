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

		public String toString() {
			//
			return String.valueOf(this.element);
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
		Node currentNode = head;

		while (currentNode.next != null) {
			//
			if (o.equals(currentNode.element)) {
				result = true;
				break;
			}
			currentNode = currentNode.next;
		}

		return result;
	}

	@Override
	public Iterator<String> iterator() {
		//
		
		return null;
	}

	@Override
	public boolean add(String e) {
		//
		if (size == 0) {
			//
			addFirst(e);
		} else {
			//
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

		Node newNode = new Node(e);
		Node currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = head.next;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;

		size++;

		return true;
	}

	@Override
	public String get(int index) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}

		Node currentNode = head;
		for (int i = 0; i < index; i++) {
			//
			currentNode = currentNode.next;
		}

		return currentNode.element;
	}

	@Override
	public void remove(Object o) {
		//
		int index = -1;

		Node currentNode = head;
		for (int i = 0; i < size; i++) {
			//
			if (o.equals(currentNode.element)) {
				//
				index = i;
				break;
			}

			currentNode = currentNode.next;
		}

		if (index > -1) {
			remove(index);
			size--;
		}
	}

	@Override
	public void remove(int index) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index == 0) {
			removeFirst();
		} else {
			//
			Node previousNode = getNode(index - 1);
			Node removeNode = getNode(index);
			previousNode.next = removeNode.next;
			removeNode = null;
			size--;
		}
		
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
		//
		return null;
	}

	private Node getNode(int index) {
		//
		Node targetNode = head;
		for (int i = 0; i < index; i++) {
			//
			targetNode = targetNode.next;
		}

		int position = 0;
		while (true) {
			//
			position++;
			if (position == index) {
				break;
			}

			targetNode = targetNode.next;
		}

		return targetNode;
	}

	private void removeFirst() {
		//
		Node node = head;
		head = node.next;
		node = null;
		size--;
	}

	private void addFirst(String element) {
		//
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		size++;

		if (head.next == null) {
			tail = newNode;
		}
	}

	private void addLast(String element) {
		//
		Node newNode = new Node(element);
		tail.next = newNode;
		tail = newNode;
		size++;
	}

}
