package lectureexamples;

public class VirtualPet {

	private int hunger;

	// getters also violate encapsulation to a certain extent
	// want to limit knowledge about an object as much as possible
	// better to have methods that allow the class to determine information about its state
	public int getHunger() {
		return hunger;
	}

	// setters violate encapsulation by definition - can add some validation,
	// but it's not much different than
	// directly manipulating the instance variable from outside the class
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	// takeaway: do not treat objects like data structures because they are not data structures

	public void feed() {
		hunger -= 5;
	}
}
