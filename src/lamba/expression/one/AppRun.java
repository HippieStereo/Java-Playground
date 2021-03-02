package lamba.expression.one;

public class AppRun{

	public static void main(String[] args) {

		FuncInterfaceVoid funSumVoid = (x, y) -> System.out.println("Test Sum : " + (x + y));
		
		funSumVoid.sum(10, 20);
		
		FuncInterfaceInt funSumInt = (x, y) -> x + y;
		
		System.out.println("Test Sum : " + funSumInt.sum(11, 22));
		
	}

}
