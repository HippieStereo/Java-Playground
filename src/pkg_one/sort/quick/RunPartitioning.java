package pkg_one.sort.quick;

import java.util.Arrays;

public class RunPartitioning {

	public static void main(String[] args) {

		Partitioning partitionArray = new Partitioning(10);
		
		partitionArray.generateRandomArray();
		
		System.out.println(Arrays.toString(Partitioning.theArray));
		
		partitionArray.partitionArray(35);
		
		System.out.println(Arrays.toString(Partitioning.theArray));
		
	}

}
