package arrayList;

import java.util.ArrayList;

import stopwatch.Watch;

public class Main {
	//
	private static final long MAX_COUNT = 1000;

	public static void main(String[] args) {

		MyArrayList myArrayList = new MyArrayList();
		ArrayList<Object> arrayList = new ArrayList<>();
		Watch watch = new Watch();

////		for (int j = 0; j < 10; j++) {
//			watch.start();
			for (int i = 0; i < MAX_COUNT; i++) {
				myArrayList.add(i);
			}
//			watch.stop();
//			System.out.print("add of myArrayList : ");
//			watch.totalTime();
			Watch watch2 = new Watch();
//			watch2.start();
			for (int i = 0; i < MAX_COUNT; i++) {
				arrayList.add(i);
			}
//			watch2.stop();
//			System.out.print("add of ArrayList : ");
//			watch2.totalTime();
////		}
//
		 watch.start();
		 for (int i = 0; i < MAX_COUNT-1; i++) {
			 System.out.println(myArrayList);
		 myArrayList.remove(i);
		 }
		 watch.stop();
		 System.out.print("remove of myArrayList : ");
		 watch.totalTime();
		
		 watch2.start();
		 for (int i = 0; i < MAX_COUNT-1; i++) {
		 myArrayList.remove(i);
		 }
		 watch2.stop();
		 System.out.print("remove of ArrayList : ");
		 watch2.totalTime();
//
//		 ArrayList<Object> array = new ArrayList<>();
//		 array.add(4);
//		 array.add(3, 4);
//		 System.out.println(array);
//		 MyArrayList arrayList = new MyArrayList();
//		 arrayList.add(1);
//		 arrayList.add(2);
//		 arrayList.add(3);
//		 arrayList.add(4);
//		 arrayList.add(5);
//		 arrayList.add(6);
//
//		 arrayList.add(10, 7);
//		 System.out.println(arrayList);

		// MyArrayList arrayList2 = new MyArrayList();
		// arrayList2.add(1);
		// arrayList2.add(3);
		// arrayList2.add(5);
		//
		// arrayList.removeAll(arrayList2);
		// System.out.println("list : " + arrayList);
		// System.out.println(arrayList.size());
		// System.out.println("toString() : " + arrayList);
		//
		// arrayList.remove(6);
		// System.out.println("remove() : " + arrayList);
		//
		// arrayList.add(4);
		// arrayList.add(10);
		// System.out.println(arrayList);
		//
		// System.out.println("index element : " + arrayList.get(3));
		//
		// System.out.println("size() : " + arrayList.size());
		//
		// System.out.println("isEmpty : " + arrayList.isEmpty());
		//
		// arrayList.set(2, 13);
		// System.out.println("set() : " + arrayList);
		//
		// System.out.println("contains() : " + arrayList.contains(3));
		//
		// arrayList.clear();
		// arrayList.add(3);
		//
		// arrayList.addAll(arrayList);
		// System.out.println(arrayList);
	}

}
