package pkg_one.stack;

public class RunTheStack {

	public static void main(String[] args) {
		
		TheStack theStack = new TheStack(10);
		
		theStack.pushOne("0");
		theStack.pushOne("1");
		theStack.pushOne("2");
		theStack.popOne();
		theStack.pushOne("2");
		theStack.peek();
		theStack.pushOne("999");
		theStack.peek();
		theStack.pushMany("A B C");
		theStack.printStack();
		theStack.popAll();
 		theStack.printStack();

	}

}
