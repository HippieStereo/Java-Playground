package pkg.array;

public class CreateArray {

	private int[] theArray;
	private int theArraySize;
	
	// - Create Array
	public int[] makeArray(int arraySize) {
		
		theArray = new int[arraySize];
		
		theArraySize = arraySize;
		
		return theArray;
	}
	
	// - Generate Random Values
	public int[] generateRandomValues(int[] arrayIn) {
		
		theArraySize = arrayIn.length;
		
		for(int i = 1; i < theArraySize - 1; i++) {
			
			arrayIn[i] = (int)(Math.random() * 10) + 10;
			
		}
		
		return arrayIn;

	}
	
	// - Print Array
	public void printArray(int[] arrayIn) {
		
		theArraySize = arrayIn.length;
				
		System.out.println("----------");
		
		for(int i = 0; i < theArraySize; i++) {
			
			System.out.print("| " + i + " | ");
			
			System.out.println(arrayIn[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	
	// - Swap values
	public void swapValuesArray(int[] arrayIn, int indexOne, int indexTwo) {
		
		int tempValue = arrayIn[indexOne];
		
		arrayIn[indexOne] = arrayIn[indexTwo];
		
		arrayIn[indexTwo] = tempValue;
		
	}
		
}
