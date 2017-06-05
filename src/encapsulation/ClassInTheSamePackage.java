package encapsulation;

public class ClassInTheSamePackage {
	public void methodThatCallsMethod() {
		PublicClass target = new PublicClass();
		
		target.publicMethod();
//		target.protectedMethod(); // can be called because we are in the same package (a subclass could also see it)
//		target.defaultMethod(); // can be called because we are in the same package
//		target.privateMethod(); // can't be called because only PublicClass can see it
	}

}
