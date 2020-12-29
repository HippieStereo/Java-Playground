package pkg.sort.insertion;

public class InsertionSort_1 {
	
	public void insertionSort(int[] arrayIn) {
		
		for (int i = 0; i < arrayIn.length; i++) {

			int tempIndex = i;

			int valueToInsert = arrayIn[i];

			while((tempIndex > 0) && (arrayIn[tempIndex - 1] > valueToInsert)) {
				
				arrayIn[tempIndex] = arrayIn[tempIndex - 1];
				
				tempIndex--;
				
			}
			
			arrayIn[tempIndex] = valueToInsert;
			
		}
		
	}

}
