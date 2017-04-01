package datastructure.week6.linkedlist;

import datastructure.week6.iterator.MyIterator;

public class MyStringLinkedList implements StringLinkedList {
	//
	private Node head;
	private Node tail;
	private int length;

	public MyStringLinkedList() {
		//
		clear();
	}

	@Override
	public int size() {
		//
		return length;
	}

	@Override
	public boolean isEmpty() {
		//
		if (length == 0) {
			return true;
		}

		return false;
	}

	@Override
	public boolean contains(String o) {
		//
		boolean contained = false;
		Node currentNode = head;

		while (currentNode.next != null) {
			//
			if (o.equals(currentNode.element)) {
				contained = true;
				break;
			}
			
			currentNode = currentNode.next;
		}

		return contained;
	}

	@Override
	public MyIterator iterator() {
		//
		String[] elements = toArray();
		return new MyIterator(elements);
	}

	@Override
	public boolean add(String e) {
		//
		if (length == 0) {
			//
			addFirst(e);
		} else {
			//
			addLast(e);
		}

		return true;
	}

	@Override
	public boolean add(int index, String element) {
		//
		if (index > length || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			//
			addFirst(element);
		} else {
			//
			Node newNode = new Node(element);
			Node currentNode = getNode(index - 1);

			newNode.next = currentNode.next;
			currentNode.next = newNode;

			length++;
		}

		return true;
	}

	@Override
	public String get(int index) {
		//
		if (index < 0 || index > length) {
			throw new IndexOutOfBoundsException();
		}

		Node targetNode = head;
		int position = 0;
		
		while(true) {
			//
			if(index == position) {
				break;
			}
			targetNode = targetNode.next;
			position++;
		}
	
		return targetNode.element;
	}

	@Override
	public void remove(Object o) {
		//
		int index = 0;

		Node currentNode = head;
		while(currentNode != null){
			//
			if(currentNode.equalsElement(o)) {
				remove(index);
			}
			currentNode = currentNode.next;
			index++;
		}
		
		if (index > -1) {
			remove(index);
			length--;
		}
	}

	@Override
	public void remove(int index) {
		//
		if (index < 0 || index > length) {
			throw new IndexOutOfBoundsException();
		}

		if (index == 0) {
			//
			removeFirst();
		} else if(index == length-1) {
			//
			removeLast();
		} else {
			//
			Node removeNode = getNode(index);
			Node previousNode = getNode(index - 1);
			
			previousNode.next = removeNode.next;
			removeNode = null;
			
			length--;
		}

	}

	@Override
	public void addAll(StringLinkedList c) {
		//
		int addedSize = c.size();
		
		for (int i = 0; i < addedSize; i++) {
			//
			add(c.get(i));
		}
	}

	@Override
	public void clear() {
		//
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	@Override
	public String[] toArray() {
		//
		String[] elements = new String[length];
		int index = 0;
		Node node = head;

		while (node != null) {
			//
			elements[index++] = node.element;
			node = node.next;
		}

		return elements;
	}

	private Node getNode(int index) {
		//
		Node targetNode = head;
		int position = 0;

		while (true) {
			//
			if (position == index) {
				break;
			}
			position++;
			targetNode = targetNode.next;
		}

		return targetNode;
	}

	private void removeFirst() {
		//
		Node node = head;
		head = node.next;
		node = null;
		
		length--;
	}

	private void removeLast() {
		// TODO Auto-generated method stub
		
	}

	private void addFirst(String element) {
		//
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		length++;

		if (head.next == null) {
			tail = newNode;
		}
	}

	private void addLast(String element) {
		//
		Node newNode = new Node(element);
		tail.next = newNode;
		tail = newNode;
		length++;
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
		
		public boolean equalsElement(Object o) {
			//
			if(this.element.equals(o)) {
				return true;
			}
			
			return false;
		}
	}
}
