package abstraction;

public class InterfaceImpl implements InterfaceDemo{

	@Override
	public void add() {
		System.out.println("add method implementation in InterfaceImpl class");
	}

	@Override
	public void sub() {
		System.out.println("sub method implementation in InterfaceImpl class");
	}

}
