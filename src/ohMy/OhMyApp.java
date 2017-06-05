package ohMy;

public class OhMyApp {

	public static void main(String[] args) {

		OhMyIterator itr = new OhMyIterator();

		System.out.println("First element is " + itr.next());
		System.out.println("Does it have another element? " + itr.hasNext());

		while(itr.hasNext()) {
			System.out.println("Next value is " + itr.next());
		}
	}

}
