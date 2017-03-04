package datastructure.arraylist;

import java.util.Iterator;

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
		stringList.add("e");
		MyArrayList addList = new MyArrayList();
		addList.add("a");
	
		stringList.addAll(addList);
		System.out.println(stringList);
		Iterator<String> iter = stringList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		String[] array = stringList.toArray();
		System.out.println(array.length);
		for(String element : array) {
			System.out.println(element);
		}
	}
}
