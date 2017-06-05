package encapsulation;

public class PublicClass {

	public void publicMethod() {
	}
	
// can only be called by subclasses and classes in the same package
	protected void protectedMethod() {
	}

	// default (package) visibility
	void defaultMethod() {
	}

	private void privateMethod() {
	}

	public void methodThatCallsMethods() {
		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
	}
}
