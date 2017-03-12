package ArrayList;

public class MyArrayList {
	//
	private Object[] array = new Object[50];
	private int size;

	public MyArrayList() {
	}

	public boolean add(Object data) {
		//
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
		Object arrays = array[size];
		for (int i = index - 1; i < size; i++) {
			array[i - 1] = array[i];
		}
		array[size - 1] = null;
		size--;

		return arrays;
	}

	// elment들이 존재하는지
	public boolean isEmpty() {
		//
		return size == 0;
	}

	// 존재하는 element size
	public int size() {
		//
		return size;
	}

	// 리스트 모든 데이터 삭제
	public void clear() {
		//
		for (int i = 0; i < size; i++) {
			array[i] = null;
		}
	}

	// index번째 값 반환
	public Object get(int index) {
		//
		return array[index];
	}

	// element의 값 반환
	public int indecxOf(Object object) {
		//
		for (int i = 0; i < size; i++) {
			if (object.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	// index 자리에 element 추가
	public Object set(int index, Object object) {
		//
		Object temp = array[index];
		this.array[index] = object;

		return temp;
	}

	// element가 있는지
	public boolean contains(Object object) {
		//
		for (int i = 0; i < size; i++) {
			if (object.equals(array[i])) {
				return true;
			}
		}
		return false;
	}

	//
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
