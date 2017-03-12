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
		private int next;

		public Node(String element) {
			//
			this.element = element;
			this.next = 0;
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
		if (tail == null) {
			result = false;
		}

		return result;
	}

	@Override
	public boolean contains(String o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(int index, String e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub

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
}
