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
	
	private void reduceBackingObjectArray() {
		Object[] oldArray = items;
		items = new Object[size/2];
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
	
//	0 1 2 3
//	5
//	add(6,1)
//	5 6
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		// Throw if new index is above size or not at new end of list:
		if (index > size && index != size+1) throw new IndexOutOfBoundsException();
		
		// check if array needs to inc size 2:
		if (items.length == size) {
			expandBackingObjectArray();
		}
		
		
		// start at last index+1 -> index right of index to add
		
			// arr[i] = arr[i-1]
		
		// arr[index] = item since we created a hole
		
		
		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index > size || index < 0) throw new IndexOutOfBoundsException();
		
		// from index, arr[i] = arr[i+1] until end of list
		// stop at size-1 so we grab the last index with i+1 only
		for (int i = index; i <= size-1; i++) {
			items[i] = items[i+1];
		}
		
		// check if items.length() is half of size. If so, reduce 
		// array by size 2
		if (items.length/2 == size) {
			reduceBackingObjectArray();
		} 
		
		return null;
	}

}
