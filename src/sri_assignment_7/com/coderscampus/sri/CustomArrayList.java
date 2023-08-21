package sri_assignment_7.com.coderscampus.sri;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private Integer size = 0;

	@Override
	public boolean add(T item) {
		if (items.length == size) {
			expandBackingObjectArray();
		}
		
		// For all calls, add to array and update tracking variables:
		items[size++] = item;
		return true;
	}
	
	private void expandBackingObjectArray() {
		Object[] oldArray = items;
		items = new Object[size*2];
		for (int i = 0; i < size; i++) {
			items[i] = oldArray[i];
		}
	}

	@Override
	public int getSize() {
		return this.size;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index > size) throw new IndexOutOfBoundsException();
		return (T) items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index > size) throw new IndexOutOfBoundsException();
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index > size) throw new IndexOutOfBoundsException();
		return null;
	}

}
