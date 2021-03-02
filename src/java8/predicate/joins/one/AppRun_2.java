package java8.predicate.joins.one;

import java.util.function.Predicate;

public class AppRun_2 {
	
	public static void main(String[] args) {
		
		int[] theArray = {1, 10, 20, 30, 41};
		
		Predicate<Integer> predicateInt_1 = i -> i > 10;
		Predicate<Integer> predicateInt_2 = i -> i % 2 == 0;
		
		System.out.println("Even numbers");
		checkNumber(predicateInt_2, theArray);
		
		System.out.println("Numbers greater than 10");
		checkNumber(predicateInt_1, theArray);
		
		System.out.println("Numbers not greater than 10");
		checkNumber(predicateInt_1.negate(), theArray);
		
		System.out.println("Numbers greater than 10 and even");
		checkNumber(predicateInt_1.and(predicateInt_2), theArray);
		
		System.out.println("Numbers greater than 10 or even");
		checkNumber(predicateInt_2.or(predicateInt_1), theArray);
		
	}
	
	static void checkNumber(Predicate<Integer> predicateInt, int[] theArray) {
		
		for (int i : theArray) {
			
			if(predicateInt.test(i)) {
				
				System.out.println(i + " is OK");
				
			}
			
		}
		
	}

}
