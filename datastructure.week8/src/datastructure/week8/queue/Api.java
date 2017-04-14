package datastructure.week8.queue;

public class Api {
	//
	public static void main(String[] args) {
		//
		MyStringQueue linked = new StringArrayQueue();
		linked.offer("1");
		System.out.println(linked);
		linked.offer("2");
		System.out.println(linked);
		linked.offer("3");
		System.out.println(linked);
		linked.offer("4");
		System.out.println(linked);
		linked.offer("5");
		System.out.println("poll : " + linked.poll());
		System.out.println(linked);
		linked.poll();
		System.out.println(linked);
		linked.poll();
		System.out.println(linked);
		linked.poll();
		System.out.println(linked);
		linked.poll();
		System.out.println("empty : " +linked.empty());
		System.out.println(linked);
		linked.offer("a");
		linked.offer("b");
		linked.offer("c");
		linked.offer("d");
		linked.offer("e");
		System.out.println(linked);
		linked.poll();
		System.out.println(linked);
		linked.poll();
		linked.poll();
		linked.poll();
		linked.offer("7");
		
		System.out.println(linked.toString());
		//linked.offer("7");
		
	}
}
