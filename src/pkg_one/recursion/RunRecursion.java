package pkg_one.recursion;

public class RunRecursion {

	public static void main(String[] args) {
		
		Recursion recursionTool = new Recursion();
		
		// Demonstrate what a triangular number is
		// Triangular numbers can be visualized as triangles
		// Equals itself plus every number before it to 1
		// TN of 5 = 5+4+3+2+1
		
		recursionTool.calculateSquaresToPrint(6);
		
		System.out.println("\nTN : 6 = " + recursionTool.getTriangularNumber(6) + "\n");
		
		recursionTool.getTriangularNumberRecursive(6);
		
		System.out.println();
		
		recursionTool.getFactorial(6);
		
	}
	
}
