package pkg_one.queue;

import java.util.Arrays;

public class TheQueue {
	
	private String[] queueArray;
	private int queueSize;
	
	// Sets stack as empty
	
	private int front, rear, numberOfItems = 0;
	
	public TheQueue(int size) {

		queueSize = size;
		
		queueArray = new String[size];
		
		// Assigns the value of -1 to every value in the array
		// so I control what gets printed to screen
		
		Arrays.fill(queueArray, "-1");
		
	}
	
	public void insertOne(String strIn) {
		
		if(numberOfItems + 1 <= queueSize) {
			
			queueArray[rear] = strIn;
			
			System.out.println("Queue insert : " + queueArray[rear] + " in index : " + rear);
			
			rear++;
			
			numberOfItems++;
			
			
		} else {
			
			System.out.println("Queue is full !!!");
			
		}
		
	}
	
	// This priority insert will add items in order from high to low
	
	public void priorityInsert(String strIn) {
		
		int i = 0;
		
		if(numberOfItems == 0) {
			
			insertOne(strIn);
			
		} else {
			
			for (i = numberOfItems; i >= 0; i--) {
				
				if(Integer.parseInt(strIn) > Integer.parseInt(queueArray[i])) {
					
					queueArray[i+1] = queueArray[i];
					
				} else break; // Done shifting items in queue
				
			}
			
			queueArray[i + 1] = strIn;
			
			rear++;
			
			numberOfItems++;
			
		}
		
	}
	
	public void removeOne() {
		
		if(numberOfItems > 0) {
			
			System.out.println("Queue remove : " + queueArray[front] + " in index / front : " + front);
			
			// Just like in memory an item isn't deleted, but instead is just not available
			
			queueArray[front] = "-1";
			
			front++;
			
			numberOfItems--;
			
		} else {
			
			System.out.println("Queue is empty !!!");
			
		}
		
	}
	
	public void peekOne() {
		
		System.out.println("Peek the first element is : " + queueArray[front]);
		
	}
	
	public void printQueue() {
		
		System.out.println("\nPRINT QUEUE\n" + Arrays.toString(queueArray) + "\n");
		
	}

}
