package datastructure.week8.queue;

public class StringArrayQueue implements MyStringQueue {
	//
	private static final int INITIAL_CAPACITY = 5;
	private String[] elements;
	private int length;
	private int front;
	private int rear;

	public StringArrayQueue() {
		//
		this.elements = new String[INITIAL_CAPACITY];
		this.length = 0;
		this.front = 0;
		this.rear = 0;
	}

	@Override
	public boolean offer(String element) {
		//
		if(full()) {
			throw new ArrayIndexOutOfBoundsException("Queue is Full.");
		}

		elements[rear] = element;
		rear = (rear + 1) % elements.length;
		length++;

		return true;
	}

	@Override
	public String peek() {
		//
		if (empty()) {
			return null;
		}

		return elements[front];
	}

	@Override
	public String poll() {
		//
		String element = "";
		
		if (empty()) {
			element = null;
		} else { 
			//
			element = elements[front];
			elements[front] = null;
			front = (front + 1) % elements.length;

			length--;
		}

		return element;
	}

	@Override
	public int size() {
		//
		return length;
	}

	@Override
	public boolean empty() {
		//
		if ((length == 0)) {
			return true;
		}

		return false;
	}
	
	private boolean full() {
		//
		if(length == elements.length) {
			return true;
		}
//		int difference = rear - front;
//		if(difference == -1 || length == elements.length) {
//			return true;
//		}
		
		return false;
	}

	public String toString() {
		//
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < elements.length; i++) {
			sb.append(elements[i]);
			sb.append(", ");
		}
		sb.append("\n");
		sb.append("front : " + front + ", rear : " + rear + ", length : " + length);

		return sb.toString();
	}

}
