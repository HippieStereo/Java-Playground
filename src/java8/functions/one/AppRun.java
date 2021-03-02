package java8.functions.one;

import java.util.function.Function;

public class AppRun {

	public static void main(String[] args) {

		Function<String, Integer> func_1 = a -> a.length();
		
		System.out.println(func_1.apply("wawa"));
		
	}

}
