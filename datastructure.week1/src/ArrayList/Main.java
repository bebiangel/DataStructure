package ArrayList;

public class Main {
	//
	public static void main(String[] args) {

		MyArrayList arrayList = new MyArrayList();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		System.out.println("toString() : " + arrayList);

		arrayList.remove(3);
		System.out.println("remove() : " + arrayList);

		arrayList.add(4);
		arrayList.add(10);
		System.out.println(arrayList);

		System.out.println("index의 element값 : " + arrayList.get(3));

		System.out.println("size() : " + arrayList.size());

		System.out.println("isEmpty : " + arrayList.isEmpty());

		arrayList.set(2, 13);
		System.out.println("set() : " + arrayList);

		System.out.println("contains() : " + arrayList.contains(3));
	}

}
