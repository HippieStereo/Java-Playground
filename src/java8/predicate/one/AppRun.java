package java8.predicate.one;

import java.util.function.Predicate;

public class AppRun {

	public static void main(String[] args) {
		
		Predicate<Integer> funcCheckGreater = i -> i > 20;
		
		System.out.println("Is greater then 20 ? -> " + funcCheckGreater.test(20));

	}

}
