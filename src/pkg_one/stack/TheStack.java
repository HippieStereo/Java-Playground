package pkg_one.stack;

import java.util.Arrays;

public class TheStack {
	
	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;

	public TheStack(int sizeIn) {
	
		stackSize = sizeIn;
		
		stackArray = new String[sizeIn];
		
		Arrays.fill(stackArray, "-1");
		
	}
	
	// - put one value in stack
	public void pushOne(String strIn) {
		
		if(topOfStack + 1 < stackSize) {
			
			topOfStack++;
			
			stackArray[topOfStack] = strIn;
			
			System.out.println("Push in stack of value : " + stackArray[topOfStack] + " in index : " + topOfStack);
			
		} else {
			
			System.out.println("Stack is full !!!");
			
		}
		
	}
	
	// - put one value in stack
	public void pushMany(String strIn) {
		
		String[] tempArray = strIn.split(" ");
		
		for (int i = 0; i < tempArray.length; i++) {
			
			pushOne(tempArray[i]);
			
		}
		
	}
	
	// - remove one from the stack
	public String popOne() {
		
		String strOut = null;
		
		if(topOfStack >= 0) {
			
			strOut = stackArray[topOfStack];
					
			System.out.println("Pop in stack of value : " + strOut + " in index : " + topOfStack);
			
			stackArray[topOfStack] = "-1";
			
			topOfStack--;
			
		} else {
			
			System.out.println("Stack is empty !!!");
			
		}
		
		return strOut;
		
	}
	
	// - remove from the stack
	public void popAll() {
		
		for (int i = topOfStack; i >= 0; i--) {

			popOne();
			
		}
		
	}
	
	// - peek from the stack
	public String peek() {
		
		if(topOfStack >= 0) {
					
			System.out.println("Peek in stack of value : " + stackArray[topOfStack] + " in index : " + topOfStack);
			
			return "";
			
		} else {
			
			System.out.println("Stack is empty !!!");
			
			return "-1";
			
		}
		
	}
	
	// - print stack
	public void printStack() {
		
		System.out.println("\nPRINT STACK\n" + Arrays.toString(stackArray) + "\n");
		
	}
	
}
