package pkg_one.linklist.one;

public class LinkList {

	public Link firstLink;
	
	public LinkList() {

		this.firstLink = null;
		
	}
	
	public boolean isEmpty() {
		
		return(this.firstLink == null);
		
	}
	
	public void insertFirstLink(String bookName, int millionsSold) {
		
		Link newLink = new Link(bookName, millionsSold);
		
		newLink.nextLink = this.firstLink;
		
		this.firstLink = newLink;
		
	}
	
	public Link removeFirst() {
		
		Link linkReference = this.firstLink;
		
		if(!isEmpty()) {
			
			this.firstLink = firstLink.nextLink;
			
		} else {
			
			System.out.println("Linklist empty !!!");
			
		}
		
		return linkReference;
		
	}
	
	public void display() {
		
		Link theLink = this.firstLink;
		
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
				
				if(theLink.nextLink == null) {
					
					return null;
					
				} else {
					
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
		
		while(currentLink.bookName != bookName) {
			
			if(currentLink.nextLink == null) {
				
				return null;
				
			} else {
				
				previousLink = currentLink;
				
				currentLink = currentLink.nextLink;
				
			}
			
		}
		
		if(currentLink == firstLink) {
			
			firstLink = firstLink.nextLink;
			
		} else {
			
			previousLink.nextLink = currentLink.nextLink;
			
		}
		
		return currentLink;
		
	}
	
}
