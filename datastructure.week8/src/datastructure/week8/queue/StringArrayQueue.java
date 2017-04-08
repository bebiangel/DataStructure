package datastructure.week8.queue;

public class StringArrayQueue implements MyStringQueue {
	//
	private String[] elements;
	private int length;
	private int front;
	private int rear;
	private final int INITIAL_CAPACITY = 5;

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
		if (length == INITIAL_CAPACITY) {
			throw new ArrayIndexOutOfBoundsException("length : " + length + ", INITIAL_CAPACITY : " + INITIAL_CAPACITY);
		}

		if (rear == INITIAL_CAPACITY - 1) {
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
			throw new ArrayIndexOutOfBoundsException();
		}

		return elements[front];
	}

	@Override
	public String poll() {
		//
		String element = elements[front];
		elements[front] = null;
		front++;
		if (front == INITIAL_CAPACITY - 1) {
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
		return (front == rear + 1) || (front + INITIAL_CAPACITY - 1 == rear);
	}

	public String toString() {
		//
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < INITIAL_CAPACITY; i++) {
			sb.append(elements[i]);
			sb.append(", ");
		}
		sb.append("\n");
		sb.append("front : " + front + ", rear : " + rear + ", length : " + length);

		return sb.toString();
	}

}
