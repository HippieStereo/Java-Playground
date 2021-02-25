package design.pattern.composite.one;

// https://www.youtube.com/watch?v=Q1jZ4TI6MF4

// Root object tree for a computer
//							PC(180)
//			BOX(70)							PERIFERIC(110)
//	BOARD(30)		POWER(40)			SCREEN(50)	KEYBOARD(60)
//MEMORY(20) HDD(10)

public class AppRun {
	
	public static void main(String[] args) {
		
		// Leaf
		
		Component hdd = new Leaf(10, "HDD");
		Component memory = new Leaf(20, "MEMORY");
		Component keyboard = new Leaf(60, "KEYBOARD");
		Component screen = new Leaf(50, "SCREEN");
		Component power = new Leaf(40, "POWER");
		
		// Composite
		
		Component periferic = new Composite("PERIFERIC");
		Component board = new Composite("BOARD");
		Component box = new Composite("BOX");
		Component pc = new Composite("PC");
		
		((Composite)board).addComponent(memory);
		((Composite)board).addComponent(hdd);
		((Composite)box).addComponent(board);
		((Composite)box).addComponent(power);
		((Composite)periferic).addComponent(screen);
		((Composite)periferic).addComponent(keyboard);
		((Composite)pc).addComponent(box);
		((Composite)pc).addComponent(periferic);
		
		pc.showPrice();
		
	}

}
