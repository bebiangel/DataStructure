package datastructure.week7.stack;

public class StringStack implements MyStringStack {
	//
	private Node first;
	
	public StringStack() {
		//
	}
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String push(String element) {
		// TODO Auto-generated method stub
		return null;
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
