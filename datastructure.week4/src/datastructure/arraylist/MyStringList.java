package datastructure.arraylist;

import datastructure.iterator.MyIterator;

public interface MyStringList {
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
	 void addAll(MyStringList c);
	 void clear();
	 String[] toArray(); 
	}