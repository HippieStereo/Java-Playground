package pkg_one.sort.selection;

import pkg_one.array.CreateArray;

public class SelectionSort_1 {
	
	public void selectionSort(int[] arrayIn, CreateArray createArray) {
		
		for (int i = 0; i < arrayIn.length; i++) {
			
			int minimumIndex = i;
			
			for (int j = minimumIndex; j < arrayIn.length; j++) {
				
				if(arrayIn[minimumIndex] > arrayIn[j]) {
					
					minimumIndex = j;
					
				}
				
			}
			
			createArray.swapValuesArray(arrayIn, i, minimumIndex);
			
		}
		
	}

}
