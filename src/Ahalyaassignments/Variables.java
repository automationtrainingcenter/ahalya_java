package Ahalyaassignments;

public class Variables {
	static int i = 1;
	int j = 1;

	public void increment() {
		i = i + 1;
		j = j + 1;

	}

	public static void main(String[] args) {
		Variables obj1 = new Variables();
		obj1.increment();
		Variables obj2 = new Variables();
		obj2.increment();
		System.out.println("i = " +obj1.i+"\tj=" +obj1.j);
		System.out.println("i = " +obj2.i+"\tj=" +obj2.j);
		

	}

}
