package fizzbuzz;

import java.util.Iterator;

public class IterableFizzBuzz implements Iterable<String> {

	public int countUpTo;

	public IterableFizzBuzz(int countUpTo) {
		this.countUpTo = countUpTo;
	}

	@Override
	public Iterator<String> iterator() {
		return new FizzBuzzIterator();
	}

	// nested class
	class FizzBuzzIterator implements Iterator<String> {

		int count = 1;

		@Override
		public boolean hasNext() {
			return count <= countUpTo;
		}

		@Override
		public String next() {
			String say = "" + count;
			

			if (isFizz(count) && isBuzz(count)) {
				say = "FizzBuzz";
			} else if (isFizz(count)) {
				say = "Fizz";
			} else if (isBuzz(count)) {
				say = "Buzz";
			}
			
			count++;
			
			return say;
		}

		public boolean isFizz(int number) {
			return number % 3 == 0;
		}

		public boolean isBuzz(int number) {
			return number % 5 == 0;
		}
	}

}
