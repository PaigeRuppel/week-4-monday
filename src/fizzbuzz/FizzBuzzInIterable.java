package fizzbuzz;

public class FizzBuzzInIterable {

	public static void main(String[] args) {
		IterableFizzBuzz fizzBuzz = new IterableFizzBuzz(20);
		
		for (String exclamation : fizzBuzz) {
			System.out.println(exclamation);
		}

	}

}
