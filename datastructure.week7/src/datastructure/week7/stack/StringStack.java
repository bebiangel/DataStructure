package datastructure.week7.stack;

import java.util.NoSuchElementException;

public class StringStack implements MyStringStack {
	//
	private Node top;

	public StringStack() {
		//
		this.top = null;
	}

	@Override
	public boolean empty() {
		//
		if (top == null) {
			return true;
		}
		
		return false;
	}

	@Override
	public String push(String element) {
		//
		Node newNode = new Node(element);

		if (top == null) {
			//
			top = newNode;
		} else {
			//
			newNode.next = top;
			top = newNode;
		}

		return newNode.element;
	}

	@Override
	public String pop() {
		//
		if (empty()) {
			//
			throw new NoSuchElementException("Stack Underflow");
		}
		
		String element = top.element;
		top = top.next;
		return element;
	}

	@Override
	public String peek() {
		//
		if (empty()) {
			throw new NoSuchElementException("Stack Underflow");
		}

		return top.element;
	}

	@Override
	public int search(String element) {
		//
		if (empty()) {
			throw new NoSuchElementException("Stack Underflow");
		}
		
		int position = 0;
		while (top != null) {
			//
			position++;
			if (top.element.equals(element)) {
				break;
			}
			top = top.next;
		}

		return position;
	}

	public String toString() {
		//
		Node node = top;
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			//
			sb.append(node.element);
			sb.append(", ");
			node = node.next;
		}
		return sb.toString();
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
