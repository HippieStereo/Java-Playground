package pkg.sort.selection;

import pkg.array.CreateArray;

public class RunSelectionSort {

	public static void main(String[] args) {

		CreateArray createArray = new CreateArray();
		SelectionSort_1 selectionSort_1 = new SelectionSort_1();

		// - make array
		int[] theArray = createArray.makeArray(10);
		
		createArray.generateRandomValues(theArray);
		
		System.out.println("ORIGINAL ARRAY");
		
		createArray.printArray(theArray);
		
		// - execution time
		long startTime_1 = System.nanoTime();
		
		// - sort array
		selectionSort_1.selectionSort(theArray, createArray);
		
		long endTime_1 = System.nanoTime();
		
		System.out.println("SELECTION SORT : " + (endTime_1 - startTime_1) + " / nanoseconds");
		
		createArray.printArray(theArray);
		
	}

}
