package encapsulation;

public class SubClassInSamePkg extends PublicClass {
	
	public void methodThatCallsMethod() {
		publicMethod();
		protectedMethod(); // can call this because this is a subclass (even
							// though we are in a different package)
		defaultMethod(); // can't be called because we are in a different
							// package
//		privateMethod(); // can't be called because only PublicClass can
							// see it - not inherited by subclasses
	}
}
