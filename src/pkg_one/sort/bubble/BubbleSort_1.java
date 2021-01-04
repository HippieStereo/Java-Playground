package pkg_one.sort.bubble;

import pkg_one.array.CreateArray;

public class BubbleSort_1 {
	
	int tempValue;
	
	public void bubbleSort(int[] arrayIn, CreateArray createArray) {
		
		for(int j = arrayIn.length - 1; j > 1; j--) {
			
			for(int i = 0; i < arrayIn.length - 1; i++) {
				
				if(arrayIn[i] > arrayIn[i + 1]) {
					
					createArray.swapValuesArray(arrayIn, i, i + 1);
					
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {

		CreateArray createArray = new CreateArray();
		BubbleSort_1 bubbleSort_1 = new BubbleSort_1();

		// - make array
		int[] theArray = createArray.makeArray(10);
		
		createArray.generateRandomValues(theArray);
		
		createArray.printArray(theArray);
		
		// - execution time
		long startTime = System.nanoTime();
		
		bubbleSort_1.bubbleSort(theArray, createArray);
		
		long endTime = System.nanoTime();
		
		createArray.printArray(theArray);
		
		System.out.println("EXECUTION TIME : " + (endTime - startTime) + " / nanoseconds");
		
	}

}
