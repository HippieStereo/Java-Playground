package pkg_one.hash.table;

import java.util.ArrayList;
import java.util.Arrays;

//If we think of a Hash Table as an array
//then a hash function is used to generate
//a unique key for every item in the array.
//The position the item goes in is known
//as the slot. Hashing doesn't work very well
//in situations in which duplicate data
//is stored. Also it isn't good for searching
//for anything except a specific key. 
//However a Hash Table is a data structure that 
//offers fast insertion and searching capabilities.

public class HashFunction {
	
	public String[] theArray;
	public int arraySize;
	public int itemsInArray = 0;
	
	public HashFunction(int size) {
	
		arraySize = size;
		theArray = new String[arraySize];
		
		Arrays.fill(theArray, "-1");
		
	}
	
	// Simple Hash Function that puts values in the same
	// index that matches their value

	public void hashFunction_1(String[] stringsForArray, String[] theArray) {

		for(int i = 0; i < stringsForArray.length; i++) {
			
			String newElementVal = stringsForArray[i];
			
			theArray[Integer.parseInt(newElementVal)] = newElementVal;
			
		}
		
	}
	
	public boolean isPrime(int number) {
		
		// Eliminate the need to check versus even numbers
		
		if (number % 2 == 0) {
			
			return false;
			
		}
		
		// Check against all odd numbers
		
		for(int i = 3; i * i <= number; i +=2) {
			
			if (number % i == 0) {
				
				return false;
				
			}
			
		}
		
		// If we make it here we know it is odd
		
		return true;
		
	}
	
	public int getNextPrime(int minNumberToCheck) {
		
		for(int i = minNumberToCheck; true; i++) {
			
			if(isPrime(i)) {
				
				return i;
				
			}
			
		}
		
	}
	
	public void increaseArraySize(int minArraySize) {
		
		int newArraySize = getNextPrime(minArraySize);
		
		moveOldArray(newArraySize);
		
	}
	
	public void moveOldArray(int newArraySize) {
		
		String[] cleanArray = removeEmptySpaceInArray(theArray);
		
		theArray = new String[newArraySize];
		
		this.arraySize = newArraySize;
		
		fillArrayWithNeg1();
		
		hashFunction_2(cleanArray, theArray);
		
	}
	
	public String[] removeEmptySpaceInArray(String[] arrayToClean){
		
		ArrayList<String> stringList = new ArrayList<String>();
		
		for(String theString : arrayToClean) {
			
			if(!theString.equals("-1") && !theString.equals("")) {
				
				stringList.add(theString);
				
			}
			
		}
		
		return stringList.toArray(new String[stringList.size()]);
		
	}
	
	public void doubleHashFunc(String[] stringsForArray, String[] theArray) {
		
		for (int i = 0; i < stringsForArray.length; i++) {
			
			String newElementValue = stringsForArray[i];
			
			// Create an index to store the value in by taking
			// the modulus
			
			int arrayIndex = Integer.parseInt(newElementValue) % arraySize;
			
			// Get the distance to skip down in the array
			// after a collision occurs. We are doing this
			// rather than just going to the next index to
			// avoid creating clusters
			
			int stepDistance = 7 - (Integer.parseInt(newElementValue) % 7);
			
			System.out.println("Modulos Index = " + arrayIndex + " for value " + newElementValue);
			
			// Cycle through the array until we find an empty space
			
			while(theArray[arrayIndex] != "-1") {
				
				arrayIndex += stepDistance;
				
				System.out.println("Collision Try " + arrayIndex + "Instead");
				
				// If we get to the end of the array go back to index 0
				
				arrayIndex %= arraySize;
				
			}
			
			theArray[arrayIndex] = newElementValue;
			
		}
		
	}
	
	// Now let's say we have to hold values between 0 & 999
	// but we never plan to have more than 15 values in all.
	// It wouldn't make sense to make a 1000 item array, so
	// what can we do?

	// One way to fit these numbers into a 30 item array is
	// to use the mod function. All you do is take the modulus
	// of the value versus the array size

	// The goal is to make the array big enough to avoid
	// collisions, but not so big that we waste memory

	public void hashFunction_2(String[] stringsForArray, String[] theArray) {
		
		for (int i = 0; i < stringsForArray.length; i++) {
			
			String newElementValue = stringsForArray[i];
			
			// Create an index to store the value in by taking
			// the modulus
			
			int arrayIndex = Integer.parseInt(newElementValue) % arraySize;
			
			System.out.println("Modulos Index = " + arrayIndex + " for value " + newElementValue);
			
			// Cycle through the array until we find an empty space
			
			while(theArray[arrayIndex] != "-1") {
				
				++arrayIndex;
				
				System.out.println("Collision Try " + arrayIndex + "Instead");
				
				// If we get to the end of the array go back to index 0
				
				arrayIndex %= arraySize;
				
			}
			
			theArray[arrayIndex] = newElementValue;
			
		}
		
	}
	
	public String findKeyDblHashed(String key) {
		
		// Find the keys original hash key
		
		int arrayIndexHash = Integer.parseInt(key) % 29;
		
		int stepDistance = 7 - (Integer.parseInt(key) % 7);
		
		while(theArray[arrayIndexHash] != "-1") {
			
			if(theArray[arrayIndexHash] == key) {
				
				System.out.println(key + " was found in index : " + arrayIndexHash);
				
				// Found the key so return it
				
				return theArray[arrayIndexHash];
				
			}
			
			// Look in the next index
			
			arrayIndexHash += stepDistance;
			
			// If we get to the end of the array go back to index 0
			
			arrayIndexHash %= arraySize;
			
		}
		
		System.out.println(key + " was not found in ...");
		
		return null;
		
	}
	
	// Returns the value stored in the Hash Table
	
	public String findKey(String key) {
		
		// Find the keys original hash key
		
		int arrayIndexHash = Integer.parseInt(key) % 29;
		
		while(theArray[arrayIndexHash] != "-1") {
			
			if(theArray[arrayIndexHash] == key) {
				
				System.out.println(key + " was found in index : " + arrayIndexHash);
				
				// Found the key so return it
				
				return theArray[arrayIndexHash];
				
			}
			
			// Look in the next index
			
			++arrayIndexHash;
			
			// If we get to the end of the array go back to index 0
			
			arrayIndexHash %= arraySize;
			
		}
		
		return null;
		
	}
	
	public void fillArrayWithNeg1() {

		Arrays.fill(theArray, "-1");

	}
	
	public void displayTheStack() {

		int increment = 0;

		for (int m = 0; m < 3; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("| %3s " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (theArray[n].equals("-1"))
					System.out.print("|      ");

				else
					System.out
							.print(String.format("| %3s " + " ", theArray[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

		}

	}

}
