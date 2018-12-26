package abstraction;

public interface InnerInterfaceDemo { 

	public void outerMethod();
	
	public InnerInterface method();
	
	interface InnerInterface{
		public void innerMethod();
	}
	
}
