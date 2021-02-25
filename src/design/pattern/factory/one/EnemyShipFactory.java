package design.pattern.factory.one;

public class EnemyShipFactory {

	public EnemyShip makeEnemyShip(String newShipType) {
		
		EnemyShip newShip = null;
		
		if (newShipType.equals("U")) {
			
			newShip = new UFOEnemyShip();
			
			return newShip;
			
		} else if (newShipType.equals("R")) {
			
			newShip = new RocketEnemyShip();
			
			return newShip;
			
		} else if (newShipType.equals("B")) {
			
			newShip = new BigUFOEnemyShip();
			
			return newShip;
			
		} else {
			
			return null;
			
		}
		
	}
	
}
