package pkg_one.linklist.one;

public class LinkList {
	
	// Reference to first Link in list
	// The last Link added to the LinkedList

	public Link firstLink;
	
	public LinkList() {

		// Here to show the first Link always starts as null
		
		this.firstLink = null;
		
	}
	
	public boolean isEmpty() {
		
		return(this.firstLink == null);
		
	}
	
	public void insertFirstLink(String bookName, int millionsSold) {
		
		Link newLink = new Link(bookName, millionsSold);
		
		// Connects the firstLink field to the new Link 
		
		newLink.nextLink = this.firstLink;
		
		this.firstLink = newLink;
		
	}
	
	public Link removeFirst() {
		
		Link linkReference = this.firstLink;
		
		if(!isEmpty()) {
			
			// Removes the Link from the List
			
			this.firstLink = firstLink.nextLink;
			
		} else {
			
			System.out.println("Linklist empty !!!");
			
		}
		
		return linkReference;
		
	}
	
	public void display() {
		
		Link theLink = this.firstLink;
		
		// Start at the reference stored in firstLink and
		// keep getting the references stored in next for
		// every Link until next returns null
		
		while(theLink != null) {
			
			theLink.display();
			
			System.out.println("Next link : " + theLink.nextLink);
			
			theLink = theLink.nextLink;
			
			System.out.println();
			
		}
		
	}
	
	public Link find(String bookName) {
		
		Link theLink = this.firstLink;
		
		if(!isEmpty()) {
			
			while(theLink.bookName != bookName) {
				
				// Checks if at the end of the LinkedList
				
				if(theLink.nextLink == null) {
					
					// Got to the end of the Links in LinkedList
					// without finding a match
					
					return null;
					
				} else {
					
					// Found a matching Link in the LinkedList
					
					theLink = theLink.nextLink;
					
				}
				
			}
			
		} else {
			
			System.out.println("Linklist empty !!!");
			
		}
		
		return theLink;
		
	}
	
	public Link removeLink(String bookName) {
		
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		// Keep searching as long as a match isn't made
		
		while(currentLink.bookName != bookName) {
			
			// Check if at the last Link in the LinkedList
			
			if(currentLink.nextLink == null) {
				
				// bookName not found so leave the method
				
				return null;
				
			} else {
				
				// We checked here so let's look in the
				// next Link on the list
				
				previousLink = currentLink;
				
				currentLink = currentLink.nextLink;
				
			}
			
		}
		
		if(currentLink == firstLink) {
			
			// If you are here that means there was a match
			// in the reference stored in firstLink in the
			// LinkedList so just assign next to firstLink
			
			firstLink = firstLink.nextLink;
			
		} else {
			
			// If you are here there was a match in a Link other 
			// than the firstLink. Assign the value of next for
			// the Link you want to delete to the Link that's 
			// next previously pointed to the reference to remove
			
			previousLink.nextLink = currentLink.nextLink;
			
		}
		
		return currentLink;
		
	}
	
}
