package pkg_one.big.o;

public class RunBigONotation {

	public static void main(String[] args) {

		// Big O(1)
		
		BigONotation algoBigO_1 = new BigONotation(10000000);
		
		algoBigO_1.addItemToArray(9);
		
		System.out.println();
		
		// Big O(N)
		
		BigONotation algoBigO_N = new BigONotation(10000000);
		
		algoBigO_N.generateRandomArray();
		
		algoBigO_N.linearSearch(700);
		
		// Big O(N^2)
		
		System.out.println();
		
		BigONotation algoBigO_N_2 = new BigONotation(10000);
		
		algoBigO_N_2.bubbleSort();
		
		// Big O(log N)
		
		System.out.println();
		
		BigONotation algoBigO_log_N = new BigONotation(10000);
		
		algoBigO_log_N.generateRandomArray();
		
		algoBigO_log_N.binarySearchForValue(20);
		
		// Big O(n log n)
		
		System.out.println();
		
		long startTime = System.currentTimeMillis();
		
		BigONotation algoBigO_N_log_N = new BigONotation(300000);
		
		algoBigO_N_log_N.generateRandomArray();
		
		algoBigO_N_log_N.quickSort(0, algoBigO_N_log_N.itemsInArray);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("QUICK SORT - BIG O(log N) : " + (endTime - startTime));
		
	}

}
