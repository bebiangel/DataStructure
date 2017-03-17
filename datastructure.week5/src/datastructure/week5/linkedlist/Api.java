package datastructure.week5.linkedlist;

public class Api {
	//
	public static void main(String[] args) {
		//
		MyStringLinkedList list = new MyStringLinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add(4, "a");
		System.out.println(list);
		
		list.remove("4");
		System.out.println(list);
		
		System.out.println(list.contains("5"));
	}
}
