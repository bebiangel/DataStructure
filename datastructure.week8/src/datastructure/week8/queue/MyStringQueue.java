package datastructure.week8.queue;

public interface MyStringQueue {
	//
	boolean offer(String element);
	String peek();
	String poll();
	int size();
	boolean empty();
}