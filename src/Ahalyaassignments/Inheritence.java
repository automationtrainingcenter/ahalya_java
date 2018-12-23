package Ahalyaassignments;

class Parent {
	static int a = 10, b = 20;
	public void sum(int c)
	{
		c=a+b;
		System.out.println("c value is:"+c);
	}
	public void sub()
	{
		
	}
	public void mul()
	{
		int mul=a*b;
		System.out.println("mul is:"+mul);
	}
}

class Child1 extends Parent {
	public void sum() {
		int sum = a + b;
		System.out.println("sum is:" + sum);
	}
	public void mul()
	{
		int c=30;
		int mul=a*b*c;
		System.out.println("mul is:"+mul);
	}
}
class Child2 extends Parent{
	public void sub()
	{
		int sub=b-a;
		System.out.println("sub is:"+sub);
	}
}

public class Inheritence {
	public static void main(String[] args) {
		Parent obj = new Child1();
		obj.sum(0);
		obj.mul();
		Parent obj1 = new Child2();
		obj1.sub();
		Parent obj2 = new Parent();
		obj2.mul();
		Child1 obj3=new Child1();
		obj3.sum();
		

	}
}
