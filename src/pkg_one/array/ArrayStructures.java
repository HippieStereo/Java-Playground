package pkg_one.array;

public class ArrayStructures {
	
	private int[] theArray;
	private int theArraySize;
	
	// - Create Array
	public void makeArray(int arraySize) {
		
		theArray = new int[arraySize];
		
		theArraySize = arraySize;
		
		// - Print Array Info
		System.out.println("\nArray Size = " + theArraySize + "\n");
		
	}
	
	// - Generate Random Values
	public void generateRandomValues() {
		
		// - first position in array
		//theArray[theArraySize - theArraySize] = 11;
		
		for(int i = 1; i < theArraySize - 1; i++) {
			
			theArray[i] = (int)(Math.random() * 10) + 10;
			
		}

		// - last position in array
		//theArray[theArraySize - 1] = 11;
		
	}
	
	// - Print Array
	public void printArray() {
				
		System.out.println("----------");
		
		for(int i = 0; i < theArraySize; i++) {
			
			System.out.print("| " + i + " | ");
			
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	
	// - Get Value By Index
	public int getValueByIndex(int indexIn) {
		
		if(indexIn < theArraySize) {
			
			return theArray[indexIn];
			
		} else {
			
			return -1;
			
		}
		
	}
	
	// - Is The Value In The Array
	public boolean isValueOnArray(int valueToFind) {
		
		boolean result = false;
		
		for(int i = 0; i < theArraySize; i++) {
			
			if(theArray[i] == valueToFind) {
				
				result = true;
				
			}
			
		}
		
		return result;
		
	}
	
	// - Delete Value And Move Up Next Values
	public void deleteValueAndMoveUp(int valueToDelete) {

		for(int i = 0; i < theArraySize; i++) {

			if(theArray[i] == valueToDelete) {

				for(int j = i; j < theArraySize; j++) {
					
					if(j < (theArraySize - 1)) {
						
						theArray[j] = theArray[j+1];
						
						theArray[j+1] = 99;
						
					}
					
				}
				
				if(i > 0) {
					
					i--;
					
				}
				
			}
			
		}
		
	}
	
	// - Delete In Index And Move Up Next Values
	public void deleteInIndexAndMoveUp(int indexToDelete) {
		
		if(indexToDelete < theArraySize) {
			
			for(int i = indexToDelete; i < theArraySize - 1; i++) {
									
				theArray[i] = theArray[i + 1];
					
			}
			
		}
		
	}
	
	// - RUN
	
	public static void main (String args[]) {

		ArrayStructures arrayStructures = new ArrayStructures();

		// - Create Array
		arrayStructures.makeArray(10);
		
		// - Populate Array
		arrayStructures.generateRandomValues();

		// - Print Array
		arrayStructures.printArray();
		
		// - Print Index Value
		int indexInArray = 9;
		
		System.out.println("\nValue in index : " + indexInArray);
		
		System.out.println("R : " + arrayStructures.getValueByIndex(indexInArray));
		
		// - Is Value Present In Array
		int valueToFind = 11;
		
		System.out.println("\nIs " + valueToFind + " in the array ? -> " + arrayStructures.isValueOnArray(valueToFind) + "\n");
		
		// Delete Value And Move Up Next Values
		int valueToEdelte = 11;
		
		arrayStructures.deleteValueAndMoveUp(valueToEdelte);
		
		// - Print Array
		arrayStructures.printArray();
		
		// - Create Array
		arrayStructures.makeArray(10);
		
		// - Populate Array
		arrayStructures.generateRandomValues();
		
		// Delete Index And Move Up Next Values
		arrayStructures.deleteInIndexAndMoveUp(9);
		
		// - Print Array
		arrayStructures.printArray();
		
	}

}
