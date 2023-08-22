package sri_assignment_7.com.coderscampus.sri;

public class CustomArrayListImp {
	// Insert amount of elements to add to the array:
	private static int AMOUNT = 8;

	// Insert the size of the array for testing:
	private static int ARRAY_SIZE = 10;

	public static void main(String[] args) {

		// Create an array and add AMOUNT of elements to it:
		Integer ind = 0;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= AMOUNT; ind++) {
			sut.add(indexMessagePrint(ind));
		}
		printArray(sut, "Initial");

		sut.add(indexMessagePrint(ind));
		ind++;
		sut.add(indexMessagePrint(ind));
		ind++;

		printArray(sut, "\nAdded 2 items");
		
		sut.add(indexMessagePrint(ind));
		ind++;
		printArray(sut, "\nAdded 1 items -> Array * 2");

		sut.remove(3);
		printArray(sut, "\nRemoved 1 item -> Array / 2");
		
		System.out.println("\nRepeat with the add(index, value) function! ");
		// Repeat  for add(index, value):
		ind = 0;
		sut = new CustomArrayList<String>();
		for (ind = 1; ind <= AMOUNT; ind++) {
			sut.add(ind-1, indexMessagePrint(ind));
		}
		printArray(sut, "Initial");

		sut.add(ind-1, indexMessagePrint(ind));
		ind++;
		sut.add(ind-1, indexMessagePrint(ind));
		ind++;

		printArray(sut, "\nAdded 2 items");
		
		sut.add(ind-1, indexMessagePrint(ind));
		ind++;
		printArray(sut, "\nAdded 1 items -> Array * 2");

		sut.remove(3);
		printArray(sut, "\nRemoved in the middle 1 item -> Array / 2");
		
		sut.add(4, "Add in the middle");
		printArray(sut, "\nAdded in the middle 1 item -> Array / 2");
		sut.add(3, "Add in the middle");
		printArray(sut, "\nAdded in the middle 1 item again-> Array / 2");
	}
	
	public static String indexMessagePrint(Integer ind) {
		return "Item " + (ind-1);
	}

	public static void printArray(CustomArrayList<String> sut, String message) {
		// Print out the array based on dynamic array current size:
		System.out.println(message);
		System.out.println("Array size is: " + sut.getItemArrayLength());
		System.out.println("Current Last Index is: " + sut.getCurrentLastIndex());
		for (int i = 1; i <= sut.getItemArrayLength(); i++) {
			if (i - 1 > sut.getCurrentLastIndex()) {

				System.out.println("Null index error thrown " + (i - 1));
			} else {

				System.out.println(sut.get(i - 1));
			}
		}
	}

}
