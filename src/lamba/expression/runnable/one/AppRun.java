package lamba.expression.runnable.one;

public class AppRun {
	
	public static void main(String[] args) {
		
		// Old way
		Runnable run_1 = new MyRunnableImpl();
		
		Thread t_1 = new Thread(run_1);
		
		run_1.run();
		
		// New way
		Runnable run_2 = () -> {
			
			for (int i = 0; i < 10; i++) {
				
				System.out.println("Print \"i\" in Runnable : " + i);
				
			}
			
		};
		
		run_2.run();
		
		// Same loop in main
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Print \"i\" in Main : " + i);
			
		}
		
	}

}
