package arrayList;

import java.util.Iterator;

public class Api {
	//
	public static void main(String[] args) {
		//
		StringList stringList = new StringList();
		stringList.add("b");
		stringList.add("c");
		stringList.add("d");
		stringList.add("e");
		stringList.add("e");
		stringList.add("e");
		stringList.add("e");
		StringList addList = new StringList();
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
