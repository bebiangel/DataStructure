package arrayList;

import java.util.Iterator;

public class MyArrayList implements MyCollection<Object> {
	//
	private Object[] array;
	private Object[] newArray;
	private int size;
	private int capacity;
	private int initialCapacity = 5;

	public MyArrayList() {
		//
		this.array = new Object[initialCapacity];
		this.capacity = initialCapacity;
	}

	public boolean add(Object data) {
		//
		if (size >= capacity) {
			resize();
		}
		this.array[size] = data;
		size++;
		return true;
	}

	public void add(Object data, int index) {
		//
		this.array[index] = data;
		size++;
	}

	public Object remove(int index) {
		//
		Object prevData = array[index];
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("now index : " + index);
		}
		array[index - 1] = null;
		for (int i = index; i < size; i++) {
			array[i - 1] = array[i];
		}
		size--;

		return prevData;
	}

	public boolean isEmpty() {
		//
		return size == 0;
	}

	public int size() {
		//
		return size;
	}

	public void clear() {
		//
		this.newArray = new Object[this.initialCapacity];
		this.array = newArray;
		this.size = 0;
		this.capacity = initialCapacity;
	}

	public Object get(int index) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index : " + index);
		}
		return array[index];
	}

	public int indecxOf(Object object) {
		//
		for (int i = 0; i < size; i++) {
			if (object.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	public Object set(int index, Object object) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index : " + index);
		}
		Object temp = array[index];
		this.array[index] = object;

		return temp;
	}

	public boolean contains(Object object) {
		//
		for (int i = 0; i < size; i++) {
			if (object.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	public void resize() {
		//
		this.newArray = new Object[capacity * 2];
		for (int i = 0; i < size; i++) {
			this.newArray[i] = this.array[i];
		}
		this.array = newArray;
		this.capacity *= 2;
	}

	public String toString() {
		//
		String str = "";
		for (int i = 0; i < size; i++) {
			str += array[i];
			if (i < size - 1) {
				str += ", ";
			}
		}
		return str;
	}

	@Override
	public boolean addAll(MyCollection<? extends Object> c) {
		//
		int sizeForAdd = c.size();
		if (capacity - size <= sizeForAdd) {
			resize();
		}
		for (int i = 0; i < sizeForAdd; i++) {
			array[size++] = c.get(i);
		}
		return true;
	}

	@Override
	public boolean removeAll(MyCollection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Object> iterator() {
		//
		
		return null;
	}

}
