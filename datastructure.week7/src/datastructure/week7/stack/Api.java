package datastructure.week7.stack;

public class Api {
	//
	private static int value;

	public static void main(String[] args) {
		//
		StringStack stack = new StringStack();
		System.out.println(stack.peek());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("2");
		stack.push("2");
		stack.push("9");
		// System.out.println(stack.toString());
		// System.out.println(stack.search("3"));
		System.out.println(stack.peek());
		
		add(3);
		System.out.println(get(4));
	}
	public static void add(int index) {
		//
		value = index;
		System.out.println(value);
	}
	
	public static String get(int index) {
		//
		System.out.println(index);
		return "get!";
	}
}
