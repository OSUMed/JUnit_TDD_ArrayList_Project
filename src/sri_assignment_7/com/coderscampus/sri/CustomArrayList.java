package sri_assignment_7.com.coderscampus.sri;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private Integer current_last_ind = 0;
	private Integer size = 0;

	@Override
	public boolean add(T item) {
		if (items.length == size) {
			items = Arrays.copyOf(items, items.length * 2);
//			expandBackingObjectArray();
		}
		
		// For all calls, add to array and update tracking variables:
		items[size] = item;
		current_last_ind = size;
		size++;
		return true;
	}
	
	public Integer getItemArrayLength() {
		return items.length;
	}
	public Integer getCurrentLastIndex() {
		return current_last_ind;
	}
	public Object[] getItems() {
		return items;
	}

	@Override
	public int getSize() {
		// We want to return the size, not the last index(size - 1):
		return this.size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index > current_last_ind) throw new IndexOutOfBoundsException();
		return (T) items[index];
	}
	
	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		// Throw if new index is not before or at end of the list:
		if (index > current_last_ind+1) throw new IndexOutOfBoundsException();
		
		if (items.length == size) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		
		// start at last index+1 -> index right of index to add
		for (int i = current_last_ind+1; i > index; i--) {
			items[i] = items[i-1];
		}
		
		// arr[index] = item since we created a hole
		items[index] = item;
		current_last_ind = size;
		size++;
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if (index > current_last_ind || index < 0) throw new IndexOutOfBoundsException();
		T removed_value = null;
		// For debugging:
		// from index, arr[i] = arr[i+1] until end of list
		// stop at size-1 so we grab the last index with i+1 only
		//				     x                              x
		// 0 1 2 3 4 5 6 7 8 9  10 11 12 13 14 15 16 17 18 19 20 
		// 0 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 
		//           x
		// i = 20 -> size 20 -> 2x array
		// remove 1 item -> size 19 -> 1/2 array
		
		// Iterate to right before current_last_ind so last i+1 value is
		// current_last_ind. 
		removed_value = (T) items[index];
		for (int i = index; i < current_last_ind; i++) {
			items[i] = items[i+1];
		}
		// remove last index since we shifted left and update variables:
		items[current_last_ind] = null;
		current_last_ind--;
		size--;
		// check if items.length() is half of size. If so, reduce 
		// array by size 2. last ind + 1 because 0 based:
		if (items.length/2 == current_last_ind+1) {
			items = Arrays.copyOf(items, items.length / 2);
		} 
		
		return (T)removed_value;
	}

}
