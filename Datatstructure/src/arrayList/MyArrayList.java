package arrayList;

public class MyArrayList implements MyCollection<Object> {
	//
	private Object[] array;
	private Object[] newArray;
	private int size;
	private int capacity;
	private int initialCapacity = 10;

	public MyArrayList() {
		//
		this.array = new Object[initialCapacity];
		this.capacity = initialCapacity;
	}

	@Override
	public boolean add(Object data) {
		//
		if (size >= capacity) {
			resize();
		}
		this.array[size] = data;
		size++;
		return true;
	}

	@Override
	public void add(Object data, int index) {
		//
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("now size : " + size + ", you want : " + index);
		}
		this.array[index] = data;
		size++;
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
	public Object remove(int index) {
		//
		Object prevData = array[index];
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("now index : " + index);
		}
		array[index] = null;
		for (int i = index; i < size; i++) {
			array[i] = array[i + 1];
		}
		array[size] = null;
		size--;

		return prevData;
	}

	@Override
	public boolean removeAll(MyCollection<?> c) {
		//
		this.newArray = new Object[this.initialCapacity];
		int sizeReCount = 0;
		int newArrayIndex = 0;
		for (int i = 0; i < size; i++) {
			boolean result = false;
			for (int j = 0; j < c.size(); j++) {
				if (array[i] == c.get(j)) {
					result = true;
				}
			}
			if (result == true) {
				newArray[newArrayIndex] = array[i];
				newArrayIndex++;
				sizeReCount++;
			}
		}
		this.array = newArray;
		this.size = sizeReCount;
		return true;
	}

	@Override
	public boolean isEmpty() {
		//
		return size == 0;
	}

	@Override
	public int size() {
		//
		return size;
	}

	@Override
	public void clear() {
		//
		this.newArray = new Object[this.initialCapacity];
		this.array = newArray;
		this.size = 0;
		this.capacity = initialCapacity;
	}

	@Override
	public Object get(int index) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index : " + index);
		}
		return array[index];
	}

	@Override
	public int indecxOf(Object object) {
		//
		for (int i = 0; i < size; i++) {
			if (object.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Object set(int index, Object object) {
		//
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index : " + index);
		}
		Object temp = array[index];
		this.array[index] = object;

		return temp;
	}

	@Override
	public boolean contains(Object object) {
		//
		for (int i = 0; i < size; i++) {
			if (object.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	private void resize() {
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
}
