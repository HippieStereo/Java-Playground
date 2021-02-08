package pkg_one.sort.bubble;

import pkg_one.array.CreateArray;

public class BubbleSort_2 {

	int tempValue;

	public void bubbleSort(int[] arrayIn, CreateArray createArray) {

		boolean isSorted = false;

		int latestNotSorted = arrayIn.length - 1;

		while (!isSorted) {

			isSorted = true;

			for (int i = 0; i < latestNotSorted; i++) {

				if (arrayIn[i] > arrayIn[i + 1]) {

					createArray.swapValuesArray(arrayIn, i, i + 1);

					isSorted = false;

				}

			}

			latestNotSorted--;

		}

	}

	public static void main(String[] args) {

		CreateArray createArray = new CreateArray();
		BubbleSort_2 bubbleSort_2 = new BubbleSort_2();

		// - make array
		int[] theArray = createArray.makeArray(10);

		createArray.generateRandomValues(theArray);

		createArray.printArray(theArray);

		// - execution time
		long startTime = System.nanoTime();

		bubbleSort_2.bubbleSort(theArray, createArray);

		long endTime = System.nanoTime();

		createArray.printArray(theArray);

		System.out.println("EXECUTION TIME : " + (endTime - startTime) + " / nanoseconds");

	}

}
