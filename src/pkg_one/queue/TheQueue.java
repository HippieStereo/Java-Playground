package pkg_one.queue;

import java.util.Arrays;

public class TheQueue {
	
	private String[] queueArray;
	private int queueSize;
	private int front, rear, numberOfItems = 0;
	
	public TheQueue(int size) {

		queueSize = size;
		
		queueArray = new String[size];
		
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
	
	public void priorityInsert(String strIn) {
		
		int i = 0;
		
		if(numberOfItems == 0) {
			
			insertOne(strIn);
			
		} else {
			
			for (i = numberOfItems; i >= 0; i--) {
				
				if(Integer.parseInt(strIn) > Integer.parseInt(queueArray[i])) {
					
					queueArray[i+1] = queueArray[i];
					
				} else break;
				
			}
			
			queueArray[i + 1] = strIn;
			
			rear++;
			
			numberOfItems++;
			
		}
		
	}
	
	public void removeOne() {
		
		if(numberOfItems > 0) {
			
			System.out.println("Queue remove : " + queueArray[front] + " in index / front : " + front);
			
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
