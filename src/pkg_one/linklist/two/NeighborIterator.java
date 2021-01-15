package pkg_one.linklist.two;

//An iterator provides an easy way to cycle through all
//the objects in a LinkedList

public class NeighborIterator {
	
	public Neighbor currentNeighbor;
	public Neighbor previousNeighbor;
	
	public DoubleEndedLinkedList theNeighbors;
	
	// hasNext, next, remove are common iterator methods
	
	public NeighborIterator(DoubleEndedLinkedList theNeighbors) {

		this.theNeighbors = theNeighbors;
		currentNeighbor = theNeighbors.firstLink;
		previousNeighbor = theNeighbors.lastLink;
	
	}
	
	public boolean hasNext() {
		
		if(currentNeighbor.next != null) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public Neighbor next() {
		
		if(hasNext()) {
			
			previousNeighbor = currentNeighbor;
			currentNeighbor = currentNeighbor.next;
			
			return currentNeighbor;
			
		}
		
		return null;
		
	}
	
	public void remove() {
		
		// If at the beginning of the list
		
		if(previousNeighbor == null) {
			
			theNeighbors.firstLink = currentNeighbor.next;
			
		} else {
			
			previousNeighbor.next = currentNeighbor.next;
			
			// If at end of list
			
			if(currentNeighbor.next == null) {
				
				currentNeighbor = theNeighbors.firstLink;
				previousNeighbor = null;
				
			} else {
				
				currentNeighbor = currentNeighbor.next;
				
			}
			
		}
		
	}

}
