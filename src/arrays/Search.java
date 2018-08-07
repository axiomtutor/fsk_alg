package arrays;

public interface Search<E> {
	
	// Perform a linear search for item, return the coordinate
	// if it is found or null otherwise.
	public int linSearch(E item);
	
	// Perform a binary search for item, return the coordinate
	// if it is found or null otherwise.  If E does not extend
	// Comparable<E>, throw an error.
	public int binSearch(E item);

}
