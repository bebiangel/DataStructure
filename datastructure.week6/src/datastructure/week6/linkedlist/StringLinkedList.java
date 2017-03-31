package datastructure.week6.linkedlist;

import datastructure.week6.iterator.MyIterator;

public interface StringLinkedList {
	 //
	 int size();
	 boolean isEmpty();
	 boolean contains(String o);
	 MyIterator iterator();
	 boolean add(String e);
	 boolean add(int index, String e); 
	 String get(int index); 
	 void remove(Object o);
	 void remove(int index); 
	 void addAll(StringLinkedList c);
	 void clear();
	 String[] toArray(); 
	}