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
		CustomList<Integer> customList = new CustomArrayList<>();
		
		// Act
		customList.add(10);
		Integer expectedResult = customList.get(0);
		Integer expectedSize = customList.getSize();
		
		// Assert: Integer is in the first index of customList
		assertEquals(10, expectedResult);
		assertEquals(1,  expectedSize);
	}

}
