package enumeration.one;

import java.util.EnumMap;
import java.util.EnumSet;

public class RunApp_1 {

	public static void main(String[] args) {
		
		Level level_1 = Level.HIGH;
		
		// - In if ...
		
		if (level_1 == Level.HIGH) {
			
			System.out.println("Enum in if");
			
		}
		
		// - In switch
		
		switch (level_1) {
		case HIGH:
			System.out.println("Enum \"" + level_1 + "\"in switch");
			break;
		case MEDIUM:
			System.out.println("Enum \"" + level_1 + "\"in switch");
			break;
		case LOW:
			System.out.println("Enum \"" + level_1 + "\"in switch");
			break;
		default:
			break;
		}
		
		// - List of enum's
		
		Level[] listOfEnum = Level.values();
		
		System.out.println("List of enum's :");
		
		for(Level oneLevel : listOfEnum){
			
			System.out.println(oneLevel);
			
		}
		
		// - Value of
		
		Level level_11 = Level.valueOf("MEDIUM");
		
		System.out.println(level_11);
		
		// - Get value from enum
		
		Level level_111 = Level.MEDIUM;
		
		System.out.println(level_111.getEnumValue());

		// - Abstract method in enum
		
		System.out.println(Level.HIGH.normalize());
		System.out.println(Level.MEDIUM.normalize());
		System.out.println(Level.LOW.normalize());
		
		// - Enum collection
		
		EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM, Level.LOW);
		
		System.out.println("Enum Set : " + enumSet);
		
		EnumMap<Level, String> enumMap = new EnumMap<>(Level.class);
		
		enumMap.put(Level.HIGH, "Level.HIGH");
		enumMap.put(Level.MEDIUM, "Level.MEDIUM");
		enumMap.put(Level.LOW, "Level.LOW");
		
		System.out.println("Enum Map : " + enumMap);
		
	}

}
