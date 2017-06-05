package ohMy;

import java.util.Iterator;

public class OhMyIterator implements Iterator<String> {

	String[] values = { "lions", "tigers", "bears" };
	int index = 0;

	@Override
	public boolean hasNext() {
		return (index < values.length);
		
	}

	@Override
	public String next() {
	
		String nextValue = values[index];
		index++;
		return nextValue;
		}
}
