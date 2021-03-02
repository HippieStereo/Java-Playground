package java8.diamond.problem.one;

public class AppRun {

	public static void main(String[] args) {

		Class_A class_A = new Class_A();
		
		class_A.methodDefault();
		
		Interface_A interface_A = new Class_A();
		
		interface_A.methodDefault();
		
		Interface_B interface_B = new Class_A();
		
		interface_B.methodDefault();
	}

}
