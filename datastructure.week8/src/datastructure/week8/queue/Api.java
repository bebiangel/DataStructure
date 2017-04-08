package datastructure.week8.queue;

public class Api {
	//
	public static void main(String[] args) {
		//
		MyStringQueue linked = new StringArrayQueue();
		linked.offer("1");
		linked.offer("2");
		linked.offer("3");
		linked.offer("4");
		System.out.println(linked.poll());
		System.out.println(linked);
		linked.offer("5");
		linked.offer("6");
		System.out.println(linked);
		//linked.offer("7");
	}
}
