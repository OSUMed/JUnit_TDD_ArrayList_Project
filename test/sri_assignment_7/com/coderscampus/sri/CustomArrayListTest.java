package sri_assignment_7.com.coderscampus.sri;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	// Insert amount of elements to add to the array:

	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make test pass
	// Step 3 - Refactor code
	// repeat with new test

	// Arrange
	// Act
	// Assert

	// Next 3: Checks for dynamic array size changes for add() versions:
	@Test
	void should_increase_size_by_one_when_one_item_added() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	void should_increase_size_to_eleven_when_eleven_items_added() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 1; i < 12; i++) {
			sut.add(10);
		}
		Integer expectedResult = sut.get(10);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(11, expectedSize);
	}

	@Test
	void should_increase_size_to_twenty_one_when_twenty_one_items_added() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		for (int i = 1; i < 22; i++) {
			sut.add(10);
		}
		Integer expectedResult = sut.get(20);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(21, expectedSize);
	}

	
	// Next 5: Checks for return values for all functions(first 2 similar, delete?)
	@Test
	void should_return_true_when_one_item_added_to_list() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		Boolean expectedResult = sut.add(10);
		Integer size_after_addition = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(1, size_after_addition);
		assertEquals(true, expectedResult);
	}

	@Test
	void should_return_true_and_increase_size_to_two_when_item_added_at_index_zero() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(1);
		Boolean expectedResult = sut.add(0, 10);
		Integer size_after_addition = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(2, size_after_addition);
		assertEquals(true, expectedResult);
	}

	@Test
	void should_return_correct_value_when_item_removed_at_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);
		Integer removed_value = sut.remove(0);
		Integer size_after_removeal = sut.getSize();

		// Assert: Item is removed only if size is reflected to that change too:
		assertEquals(0, size_after_removeal);
		assertEquals(10, removed_value);
	}

	@Test
	void should_return_true_when_item_added_at_specified_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(5);
		Boolean result = sut.add(0, 10);

		// Assert: 
		assertEquals(10, sut.get(0));
		assertEquals(5, sut.get(1));
		assertEquals(true, result);
	}

	@Test
	void should_return_true_when_item_added_without_specified_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		Boolean result = sut.add(10);

		// Assert: Integer is in the first index of customList
		assertEquals(10, sut.get(0));
		assertEquals(true, result);
	}

	// Next 4: Checks if exceptions are thrown for the methods:
	@Test
	void should_throw_exception_when_getting_at_index_out_of_bounds() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);

		// Assert: Integer is in the first index of customList
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.get(3);
		});
	}

	@Test
	void should_throw_exception_when_adding_at_out_of_bounds_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);

		// Assert: Integer is in the first index of customList
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.add(3, 3);
		});
	}

	@Test
	void should_throw_exception_when_removing_at_out_of_bounds_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);

		// Assert: Integer is in the first index of customList
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.remove(3);
		});
	}

	@Test
	void should_throw_exception_when_removing_at_negative_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);

		// Assert: Integer is in the first index of customList
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.remove(-3);
		});
	}

	// Next 2: if default functions work- getSize() and get():
	@Test
	void should_return_correct_size_after_one_item_added() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(1, expectedSize);
	}

	@Test
	void should_return_correct_value_when_getting_value_at_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		Integer number = 0;
		for (int i = 1; i < 10; i++) {
			sut.add(number++);
		}
		Integer expectedResult = sut.get(5);

		// Assert: 5th index should be number 5:
		assertEquals(5, expectedResult);
	}

	// Next 3: Checks if arrays are adjusting to right sizes dynamically for
	// add/remove:
	@Test
	void should_increase_array_size_by_factor_of_two_when_items_added() {
		// Arrange:
		Integer ind = 0;
		Integer amount = 8;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= amount; ind++) {
			sut.add(indexMessagePrint(ind));
		}
		printArray(sut, "Initial");

		sut.add(indexMessagePrint(ind));
		ind++;
		sut.add(indexMessagePrint(ind));
		ind++;

		printArray(sut, "\nAdded 2 items");
		Integer initial_size = sut.getItemArrayLength();

		sut.add(indexMessagePrint(ind));
		ind++;
		printArray(sut, "\nAdded 1 items -> Array * 2");
		Integer final_size = sut.getItemArrayLength();

		Integer expectedResult = final_size / initial_size;

		// Assert: 5th index should be number 5:
		assertEquals(2, expectedResult);
	}

	@Test
	void should_increase_array_size_by_factor_of_two_when_item_added_at_index() {
		// Arrange:
		Integer ind = 0;
		Integer amount = 8;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= amount; ind++) {
			sut.add(indexMessagePrint(ind));
		}
		printArray(sut, "Initial");

		sut.add(indexMessagePrint(ind));
		ind++;
		sut.add(indexMessagePrint(ind));
		ind++;

		printArray(sut, "\nAdded 2 items");
		Integer initial_size = sut.getItemArrayLength();

		sut.add(5, indexMessagePrint(ind));
		ind++;
		printArray(sut, "\nAdded 1 items -> Array * 2");
		Integer final_size = sut.getItemArrayLength();

		Integer expectedResult = final_size / initial_size;

		// Assert: 5th index should be number 5:
		assertEquals(2, expectedResult);
	}

	@Test
	void should_decrease_array_size_by_factor_of_two_when_item_removed() {
		// Arrange:
		Integer ind = 0;
		Integer amount = 8;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= amount; ind++) {
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
		Integer initial_size = sut.getItemArrayLength();
		printArray(sut, "\nAdded 1 items -> Array * 2");

		sut.remove(3);
		printArray(sut, "\nRemoved 1 item -> Array / 2");

		Integer final_size = sut.getItemArrayLength();
		System.out.println("initial is: " + initial_size);
		System.out.println(final_size);
		Integer expectedResult = initial_size / final_size;

		// Assert: 5th index should be number 5:
		assertEquals(2, expectedResult);
	}

	// Next 2: Check if when adding and removing from middle, the order is kept:
	@Test
	void should_preserve_order_when_item_removed_from_middle() {
		// Arrange:
		Integer ind = 0;
		Integer amount = 12;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= amount; ind++) {
			sut.add(indexMessagePrint(ind));
		}

		
		// Act
		// Here we remove index 3(thus value "Item 3" so it will go from 2 -> 4:
		sut.remove(3);

		// Object should equal like below after adding it at index 4:
		Object[] answer = new Object[20];
		Object[] items = sut.getItems();

		answer[0] = "Item 0";
		answer[1] = "Item 1";
		answer[2] = "Item 2";
		answer[3] = "Item 4"; // "Item 3" was removed
		answer[4] = "Item 5";
		answer[5] = "Item 6";
		answer[6] = "Item 7";
		answer[7] = "Item 8";
		answer[8] = "Item 9";
		answer[9] = "Item 10";
		answer[10] = "Item 11";

		// Assert: 
		assertArrayEquals(answer, items);
	}

	@Test
	void should_preserve_order_when_item_added_in_middle() {
		// Arrange:
		Integer ind = 0;
		Integer amount = 12;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= amount; ind++) {
			sut.add(indexMessagePrint(ind));
		}

		sut.add(4, "Add in the middle");

		// Object should equal like below after adding it at index 4:
		Object[] answer = new Object[20];
		Object[] items = sut.getItems();

		answer[0] = "Item 0";
		answer[1] = "Item 1";
		answer[2] = "Item 2";
		answer[3] = "Item 3"; 
		answer[4] = "Add in the middle";
		answer[5] = "Item 4";
		answer[6] = "Item 5";
		answer[7] = "Item 6";
		answer[8] = "Item 7";
		answer[9] = "Item 8";
		answer[10] = "Item 9";
		answer[11] = "Item 10";
		answer[12] = "Item 11";

		// Assert: 5th index should be number 5:
		assertArrayEquals(items, answer);

	}

	// Helper Functions for printing/debugging:
	public static String indexMessagePrint(Integer ind) {
		return "Item " + (ind - 1);
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
