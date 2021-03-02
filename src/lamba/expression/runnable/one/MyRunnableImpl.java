package lamba.expression.runnable.one;

public class MyRunnableImpl implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println("Print \"i\" in Thread : " + i);
			
		}
		
	}

}
