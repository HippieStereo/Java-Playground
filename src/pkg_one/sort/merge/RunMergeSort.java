package pkg_one.sort.merge;

import java.util.Arrays;

public class RunMergeSort {

	public static void main(String[] args) {
		
		int[] array = {10,8,4,80,13,1,3,11};
		
		System.out.println("STARTING ARRAY\n");
		
		MergeSort.printHorzArray(-1, -1, array, 49);
		
		System.out.println();
		
		MergeSort.mergeSort_srt(array, 0, array.length - 1);
		
		System.out.println("FINAL SORTED ARRAY\n");
		
		MergeSort.printHorzArray(-1, -1, array, 49);

	}
	
}
