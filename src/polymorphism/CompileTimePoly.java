package polymorphism;

public class CompileTimePoly {
	public void add(String a , int b) {
		int ia = Integer.parseInt(a);
		System.out.println(ia + b);
	}
	
//	change in number of parameters
	public void add(String a, int b, int c) {
		int ia = Integer.parseInt(a);
		System.out.println(ia+b+c);
	}
	
//	change in type of parameters
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
//	change in sequence of parameters
	public void add(int a, String b) {
		int ib = Integer.parseInt(b);
		System.out.println(a + ib);
	}
	
//	change in return type only
//	public int add(String a, int b) {
//		
//	}

}
