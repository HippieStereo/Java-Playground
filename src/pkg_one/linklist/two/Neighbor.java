package pkg_one.linklist.two;

public class Neighbor {
	
	public String homeOwnerName;
	public int houseNumber;
	
	public Neighbor next;
	
	// Used with Doubly Linked List
	
	public Neighbor previous;
	
	public Neighbor(String homeOwnerName, int houseNumber) {
		
		this.homeOwnerName = homeOwnerName;
		this.houseNumber = houseNumber;

	}
	
	public void display() {
		
		System.out.println(homeOwnerName + " : " + houseNumber + " Happy Street");
		
	}
	
	@Override
	public String toString() {
	
		return this.homeOwnerName;
		
	}

}
