package datastructure.arraylist;

import datastructure.iterator.MyIterator;

public class Api {
	//
	public static void main(String[] args) {
		//
		MyArrayList stringList = new MyArrayList();
		stringList.add("b");
		stringList.add("c");
		stringList.add("d");
		stringList.add("e");
		stringList.add("e");
		stringList.add("e");
		stringList.add("a");
		System.out.println(stringList);

		MyIterator iterator = stringList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
