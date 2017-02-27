package datastructure.arraylist;

public interface MyCollection<E> {
	//
	boolean add(Object data);
	void add(Object data, int index);
	boolean addAll(MyCollection<? extends Object> c);
	Object remove(int index);
	boolean removeAll(MyCollection<?> c);
	boolean isEmpty();
	int size();
	void clear();
	Object get(int index);
	int indecxOf(Object object);
	Object set(int index, Object object);
	boolean contains(Object object);
}
