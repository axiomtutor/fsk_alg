package arrays;

import java.util.Iterator;

public interface List<E> {
	
	// Return the head of the list and remove it.
	public E pop(); 
	
	// Push item onto the head of the list and return it.
	public E push(E item);   
	
	// Get the ith item from the list.
	public E get(int i);
	
	// Set the ith coordinate to hold item, and return what
	// once was located there.
	public E set(int i, E item);
	
	// Return an iterator over the list.
	public Iterator<E> iterator();
}
