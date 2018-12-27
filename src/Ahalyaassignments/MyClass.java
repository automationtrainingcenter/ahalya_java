package Ahalyaassignments;
//class with nested interface
class A
{
	 interface TestInterface
	{
		void displayValue(String value);
	}
	
}
//class implementing nested interface
class B implements A.TestInterface
{
	public void displayValue(String value)
	{
		System.out.println("the value of string is:"+value);
	}
}

public class MyClass 
 {
	public static void main(String[] args) 
	{
		A.TestInterface obRef =new B();
		obRef.displayValue("Ahalya");
	}

}
