package encapsulation.anotherPkg;

import encapsulation.PublicClass;

// extends creates a subclass - inherits everything from parent class
public class SubClassofPublicClass extends PublicClass {

	public void methodThatCallsMethod() {
		
		publicMethod();
		protectedMethod(); // can call this because this is a subclass (even though we are in a different package)
//		defaultMethod(); // can't be called because we are in a different
								// package
//		privateMethod(); // can't be called because only PublicClass can
								// see it - not inherited by subclasses
	}
}
