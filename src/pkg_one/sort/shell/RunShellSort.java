package pkg_one.sort.shell;

import java.util.Arrays;

public class RunShellSort {

	public static void main(String[] args) {
		
		ShellSort theSort = new ShellSort(10);
		
		System.out.println(Arrays.toString(theSort.theArray));
		
		theSort.sort();
		
		System.out.println(Arrays.toString(theSort.theArray));
		
	}
	
}