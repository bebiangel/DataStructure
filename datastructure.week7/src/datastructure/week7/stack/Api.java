package datastructure.week7.stack;

public class Api {
	//
	public static void main(String[] args) {
		//
		StringStack stack = new StringStack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("2");
		stack.push("2");
		stack.push("9");
		System.out.println(stack.peek());
		System.out.println(stack.search("9"));
		// System.out.println(stack.toString());
		// System.out.println(stack.search("3"));
		
	}
}
