package datastructure.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyArrayList implements MyStringList {
	//
	private static final int INITIAL_CAPACITY = 10;
	private int length;
	private int capacity;
	private String[] elements;
	private String[] newElements;

	public MyArrayList() {
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
		if (length != 0) {
			return false;
		}
		return true;
	}

	@Override
	public boolean contains(String o) {
		//
		boolean result = false;

		for (int i = 0; i < length; i++) {
			if (o.equals(elements[i])) {
				result = true;
				break;
			}
		}
		return result;
	}

	@Override
	public Iterator<String> iterator() {
		//
		List<String> list = Arrays.asList(Arrays.copyOf(elements, length));

		return list.iterator();
	}

	@Override
	public boolean add(String e) {
		//
		if (capacity <= length) {
			increaseCapacity();
		}
		
		elements[length] = e;
		length++;

		return true;
	}

	@Override
	public boolean add(int index, String e) {
		//
		if (index < 0 || index > length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		if(length == capacity) {
			increaseCapacity();
		}
		
		shiftRightFrom(index);
		elements[index] = e;
		length++;

		return true;
	}

	@Override
	public String get(int index) {
		//
		if (index < 0 || index > length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return elements[index];
	}

	@Override
	public void remove(Object o) {
		//
		int index = -1;
		for (int i = 0; i < length; i++) {
			if (o.equals(elements[i])) {
				index = i;
				elements[i] = null;
				break;
			}
		}
		if (index > -1) {
			shiftLeftFrom(index);
			length--;
		}
	}

	@Override
	public void remove(int index) {
		//
		if (index > length || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		elements[index] = null;
		shiftLeftFrom(index);
		length--;
	}

	@Override
	public void addAll(MyStringList c) {
		//
		if (c.size() > (capacity - length)) {
			increaseCapacity();
		}
		for (int i = 0; i < c.size(); i++) {
			if (c.size() + length > capacity) {
				increaseCapacity(c.size());
			} else {
				increaseCapacity();
			}
			elements[length] = c.get(i);
			length++;
		}
	}

	@Override
	public void clear() {
		//
		this.length = 0;
		this.capacity = INITIAL_CAPACITY;
		this.elements = new String[INITIAL_CAPACITY];
	}

	@Override
	public String[] toArray() {
		//
		return Arrays.copyOf(elements, length);
	}

	private void increaseCapacity(int targetLength) {
		//
		while(true){
			if(capacity > targetLength) {
				break;
			} 
			capacity += INITIAL_CAPACITY;
		}
		
		this.newElements = new String[capacity];
		System.arraycopy(elements, 0, newElements, 0, this.length);
		this.elements = newElements;
	}

	private void increaseCapacity() {
		//
		this.capacity += INITIAL_CAPACITY;
		this.newElements = new String[capacity];
		System.arraycopy(elements, 0, newElements, 0, this.length);
		this.elements = newElements;
	}

	private void shiftLeftFrom(int position) {
		//
		for (int i = position; i < length; i++) {
			elements[i] = elements[i + 1];
		}
	}

	private void shiftRightFrom(int position) {
		//
		for (int i = length; i > position; i--) {
			elements[i] = elements[i - 1];
		}
	}

	public String toString() {
		//
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < length; i++) {
			builder.append(elements[i]);
			if (i < length - 1) {
				builder.append(", ");
			}
		}
		return builder.toString();
	}
}
