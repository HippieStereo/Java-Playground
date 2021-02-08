package pkg_one.sort.quick;

import java.util.Arrays;

public class RunQuickSort {

	public static void main(String[] args) {

		QuickSort theSort = new QuickSort(10);
		
		theSort.generateRandomArray();
		
		System.out.println(Arrays.toString(QuickSort.theArray));
		
		theSort.quickSort(0, 9);
		
		System.out.println(Arrays.toString(QuickSort.theArray));		
		
	}

}
