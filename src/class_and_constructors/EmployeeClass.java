package class_and_constructors;
/*this class explains class and object in Java
 * A Java class contains properties and behavior
 * properties are combination of data type and variables (instance or static)
 * behavior is methods in Java
 * 
 * To create an object of a class we have to use new keyword and call the constructor of the class
 * class_name obj_name = new class_name();
 * */

public class EmployeeClass {
	
	String empName;
	int id;
	String designation;
	String address;
	double salary;
	
	public void updateAddress(String newAddress) {
		address = newAddress;
	}
	
	public void hikeSalary(double hikePercentage) {
		salary = salary + (salary * hikePercentage * 0.01);
	}
	
	public void upgradeDesignation(String newDesignation) {
		designation = newDesignation;
		hikeSalary(15);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("**************************************************"
				+ "\nname : "+empName+
				"\nemp id : "+id+
				"\ndesignation : "+designation+
				"\nsalary : "+salary+
				"\naddress : "+address);
		
		
	}
	
	public static void main(String[] args) {
//		create an object of EmployeeClass
		EmployeeClass chandana = new EmployeeClass();
		chandana.empName = "sri lakshmi";
		chandana.id = 101;
		chandana.designation = "sr tester";
		chandana.address = "lingampally";
		chandana.salary = 45000.0;
		chandana.displayEmployeeDetails();
		chandana.updateAddress("kukatpally");
		chandana.hikeSalary(10);
		chandana.displayEmployeeDetails();
//		chandana.salary = 20000;
//		chandana.displayEmployeeDetails();
		
		
		EmployeeClass ahalya = new EmployeeClass();
//		ahalya.empName = "ahalya manne";
//		ahalya.id = 102;
//		ahalya.designation = "jr tester";
//		ahalya.address = "lingampally";
//		ahalya.salary = 35000.0;
//		ahalya.displayEmployeeDetails();
//		ahalya.upgradeDesignation("sr tester");
//		ahalya.updateAddress("hitech city");
		ahalya.displayEmployeeDetails();
		
		
	}

}
