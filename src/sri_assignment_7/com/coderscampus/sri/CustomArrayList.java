package sri_assignment_7.com.coderscampus.sri;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private Integer size = 0;
	private Integer index = 0;
	private Integer array_multiplier = 1;

	@Override
	public boolean add(T item) {
		if (size >= 10*array_multiplier) {
			
			// Increase size of array by 2 if array is full:
			Object[] newItems = new Object[size * 2];
			
			// Copy items from array to new bigger array:
			int newIndex = 0;
			for (int i = 0; i < size; i++) {
				newItems[newIndex] = items[i];
				newIndex++;
			}
			
			// Update private variables to updated values:
			items = newItems;
			index = newIndex;

			// Update next trigger condition variable:
			array_multiplier *= 2;
		}
		
		// For all calls, add to array and update tracking variables:
		items[index++] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public T get(int ind) throws IndexOutOfBoundsException {
		if (ind > index) throw new IndexOutOfBoundsException();
		return (T) items[ind];
	}

	@Override
	public boolean add(int ind, T item) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (ind > index) throw new IndexOutOfBoundsException();
		return true;
	}

	@Override
	public T remove(int ind) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (ind > index) throw new IndexOutOfBoundsException();
		return null;
	}

}
