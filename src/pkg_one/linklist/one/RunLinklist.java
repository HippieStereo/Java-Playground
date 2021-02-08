package pkg_one.linklist.one;

public class RunLinklist {

	public static void main(String[] args) {

		LinkList theLinkedList = new LinkList();
		
		theLinkedList.insertFirstLink("Book 1", 111);
		theLinkedList.insertFirstLink("Book 2", 222);
		theLinkedList.insertFirstLink("Book 3", 333);
		theLinkedList.insertFirstLink("Book 4", 444);
		
		theLinkedList.display();
		
		theLinkedList.removeFirst();
		
		System.out.println();
		
		theLinkedList.display();
		
		System.out.println(theLinkedList.find("Book 2").bookName + " was found !!!");
		
		theLinkedList.removeLink("Book 2");
		
		System.out.println();
		
		theLinkedList.display();
		
	}

}