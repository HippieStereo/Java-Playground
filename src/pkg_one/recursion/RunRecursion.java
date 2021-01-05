package pkg_one.recursion;

public class RunRecursion {

	public static void main(String[] args) {
		
		Recursion recursionTool = new Recursion();
		
		recursionTool.calculateSquaresToPrint(6);
		
		System.out.println("\nTN : 6 = " + recursionTool.getTriangularNumber(6) + "\n");
		
		recursionTool.getTriangularNumberRecursive(6);
		
		System.out.println();
		
		recursionTool.getFactorial(6);
		
	}
	
}
