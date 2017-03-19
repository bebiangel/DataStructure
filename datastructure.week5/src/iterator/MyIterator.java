package iterator;

import java.util.NoSuchElementException;

public class MyIterator implements MyStringIterator {
	//
	private int cursor;
	private String[] elements;
	
	public MyIterator(String[] elements) {
		//
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
		//
		boolean result = true;
		if(cursor > elements.length || cursor == elements.length) {
			result = false;
		}
		
		return result;
	}

	@Override
	public String next() {
		//
		if (!hasNext()) {
			throw new NoSuchElementException();
		}

		return elements[cursor++];
	}

}
