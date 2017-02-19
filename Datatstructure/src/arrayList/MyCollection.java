package arrayList;

public interface MyCollection {
	//
	boolean add(Object data);
	void add(Object data, int index);
	Object remove(int index);
	boolean isEmpty();
	int size();
	void clear();
	Object get(int index);
	int indecxOf(Object object);
	Object set(int index, Object object);
	boolean contains(Object object);
}
