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
		linked.offer("5");
		System.out.println(linked);
		System.out.println(linked.poll());
		linked.poll();
		linked.poll();
		linked.poll();
		linked.poll();
		System.out.println("empty : " +linked.empty());
		System.out.println(linked);
		linked.offer("7");
		linked.offer("7");
		linked.offer("7");
		linked.offer("7");
		
		System.out.println(linked.toString());
		//linked.offer("7");
		
	}
}
