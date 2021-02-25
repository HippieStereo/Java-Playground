package design.pattern.factory.one;

import java.util.Scanner;

public class AppRunByPattern {

	public static void main(String[] args) {
		
		// - By factory pattern
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		String typeOfShip = null;
		
		System.out.println("What time of ship ? ( {U}FO / {R}ocket / {B}ig )");
		
		if(userInput.hasNextLine()) {
			
			typeOfShip = userInput.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			
		}
		
		if(theEnemy != null) {
			
			doStuffEnemy(theEnemy);
			
		} else {
			
			System.out.println("ERROR : \"" + typeOfShip +  "\" is not a option ...");
			
		}
				
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
		
	}
	
}
