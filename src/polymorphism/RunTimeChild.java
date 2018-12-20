package polymorphism;

public class RunTimeChild extends RunTimeParent{

	@Override
	public void add(String a, int b) {
		int ia = Integer.parseInt(a);
		System.out.println(ia+b);
	}
	
}
