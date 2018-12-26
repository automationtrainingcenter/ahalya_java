package Ahalyaassignments;

abstract class Abcc
{
	 abstract void floor();
	 abstract void plot();
	
}
class Xyzz extends Abcc
{
	 void floor()
	{
		System.out.println("floor");
	}
	 void plot()
	{
		System.out.println("plot");
	}
}
public class AbstractionDemo {
	public static void main(String[] args)
	{
		Abcc obj=new Xyzz();
		obj.floor();
		obj.plot();
		
	}

}
