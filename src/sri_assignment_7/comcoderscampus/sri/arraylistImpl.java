package sri_assignment_7.comcoderscampus.sri;

public class arraylistImpl {
	// Insert amount of elements to add to the array:
	private static int AMOUNT = 160;

	// Insert the size of the array for testing:
	private static int ARRAY_SIZE = 160;

	public static void main(String[] args) {

		// Create an array and add AMOUNT of elements to it:
		CustomArrayList<String> list = new CustomArrayList<String>();
		for (int i = 1; i <= AMOUNT; i++) {
			list.add("Item " + i);
		}

		// Print out the array based on dynamic array current size:
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.println(list.get(i));
		}

	}

	public void arrayListImpl() {
		System.out.println("Hello there man");
	}

}
