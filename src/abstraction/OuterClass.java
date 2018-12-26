package abstraction;

public class OuterClass {
	private int i = 10;
	
	public void methodOne() {
		System.out.println("outer class method");
	}
	
	class InnerClass{
		public void methodTwo() {
			methodOne();
			System.out.println("outer class instance variable i = "+i);
			System.out.println("inner class method");
		}
	}

}
