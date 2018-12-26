package Ahalyaassignments;
interface Abc
{
	void home();
	void flat();
}
class Xyz implements Abc
{
	public void home()
	{
		System.out.println("Home");
	}
	public void flat()
	{
		System.out.println("Flat");
	}
}

public class InterfaceDemo 
{
	public static void main(String[] args) {
		Abc obj = new Xyz();
		obj.home();
		obj.flat();
		
				
		
	}
	

}
