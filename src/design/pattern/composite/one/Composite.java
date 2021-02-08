package design.pattern.composite.one;

import java.util.ArrayList;
import java.util.List;

// Component of tree -> Can have more objects

class Composite implements Component {

	String name;
	List<Component> components = new ArrayList<Component>();
	
	public Composite(String name) {
	
		this.name = name;
		
	}

	public void addComponent(Component component) {
		
		components.add(component);
		
	}
	
	@Override
	public void showPrice() {

		System.out.println("COMPOSITE : " + name);
		
		for (Component c : components) {
			
			c.showPrice();
			
		}
		
	}

}
