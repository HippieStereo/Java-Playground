package lamba.expression.runnable.anonymous.one;

public class AppRun {
	
	public static void main(String[] args) {
		
		// Old way
		Thread thread_1 = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					
					System.out.println("Print \"i\" in Thread Old Way : " + i);
					
				}		
				
			}
			
		});
		
		thread_1.start();
		
		// New way
		Thread thread_2 = new Thread(
					
					()->{
						
						for (int i = 0; i < 10; i++) {
							
							System.out.println("Print \"i\" in Thread New Way : " + i);
							
						}
						
					}
				
				);
		
		thread_2.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Print \"i\" in Main : " + i);
			
		}
		
	}

}
