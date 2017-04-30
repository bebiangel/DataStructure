package datastructure.week9.hashmap;

public class Api {
	//
	public static void main(String[] args) {
		//
		MyStringHashMap map = new StringHashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		map.put("5", "e");
		map.put("6", "f");
		map.put("7", "g");
		map.display();
		
		System.out.println(map.get("7"));
	}
}
