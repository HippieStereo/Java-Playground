package design.pattern.factory.one;

import java.util.Scanner;

public class AppRunDynamic {

	public static void main(String[] args) {
		
		// - Dynamic way ...
		
		EnemyShip theEnemyShip = null;
		
		Scanner userInput = new Scanner(System.in);
		
		String enemyShipOption = "";
		
		System.out.println("What time of ship ? ( {U}FO / {R}ocket )");
		
		if(userInput.hasNextLine()) {
			
			enemyShipOption = userInput.nextLine();
			
		}
		
		if (enemyShipOption.equals("U")) {
			
			theEnemyShip = new UFOEnemyShip();
			
			doStuffEnemy(theEnemyShip);
			
		} else if (enemyShipOption.equals("R")) {
			
			theEnemyShip = new RocketEnemyShip();
			
			doStuffEnemy(theEnemyShip);
			
		} else {
			
			System.out.println("ERROR : \"" + enemyShipOption +  "\" is not a option ...");
			
		}
				
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
		
	}
	
}
