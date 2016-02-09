
/*
 * acts as the interface for the data structures
 */

public interface ObjectStackInterface {
	
	public boolean isEmpty();
	public boolean isFull();
	public void clear();
	public void push(Object o);
	public Object pop();
	public Object top(); 
	
}