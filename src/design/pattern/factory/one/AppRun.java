package design.pattern.factory.one;

public class AppRun {

	public static void main(String[] args) {
		
		// - Old way to create object
		EnemyShip ufoShip = new UFOEnemyShip();
		
		doStuffEnemy(ufoShip);
		
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
		
	}
	
}
