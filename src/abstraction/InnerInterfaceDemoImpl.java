package abstraction;

public class InnerInterfaceDemoImpl implements InnerInterfaceDemo, InnerInterfaceDemo.InnerInterface{

	@Override
	public void outerMethod() {
		System.out.println("outer method of innerinterfacedemo");
	}

	@Override
	public void innerMethod() {
		System.out.println("inner method of inner interface");
	}

	@Override
	public InnerInterface method() {
		return this;
	}

}
