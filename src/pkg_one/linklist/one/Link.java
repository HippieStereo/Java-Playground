package pkg_one.linklist.one;

public class Link {
	
	public String bookName;
	public int millionsSold;
	public Link nextLink;
	
	public Link(String bookName, int millionsSold) {
		
		this.bookName = bookName;
		this.millionsSold = millionsSold;
		
	}
	
	public void display() {
		
		System.out.println(this.bookName + " : " + this.millionsSold + ",000,000");
		
	}
	
	@Override
	public String toString() {

		return this.bookName;
		
	}

}
