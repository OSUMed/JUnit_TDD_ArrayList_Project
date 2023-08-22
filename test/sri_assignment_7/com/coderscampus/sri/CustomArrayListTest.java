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

	// First 4 check the add(T item) method:

	// Next 6: Checks for dynamic array size changes for both add() method versions:
	@Test
	void should_add_one_item_to_list() {
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
	void should_add_11_items_to_list() {
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
	void should_add_21_items_to_list() {
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

	@Test
	void should_add_one_item_to_list_with_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(0, 10);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
	}

	@Test
	void should_add_11_items_to_list_with_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();
		Integer index = 0;
		// Act
		for (int i = 1; i < 12; i++) {
			sut.add(index++, 10);
		}
		Integer expectedResult = sut.get(10);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(11, expectedSize);
	}

	@Test
	void should_add_21_items_to_list_with_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();
		Integer index = 0;
		// Act
		for (int i = 1; i < 22; i++) {
			sut.add(index++, 10);
		}
		Integer expectedResult = sut.get(20);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(21, expectedSize);
	}

	// Next 5: Checks for return values for all functions(first 2 similar, delete?)
	@Test
	void should_return_true_with_add_1_item() {
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
	void should_return_true_with_add_1_item_at_index_0() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		Boolean expectedResult = sut.add(0, 10);
		Integer size_after_addition = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(1, size_after_addition);
		assertEquals(true, expectedResult);
	}
	
	@Test
	void should_return_actual_item_removed_from_list() {
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
	void should_return_true_when_item_added_with_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		Boolean result = sut.add(0, 10);

		// Assert: Integer is in the first index of customList
		assertEquals(true, result);
	}

	@Test
	void should_return_true_when_item_added_without_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		Boolean result = sut.add(10);

		// Assert: Integer is in the first index of customList
		assertEquals(true, result);
	}

	// Next 5: Checks if exceptions are thrown for the methods: 
	@Test
	void should_return_out_of_bounds_exception_for_get_index() {
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
	void should_return_out_of_bounds_exception_for_add_with_index() {
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
	void should_not_return_out_of_bounds_exception_if_index_added_is_at_new_end_of_list() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(5);

		// Assert: Integer is in the first index of customList
		assertDoesNotThrow(() -> {
			sut.add(1, 4);
		});
	}

	@Test
	void should_return_out_of_bounds_exception_for_remove_at_index() {
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
	void should_return_out_of_bounds_exception_for_remove_at_negative_index() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);

		// Assert: Integer is in the first index of customList
		assertThrows(IndexOutOfBoundsException.class, () -> {
			sut.remove(-3);
		});
	}
	
	// Next 2: if default functions work- getSize() and get()
	@Test
	void should_return_size_1_with_add_1_item() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();

		// Act
		sut.add(10);
		Integer expectedSize = sut.getSize();

		// Assert: Integer is in the first index of customList
		assertEquals(1, expectedSize);
	}

	@Test
	void should_return_correct_value_at_index_5() {
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

	// Next 3: Checks if arrays are adjusting to right sizes dynamically for add/remove:
	@Test
	void should_increase_array_list_size_by_two() {
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
	void should_increase_array_list_size_by_two_for_add_with_index() {
		// Arrange:
		Integer ind = 0;
		Integer amount = 8;
		CustomArrayList<String> sut = new CustomArrayList<String>();
		for (ind = 1; ind <= amount; ind++) {
			sut.add(ind - 1, indexMessagePrint(ind));
		}
		printArray(sut, "Initial");

		sut.add(ind - 1, indexMessagePrint(ind));
		ind++;
		sut.add(ind - 1, indexMessagePrint(ind));
		ind++;

		printArray(sut, "\nAdded 2 items");
		Integer initial_size = sut.getItemArrayLength();

		sut.add(ind - 1, indexMessagePrint(ind));
		ind++;
		printArray(sut, "\nAdded 1 items -> Array * 2");
		Integer final_size = sut.getItemArrayLength();

		Integer expectedResult = final_size / initial_size;

		// Assert: 5th index should be number 5:
		assertEquals(2, expectedResult);
	}

	@Test
	void should_decrease_array_list_size_by_two() {
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
