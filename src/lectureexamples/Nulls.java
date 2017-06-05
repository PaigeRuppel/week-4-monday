package lectureexamples;

import java.util.Collections;
import java.util.List;

public class Nulls {

	String instanceVariable; // gets the value null

	void myMethod() {
		String localVariable; // doesn't get a default - must initialize local
								// variables
		localVariable = "foo";
		System.out.println(localVariable);

		System.out.println("my instance variable is " + instanceVariable);

		System.out.println("null's toString() method return " + instanceVariable == null);
		if (instanceVariable != null) {
			System.out.println("Not null!");
		} else {
			System.out.println("It's null!");
		}

		// System.out.println("null's toString() method returns " +
		// instanceVariable.toString());

		// Null Object Pattern
		String strValue = "";
		List<String> emptyList = Collections.emptyList(); // empty list

		System.out.println("Does anything happen");
		for (String string : emptyList) {
			System.out.println("I found " + string);
		}

		List<String> nullList = null;
		System.out.println("What about a null list");
		for (String string : nullList) {
			System.out.println("I found " + string);
		}

		// the way to do a comparison for something that could be null
		// instead of if (strValue.equals("foo")), do...
		if ("foo".equals(strValue)) {
			// do something
		} // prevents null pointer exception because you are calling the method
			// on a String

	}

	public static void main(String[] args) {

		Nulls myInstance = new Nulls();
		myInstance.myMethod();

	}

}
