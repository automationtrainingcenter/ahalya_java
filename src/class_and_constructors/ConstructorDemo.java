package class_and_constructors;
/*
 * Constructor is a special method whose name is same as the class name.
 * Constructor doesn't have any explicit return type. Every Constructor will return reference(memory location) 
 * of the object
 * 
 * Constructor is used to create an instance of the class. We have two types of constructors
 * Default constructor
 * 	It will assign default values based on the data type of the instance variables
 * 
 * Parameterized constructor
 *  It will assign user defined values to the instance variables at the time of object creation 
 *  
 *  we can create n number of parameterized constructors either by changing the number of parameters, type 
 *  of parameters or sequence of parameters, this is known as constructor overloading
 *  
 * Java provides "this" keyword. "this" keyword always represents the current class instance.
 * which will differentiate instance variables with local variables.
 * We can use "this" keyword to call the constructor inside another constructor,
 * calling a constructor inside another constructor is the first line of code. This concept known as
 * constructor chaining 
 * 
 */

public class ConstructorDemo {

	int id;
	String name;

//	default constructor
	public ConstructorDemo() {
		id = 100;
		name = "surya";
	}
	
	public ConstructorDemo(int i, String n) {
		id = i;
		name = n;
	}
	
	public void display() {
		System.out.println("**************************\nid = "+id+"\nname = "+name);
	}

	public static void main(String[] args) {
		ConstructorDemo surya = new ConstructorDemo();
		surya.display();
		ConstructorDemo chandana = new ConstructorDemo(101, "chandana");
		ConstructorDemo ahalya = new ConstructorDemo(102, "ahalya");
		chandana.display();
		ahalya.display();
	}
}
