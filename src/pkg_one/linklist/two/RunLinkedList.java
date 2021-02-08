package pkg_one.linklist.two;

public class RunLinkedList {

	public static void main(String[] args) {

		DoubleEndedLinkedList theLinkList_1 = new DoubleEndedLinkedList();
		
		theLinkList_1.insertInFirstPosition("Name 1", 1);
		theLinkList_1.insertInFirstPosition("Name 2", 2);
		theLinkList_1.insertInLastPosition("Name 3", 3);
		theLinkList_1.insertInFirstPosition("Name 4", 4);
		
		theLinkList_1.display();
		
		System.out.println("-----\n");
		
		DoubleEndedLinkedList theLinkList_2 = new DoubleEndedLinkedList();
		
		theLinkList_2.insertInOrder("Name 1", 1);
		theLinkList_2.insertInOrder("Name 4", 4);
		theLinkList_2.insertInOrder("Name 3", 3);
		theLinkList_2.insertInOrder("Name 2", 2);
		theLinkList_2.insertAfterKey("After Key", 10, 2);
		
		theLinkList_2.display();
		
		System.out.println("-----\n");
		
		// Send the LinkedList to the iterator
		
		NeighborIterator neighbors = new NeighborIterator(theLinkList_2);
		
		// Get the first neighbor and display
		
		neighbors.currentNeighbor.display();
		
		// Is there another?
		
		System.out.println(neighbors.hasNext());
		
		// Switch to the next Neighbor
		
		neighbors.next();
		
		neighbors.currentNeighbor.display();
		
		neighbors.remove();
		
		neighbors.currentNeighbor.display();

	}

}
