package arrayList;

import java.util.Iterator;

public interface MyStringList {
	 //
	 int size();
	 boolean isEmpty();
	 boolean contains(String o);
	 Iterator<String> iterator();
	 boolean add(String e);
	 boolean add(int index, String e); 
	 String get(int index); 
	 void remove(Object o);
	 void remove(int index); 
	 void addAll(MyStringList c);
	 void clear();
	 String[] toArray(); 
	}