package Ahalyaassignments;

abstract class Abcc
{
	 public abstract void floor();
	 public abstract void plot();
	
}
class Xyzz extends Abcc
{
	public void floor()
	{
		System.out.println("floor");
	}
	 public void plot()
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
