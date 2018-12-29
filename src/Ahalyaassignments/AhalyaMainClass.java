package Ahalyaassignments;

public class AhalyaMainClass
{
	public static void main(String[] args) 
	{
	AhalyaInterface.AhaInterface Aobj= new AhalyaInterfaceImpl();
	Aobj.insideMethod();
	AhalyaInterface Aobj1= new AhalyaInterfaceImpl();
	Aobj1.outsideMethod();
	Aobj1.method().insideMethod();
		
	}

}
