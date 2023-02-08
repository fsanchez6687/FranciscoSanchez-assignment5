

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10]; 
	int size = 0; 

	@Override
	public boolean add(T item) { 
		if (size == items.length) { 
			items = doubleSizeOfBackingArray();	
		}										
		items[size] = item;
		size++; // 
		return true; 
	}

	public Object[] doubleSizeOfBackingArray() { 
		Object[] newArray = new Object[size * 2]; 
		for (int i = 0; i < size; i++) { 						
			newArray[i] = items[i];
		}
		return newArray; 
	}

	@Override
	public int getSize() {
		return size;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException { 
		if (index >= size)	
			throw new IndexOutOfBoundsException("The index, " + index + ", is out of the bounds of the array with size " + size);

		return (T) items[index]; 
	}

}