package pkg_one.linklist.two;

public class DoubleEndedLinkedList {

	Neighbor firstLink;
	Neighbor lastLink;
	
	public void insertInFirstPosition(String homeOwnerName, int houseNumber) {
		
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		// If no items in the list add the new Link
		// to lastLink in the LinkedList
		
		if(isEmpty()) {
			
			lastLink = theNewLink;
			
		} else {
			
			/* FOR DOUBLY LINKED LIST */
			
			firstLink.previous = theNewLink;
			
		} // END OF DOUBLY LINKED LIST ADDITION
		
		// DOUBLY LINKED LIST
		// Just like you can go forward in the list with next
		// with a doubly linked list you can go backwards
		// because it also has a previous as well as a next
			
		// Assign the reference to the previous 
		// firstLink and assign the new Link
		// to firstLink in LinkedList
		
		theNewLink.next = firstLink;
		
		firstLink = theNewLink;
		
	} 
	
	public void insertInLastPosition(String homeOwnerName, int houseNumber) {
		
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		// If empty put the new Neighbor in first position
		
		if(isEmpty()) {
			
			firstLink = theNewLink;
			
		} else {
			
			// Assign the last Neighbors next to the new Neighbor
			
			lastLink.next = theNewLink;
			
			// FOR DOUBLY LINKED LIST
			
			theNewLink.previous = lastLink;
			
		}

		lastLink = theNewLink;
		
	} 
	
	// DOUBLY LINKED LIST ADDITION
	// Insert after the provided key
	
	public boolean insertAfterKey(String homeOwnerName, int houseNumber, int key) {
		
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		// Starts search at first link
		
		Neighbor currentNeighbor = firstLink;
		
		// while the current houseNumber isn't the key keep looking
		
		while(currentNeighbor.houseNumber != key) {
			
			// Switch to the next Neighbor
			
			currentNeighbor = currentNeighbor.next;
			
			// If we get to the last Neighbor without a match leave the method
			
			if(currentNeighbor == null) {
				
				return false;
				
			}
			
		}
		
		// If we make it here we have a match for the key		
		// If the match was for the last Neighbor in the list
		
		if(currentNeighbor == lastLink) {
			
			// Assign the new Neighbor as the last link
			
			theNewLink.next = null;
			
			lastLink = theNewLink;
			
		} else {
			
			// It didn't match for the last link
			// So take next from the Neighbor that was 
			// here previously and assign theNewLink to
			// the previous Neighbor
			
			theNewLink.next = currentNeighbor.next;
			currentNeighbor.next.previous = theNewLink;
			
		}
		
		theNewLink.previous = currentNeighbor;
		currentNeighbor.next = theNewLink;
		
		return true;
		
	}
	
	// Inserts Neighbors in order based on house number
	
	public void insertInOrder(String homeOwnerName, int houseNumber) {
		
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		
		// Holds he last Neighbor searched so we can change 
		// its value for next if we input a new Neighbor
		
		Neighbor previousNeighbor = null;
		Neighbor currentNeighbor = firstLink;
		
		// While there are still Neighbors and the new houseNumber
		// is greater than the current focused houseNumber
		// Change the > to < for opposite sort
		
		while((currentNeighbor != null) && (houseNumber > currentNeighbor.houseNumber)) {
			
			previousNeighbor = currentNeighbor;
			
			// Get the next Neighbor
			
			currentNeighbor = currentNeighbor.next;
			
		}
		
		// We are still at the beginning of the list
		
		if(previousNeighbor == null) {
			
			// Save new Neighbor in the first position
			
			firstLink = theNewLink;
			
		} else {
			
			// Assign the new Neighbor as the value for next
			
			previousNeighbor.next = theNewLink;
			
		}
		
		// Assign the value of next to the next Neighbor
		
		theNewLink.next = currentNeighbor;
		
	}
	
	public boolean isEmpty() {
		
		return (firstLink == null);
		
	}
	
	public void display() {
		
		Neighbor theLink = firstLink;
		
		while(theLink != null) {
			
			theLink.display();
			
			System.out.println("Next Link : " + theLink.next);
			
			theLink = theLink.next;
			
			System.out.println();
			
		}
		
	}
	
}
