package Ahalyaassignments;

public class AhalyaInterfaceImpl implements AhalyaInterface,AhalyaInterface.AhaInterface 
{

	@Override
	public void insideMethod() {
		System.out.println("this is inside method");
		
	}

	@Override
	public void outsideMethod() {
		System.out.println("this is outside method");
		
	}

	@Override
	public AhaInterface method() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
