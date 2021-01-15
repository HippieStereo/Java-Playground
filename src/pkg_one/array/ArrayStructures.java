package pkg_one.array;

public class ArrayStructures {
	
	private int[] theArray;
	private int arraySize;
	
	// - Create Array
	
	public void makeArray(int arraySize) {
		
		this.theArray = new int[arraySize];
		
		this.arraySize = arraySize;
		
		// - Print Array Info
		
		System.out.println("\nArray Size = " + arraySize + "\n");
		
	}
	
	// - Generate Random Values
	
	public void generateRandomValues() {
		
		// - first position in array
		//theArray[theArraySize - theArraySize] = 11;
		
		for(int i = 1; i < arraySize - 1; i++) {
			
			theArray[i] = (int)(Math.random() * 10) + 10;
			
		}

		// - last position in array
		//theArray[theArraySize - 1] = 11;
		
	}
	
	// - Print Array
	public void printArray() {
				
		System.out.println("----------");
		
		for(int i = 0; i < arraySize; i++) {
			
			System.out.print("| " + i + " | ");
			
			System.out.println(theArray[i] + " |");
			
			System.out.println("----------");
			
		}
		
	}
	
	// - Get Value By Index
	public int getValueByIndex(int indexIn) {
		
		if(indexIn < arraySize) {
			
			return theArray[indexIn];
			
		} else {
			
			return -1;
			
		}
		
	}
	
	// - Is The Value In The Array
	public boolean isValueOnArray(int valueToFind) {
		
		boolean result = false;
		
		for(int i = 0; i < arraySize; i++) {
			
			if(theArray[i] == valueToFind) {
				
				result = true;
				
			}
			
		}
		
		return result;
		
	}
	
	// - Delete Value And Move Up Next Values
	public void deleteValueAndMoveUp(int valueToDelete) {

		for(int i = 0; i < arraySize; i++) {

			if(theArray[i] == valueToDelete) {

				for(int j = i; j < arraySize; j++) {
					
					if(j < (arraySize - 1)) {
						
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
	
	// Used to slow down calculations
	
	public void pauseAndUpdate(){
		
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// - Delete In Index And Move Up Next Values
	public void deleteInIndexAndMoveUp(int indexToDelete) {
		
		if(indexToDelete < arraySize) {
			
			for(int i = indexToDelete; i < arraySize - 1; i++) {
									
				theArray[i] = theArray[i + 1];
					
			}
			
		}
		
	}
	
	// Returns true or false if a value is in the Array
	
	public boolean doesArrayContainThisValue(int searchValue){
		
		boolean valueInArray = false;
		
		for(int i = 0; i < arraySize; i++){
			
			if(theArray[i] == searchValue){
				
				valueInArray = true;
				
			}
			
		}
		
		return valueInArray;
		
	}
	
	
	// Delete Array row for the index and move elements up
	
	public void deleteIndex(int index){
		
		if(index < arraySize){
			
			// Overwrite the value for the supplied index
			// and then keep overwriting every index that follows
			// until you get to the last index in the array
			
			for(int i = index; i < (arraySize - 1); i++){
				
				pauseAndUpdate();
				
				theArray[i] = theArray[i+1];
		
			}
			
			arraySize--;
			
		}
		
	}
	
	public void insertValue(int value){
		
		if(arraySize < 50){
			
			pauseAndUpdate();
			
			theArray[arraySize] = value;
			
			arraySize++;
			
		}
		
	}
	
	// The Binary Search is quicker than the linear search
	// because all the values are sorted. Because everything
	// is sorted once you get to a number larger than what
	// you are looking for you can stop the search. Also
	// you be able to start searching from the middle 
	// which speeds the search. It also works best when 
	// there are no duplicates
	
	public void binarySearchForValue(int value){
		
		int lowIndex = 0;
		int highIndex = arraySize - 1;
		
		while(lowIndex <= highIndex){
			
			int middleIndex = (highIndex + lowIndex) / 2;
			
			if(theArray[middleIndex] < value) lowIndex = middleIndex + 1;
			
			else if(theArray[middleIndex] > value) highIndex = middleIndex - 1;
			
			else {
				
				System.out.println("Found a Match for " + value + " at Index " + middleIndex);
				
				lowIndex = highIndex + 1;
				
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
