package pkg.search.binary;

import pkg.array.CreateArray;
import pkg.sort.bubble.BubbleSort_2;

public class RunBinarySearch {
	
	public static void main(String[] args) {

		CreateArray createArray = new CreateArray();
		BubbleSort_2 bubbleSort_2 = new BubbleSort_2();
		BinarySearch_1 binarySearch_1 = new BinarySearch_1();

		// - make array
		int[] theArray = createArray.makeArray(10);
		
		createArray.generateRandomValues(theArray);
		
		// - execution time
		long startTime_1 = System.nanoTime();
		
		// - sort array
		bubbleSort_2.bubbleSort(theArray, createArray);
		
		createArray.printArray(theArray);
				
		long endTime_1 = System.nanoTime();
		
		System.out.println("BUBBLE SORT : " + (endTime_1 - startTime_1) + " / nanoseconds");
		
		// - execution time
		long startTime_2 = System.nanoTime();
		
		// - binary search normal
		int valueToFind = 15;
		
		binarySearch_1.binarySearchNormal(theArray, valueToFind);
		
		long endTime_2 = System.nanoTime();
		
		System.out.println("BINARY SEARCH TIME : " + (endTime_2 - startTime_2) + " / nanoseconds");
		
		// - binary search recursive
		long startTime_3 = System.nanoTime();
		
		System.out.println("BINARY SEARCH RECURSIVE FOR : " + valueToFind + " -> Result = " + binarySearch_1.binarySearchRecursive(theArray, valueToFind));
		
		long endTime_3 = System.nanoTime();
		
		System.out.println("BINARY SEARCH RECURSIVE TIME : " + (endTime_3 - startTime_3) + " / nanoseconds");
		
	}
	
}
