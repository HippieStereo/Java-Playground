package pkg_one.sort.bubble;

import pkg_one.array.CreateArray;

public class BubbleSort_1 {
	
	int tempValue;
	
	// This bubble sort will sort everything from 
	// smallest to largest
	
	public void bubbleSort(int[] arrayIn, CreateArray createArray) {
		
		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted
		
		for(int j = arrayIn.length - 1; j > 1; j--) {
			
			// The inner loop starts at the beginning of 
			// the array and compares each value next to each 
			// other. If the value is greater then they are 
			// swapped
			
			for(int i = 0; i < arrayIn.length - 1; i++) {
				
				if(arrayIn[i] > arrayIn[i + 1]) {
					
					createArray.swapValuesArray(arrayIn, i, i + 1);
					
				}
				
			}
			
		}
		
	}
	
	// This bubble sort will sort everything from 
	// largest to smallest
	
	public void bubbleSortDescending(int[] arrayIn, CreateArray createArray){
		
		// i starts at the beginning of the array
		
		for(int i = 0; i < arrayIn.length; i++){
			
			// The inner loop starts at the beginning of 
			// the array 1 index in more than i. 
			
			for(int j = 1; j < (arrayIn.length - i); j++){
				
				// Here we check if the 1st index is less
				// than the next during the first run through
				// Then we just increase the indexes until
				// they have all been checked
				
				if(arrayIn[j-1] < arrayIn[j]){
					
					createArray.swapValuesArray(arrayIn, j-1, j);
					
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
