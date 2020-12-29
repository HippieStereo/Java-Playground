package pkg.sort.insertion;

public class InsertionSort_1 {
	
	public void insertionSort(int[] arrayIn) {
		
		for (int i = 0; i < arrayIn.length; i++) {

			int j = i;

			int valueToInsert = arrayIn[i];

			while((j > 0) && (arrayIn[j - 1] > valueToInsert)) {
				
				arrayIn[j] = arrayIn[j - 1];
				
				j--;
				
			}
			
			arrayIn[j] = valueToInsert;
			
		}
		
	}

}
