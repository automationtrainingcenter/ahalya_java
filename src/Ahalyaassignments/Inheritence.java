package Ahalyaassignments;

abstract class Parent {
	static int a = 10, b = 20;

	public abstract void sum();

	public abstract void sub();

	public void mul() {
		int mul = a * b;
	}
}

class ImplParent extends Parent {

	@Override
	public void sum() {
		System.out.println("sum method");
	}

	@Override
	public void sub() {
		System.out.println("subtract method");
	}
}

class Child1 extends ImplParent {
	@Override
	public void sum() {
		int sum = a + b;
		System.out.println("sum is:" + sum);
	}
	
	public void mul() {
		int c = 30;
		int mul = a * b * c;
		System.out.println("mul is:" + mul);
	}
}

class Child2 extends ImplParent {
	@Override
	public void sub() {
		int sub = b - a;
		System.out.println("sub is:" + sub);
	}
}

public class Inheritence {
	public static void main(String[] args) {
		Parent obj = new Child1();
		obj.sum();
		obj.mul();
		obj = new Child2();
		obj.sub();
		obj.mul();

	}
}
