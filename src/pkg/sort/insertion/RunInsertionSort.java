package pkg.sort.insertion;

import pkg.array.CreateArray;

public class RunInsertionSort {

	public static void main(String[] args) {

		CreateArray createArray = new CreateArray();
		InsertionSort_1 insertionSort_1 = new InsertionSort_1();

		// - make array
		int[] theArray = createArray.makeArray(10);
		
		createArray.generateRandomValues(theArray);
		
		System.out.println("ORIGINAL ARRAY");
		
		createArray.printArray(theArray);
		
		// - execution time
		long startTime_1 = System.nanoTime();
		
		// - sort array
		insertionSort_1.insertionSort(theArray);
		
		long endTime_1 = System.nanoTime();
		
		System.out.println("INSERTION SORT : " + (endTime_1 - startTime_1) + " / nanoseconds");
		
		createArray.printArray(theArray);
		
	}

}
