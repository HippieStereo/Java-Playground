package pkg.search.binary;

public class BinarySearch_1 {

	public void binarySearchNormal(int[] arrayIn, int valueIn) {
		
		int lowIndex = 0;
		int hightIndex = arrayIn.length - 1;
		
		while(lowIndex <= hightIndex) {
			
			int middleIndex = (hightIndex + lowIndex) / 2;
			
			if(arrayIn[middleIndex] < valueIn) {
				
				lowIndex = middleIndex + 1;
				
			} else if(arrayIn[middleIndex] > valueIn) {
				
				hightIndex = middleIndex - 1;
				
			} else {
				
				System.out.println("\nFound a Match for " + valueIn + " at Index " + middleIndex);
				
				lowIndex = hightIndex + 1;
				
			}
			
		}
		
	}
	
	public boolean binarySearchRecursive(int[] arrayIn, int valueIn, int leftIndex, int rightIndex) {
		
		if(leftIndex < rightIndex) {
			
			return false;
			
		}
		
		int midIndex = leftIndex + ((rightIndex - leftIndex) / 2);
		
		if(arrayIn[midIndex] == valueIn){
			
			return true;
			
		} else if(valueIn < arrayIn[midIndex]) {
			
			return binarySearchRecursive(arrayIn, valueIn, leftIndex, midIndex - 1);
			
		} else {
			
			return binarySearchRecursive(arrayIn, valueIn, midIndex + 1, rightIndex);
			
		}
		
	}
	
	public boolean binarySearchRecursive(int[] arrayIn, int valueIn) {
		
		return binarySearchRecursive(arrayIn, valueIn, 0, arrayIn.length - 1);
		
	}

}
