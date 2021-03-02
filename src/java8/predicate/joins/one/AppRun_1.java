package java8.predicate.joins.one;

import java.util.function.Predicate;

public class AppRun_1 {

	public static void main(String[] args) {

		int[] theArray = {10, 20, 30};
		
		Predicate<Integer> predicateInt = i -> i > 10;
		
		// Old way
		for (int j = 0; j < theArray.length; j++) {
			
			System.out.println("Is " + theArray[j] + " greater than 10 ? -> " + predicateInt.test(theArray[j]));
			
		}
		
		// - Predicate in method
		checkNumber(predicateInt, theArray);
		
	}
	
	static void checkNumber(Predicate<Integer> predicateInt, int[] theArray) {
		
		for (int i : theArray) {
			
			System.out.println("Is " + i + " greater than 10 ? -> " + predicateInt.test(i));
			
		}
		
	}

}
