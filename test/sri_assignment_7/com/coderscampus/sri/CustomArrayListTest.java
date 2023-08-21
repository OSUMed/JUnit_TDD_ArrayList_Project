package sri_assignment_7.com.coderscampus.sri;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CustomArrayListTest {
	// Step 1 - Write a failing test
	// Step 2 - Write the business logic to make test pass
	// Step 3 - Refactor code
	// repeat with new test
	
	// Arrange
	// Act
	// Assert
	
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
		assertEquals(1,  expectedSize);
	}
	
	@Test
	void should_add_11_items_to_list() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		for (int i=1; i < 12; i++) {
			sut.add(10);
		}
		Integer expectedResult = sut.get(10);
		Integer expectedSize = sut.getSize();
		
		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(11,  expectedSize);
	}
	
	@Test
	void should_add_21_items_to_list() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		for (int i=1; i < 22; i++) {
			sut.add(10);
		}
		Integer expectedResult = sut.get(20);
		Integer expectedSize = sut.getSize();
		
		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(21,  expectedSize);
	}
	
	@Test
	void should_return_true_with_add_1_item() {
		// Arrange:
		CustomList<Integer> sut = new CustomArrayList<>();
		
		// Act
		Boolean expectedResult = sut.add(10);
		
		// Assert: Integer is in the first index of customList
		assertEquals(true, expectedResult);
	}
	
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
		for (int i=1; i < 10; i++) {
			sut.add(number++);
		}
		Integer expectedResult = sut.get(5);
		
		// Assert: 5th index should be number 5:
		assertEquals(5, expectedResult);
	}
	

}
