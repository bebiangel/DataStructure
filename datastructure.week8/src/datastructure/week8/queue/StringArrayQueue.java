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
		this.rear = -1;
	}

	@Override
	public boolean offer(String element) {
		//
		if (length == elements.length) {
			throw new ArrayIndexOutOfBoundsException("length : " + length + ", elements.length : " + elements.length);
		}

		if (rear == elements.length - 1) {
			rear = -1;
		}

		rear++;
		elements[rear] = element;
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
		if (empty()) {
			return null;
		}

		String element = elements[front];
		elements[front] = null;
		front++;

		if (front == elements.length) {
			front = 0;
		}

		length--;

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
		if ((front == rear + 1)) {
			return true;
		}

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
