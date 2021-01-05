package pkg_one.linklist.two;

public class NeighborIterator {
	
	public Neighbor currentNeighbor;
	public Neighbor previousNeighbor;
	
	public DoubleEndedLinkedList theNeighbors;
	
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
		
		if(previousNeighbor == null) {
			
			theNeighbors.firstLink = currentNeighbor.next;
			
		} else {
			
			previousNeighbor.next = currentNeighbor.next;
			
			if(currentNeighbor.next == null) {
				
				currentNeighbor = theNeighbors.firstLink;
				previousNeighbor = null;
				
			} else {
				
				currentNeighbor = currentNeighbor.next;
				
			}
			
		}
		
	}

}
