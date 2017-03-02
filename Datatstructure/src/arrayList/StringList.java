package arrayList;

import java.util.Iterator;

public class StringList implements MyStringList {
	//
	private static final int INITIAL_CAPACITY = 10;
	private int length;
	private int capacity;
	private String[] elements;
	private String[] newElements;

	public StringList() {
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
		//
		if (index < 0 || index > length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		return elements[index];
	}

	@Override
	public void remove(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		//
		if (index > length || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	@Override
	public void addAll(MyStringList c) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

	private void increaseCapacity() {

	}

	private void shiftLeftFrom(int position) {

	}

	private void shiftRightFrom(int position) {

	}
}
