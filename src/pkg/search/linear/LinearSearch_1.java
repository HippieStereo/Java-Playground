package pkg.search.linear;

import pkg.array.CreateArray;

public class LinearSearch_1 {

	public String linearSearchForValue(int value, int[] arrayIn) {
		
		boolean result = false;
		
		String strFinal = "Found : " + value + " in position : ";
		
		for(int i = 0; i < arrayIn.length; i++) {
			
			if(value == arrayIn[i]) {
				
				result = true;
				
				strFinal += i + " ";
				
			}
			
		}
		
		if(!result) {
			
			strFinal = new String("NO VALUE : " + value);
			
		}
		
		return strFinal;
		
	}
	
	public static void main(String[] args) {

		LinearSearch_1 linearSearch = new LinearSearch_1();
		CreateArray createArray = new CreateArray();

		// - make array
		int[] theArray = createArray.makeArray(10);
		
		createArray.generateRandomValues(theArray);
		
		createArray.printArray(theArray);
		
		// - Is Value Present In Array
		int valueToFind = 11;

		System.out.println(linearSearch.linearSearchForValue(valueToFind, theArray));
		
	}

}
