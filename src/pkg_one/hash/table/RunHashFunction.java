package pkg_one.hash.table;

public class RunHashFunction {
	
	public static void main(String[] args) {
		
		HashFunction theFunc_1 = new HashFunction(30);
		
		// Simplest Hash Function
		
		String[] elementsToAdd_1 = {"1", "5", "17", "21", "26"};
		
		theFunc_1.hashFunction_1(elementsToAdd_1, theFunc_1.theArray);
		
		theFunc_1.displayTheStack();
		
		System.out.println();
		
		HashFunction theFunc_2 = new HashFunction(30);
		
		// Mod Hash Function
		// This contains exactly 30 items to show how collisions
		// will work
		
		String[] elementsToAdd_2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
		
		theFunc_2.hashFunction_2(elementsToAdd_2, theFunc_2.theArray);
		
		theFunc_2.displayTheStack();
		
		System.out.println();
		
		// Locate the value 660 in the Hash Table
		
		theFunc_2.findKey("660");
		
		String[] elementsToAdd_3 = { "30", "60", "90", "120", "150", "180",
				"210", "240", "270", "300", "330", "360", "390", "420", "450",
				"480", "510", "540", "570", "600", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
		
		HashFunction theFunc_3 = new HashFunction(31);
		
		theFunc_3.hashFunction_2(elementsToAdd_3, theFunc_3.theArray);
		
		theFunc_3.displayTheStack();
		
	}

}
