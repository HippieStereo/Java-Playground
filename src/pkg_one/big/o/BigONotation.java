package pkg_one.big.o;

import pkg_one.sort.quick.Partitioning;

public class BigONotation {
	
	private int[] theArray;

	private int arraySize;

	public int itemsInArray = 0;

	static long startTime;

	static long endTime;
	
	BigONotation(int size) {

		arraySize = size;

		theArray = new int[size];

	}
	
	// O(1) An algorithm that executes in the same
	// time regardless of the amount of data
	// This code executes in the same amount of
	// time no matter how big the array is
	
	public void addItemToArray(int newItem) {
		
		startTime = System.currentTimeMillis();
		
		theArray[itemsInArray++] = newItem;
		
		endTime = System.currentTimeMillis();
		
		System.out.println("TIME BIG O(N) : " + (endTime - startTime));
		
	}
	
	// 0(N) An algorithm thats time to complete will
	// grow in direct proportion to the amount of data
	// The linear search is an example of this

	// To find all values that match what we
	// are searching for we will have to look in
	// exactly each item in the array

	// If we just wanted to find one match the Big O
	// is the same because it describes the worst
	// case scenario in which the whole array must
	// be searched
	
	public void linearSearch(int value) {
		
		boolean valueInArray = false;
		String indexsWithValue = "";
		
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < theArray.length; i++) {
			
			if(theArray[i] == value) {
				
				valueInArray = true;
				indexsWithValue += i + " ";
				
			}
			
		}
		
		endTime = System.currentTimeMillis();
		
		if(valueInArray)
			System.out.println("Yes Found !!!");
		else
			System.out.println("Not Found !!!");
		
		System.out.println("TIME BIG O(N) : " + (endTime - startTime));
		
	}
	
	// O(N^2) Time to complete will be proportional to
	// the square of the amount of data (Bubble Sort)
	// Algorithms with more nested iterations will result
	// in O(N^3), O(N^4), etc. performance

	// Each pass through the outer loop (0)N requires us
	// to go through the entire list again so N multiplies
	// against itself or it is squared
	
	public void bubbleSort() {
		
		startTime = System.currentTimeMillis();
		
		for (int i = arraySize - 1; i > 1; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if(theArray[j] > theArray[j+1]) {
					
					swapValues(j, j+1);
					
				}
				
			}
			
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("TIME BIG O(N^2) : " + (endTime - startTime));
		
	}
	
	// O (log N) Occurs when the data being used is decreased
	// by roughly 50% each time through the algorithm. The
	// Binary search is a perfect example of this.

	// Pretty fast because the log N increases at a dramatically
	// slower rate as N increases

	// O (log N) algorithms are very efficient because increasing
	// the amount of data has little effect at some point early
	// on because the amount of data is halved on each run through
	
	public void binarySearchForValue(int value) {
				
		startTime = System.currentTimeMillis();
		
		int lowIndex = 0;
		int hightIndex = arraySize - 1;
		int timeThrough = 0;
		
		while(lowIndex <= hightIndex) {
			
			int middleIndex = (hightIndex + lowIndex) / 2;
			
			if(theArray[middleIndex] < value){
				
				lowIndex = middleIndex;
				
			} else if(theArray[middleIndex] > value) {
				
				hightIndex = middleIndex - 1;
				
			} else {
				
				System.out.println("Found match in index : " + middleIndex);
				
				lowIndex = hightIndex - 1;
				
			}
			
			timeThrough++;
			
		}
		
		endTime = System.currentTimeMillis();
		
		System.out.println("BINARY SERACH - BIG O(log N) : " + (endTime - startTime));
		System.out.println("Times through : " + timeThrough);
		
	}
	
	// O (n log n) Most sorts are at least O(N) because
	// every element must be looked at, at least once.
	// The bubble sort is O(N^2)
	// To figure out the number of comparisons we need
	// to make with the Quick Sort we first know that
	// it is comparing and moving values very
	// efficiently without shifting. That means values
	// are compared only once. So each comparison will
	// reduce the possible final sorted lists in half.
	// Comparisons = log n! (Factorial of n)
	// Comparisons = log n + log(n-1) + .... + log(1)
	// This evaluates to n log n
	
	public void quickSort(int left, int right) {
		
		if(right - left <= 0) {
			
			return;
			
		} else {
			
			int pivot = theArray[right];
			int pivotLocation = partitionArray(left, right, pivot);
			
			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
			
		}
		
	}
	
	public int partitionArray(int left, int right, int pivot) {
		
		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {

			while (theArray[++leftPointer] < pivot);

			while (rightPointer > 0 && theArray[--rightPointer] > pivot);

			if (leftPointer >= rightPointer) {

				break;

			} else {

				swapValues(leftPointer, rightPointer);

			}

		}

		swapValues(leftPointer, right);

		return leftPointer;
		
	}
	
	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 1000) + 10;

		}

		itemsInArray = arraySize - 1;

	}

	public void swapValues(int indexOne, int indexTwo) {

		int temp = theArray[indexOne];
		theArray[indexOne] = theArray[indexTwo];
		theArray[indexTwo] = temp;

	}

}
