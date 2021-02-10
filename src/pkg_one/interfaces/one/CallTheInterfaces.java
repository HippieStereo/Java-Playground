package pkg_one.interfaces.one;

public class CallTheInterfaces implements ImplOne, ImplTwo{

	@Override
	public void display() {

		System.out.println("Display");
			
	}

	@Override
	public void fromImplTwo() {

		System.out.println("fromImplTwo");
		
	}

	@Override
	public void display(int number) {
		// TODO Auto-generated method stub
		
	}

}
