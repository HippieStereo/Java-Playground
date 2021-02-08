package pkg_one.queue;

public class RunTheQueue {

	public static void main(String[] args) {
		
		TheQueue theQueue = new TheQueue(10);
		
		theQueue.insertOne("0");
		theQueue.insertOne("1");
		theQueue.insertOne("2");
		theQueue.insertOne("3");
		theQueue.printQueue();
		theQueue.removeOne();
		theQueue.printQueue();
		theQueue.peekOne();
		
		theQueue = new TheQueue(10);
		
		theQueue.priorityInsert("5");
		theQueue.priorityInsert("7");
		theQueue.priorityInsert("2");
		theQueue.priorityInsert("4");
		theQueue.printQueue();

	}

}
