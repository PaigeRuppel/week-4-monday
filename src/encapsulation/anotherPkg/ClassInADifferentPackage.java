package encapsulation.anotherPkg;

import encapsulation.PublicClass;

public class ClassInADifferentPackage {
	public void methodThatCallsMethod() {
		PublicClass target = new PublicClass();
		
		target.publicMethod();
//		target.protectedMethod(); // can't be called because this is not a subclass or in the same package
//		target.defaultMethod(); // can't be called because we are in a different package
//		target.privateMethod(); // can't be called because only PublicClass can see it
	}

}
