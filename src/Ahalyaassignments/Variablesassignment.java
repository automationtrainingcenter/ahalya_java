package Ahalyaassignments;

/*
 * write a program to create employee details like name, id ,
 * adhar number,
 * phone number,address ,salary 
 * and company name 
 * write a method which will print employee name 
 * phone number
 * company name
 * dont initialise instance variables
 * 
 *
 */
public class Variablesassignment {
	String empname, address;
	long number;
	static String companyname;
	int empid;
	float salary;
	long adhar;

	public void display() {
		System.out.println("empname:" + empname);
		System.out.println("companyname:" + companyname);
	}

	public static void main(String[] args) {
		Variablesassignment e1 = new Variablesassignment();
		e1.empname = "pinky";
		e1.companyname = "oracle";
		e1.display();
		Variablesassignment e2 = new Variablesassignment();
		e2.empname = "Dimple";
		e2.companyname = "oracle";
		e2.display();
		Variablesassignment e3 = new Variablesassignment();
		e3.empname = "Tommy";
		e3.companyname = "oracle";
		e3.display();

	}

}
