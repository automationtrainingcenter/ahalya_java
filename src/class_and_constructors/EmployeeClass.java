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
	int id ;
	String designation;
	String address;
	double salary;
	String panNum;
	String aadharNum;
	static int i = 100;
	
//	default constructor
	private EmployeeClass() {
		this.id = i;
		i++;
	}
	
//	parameterized constructor
	public EmployeeClass(String empName, String designation, double salary, String address) {
		this();
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}
	
	public EmployeeClass(String empName, String designation, double salary, String address, String panNum) {
		this(empName, designation, salary, address);
		this.panNum = panNum;
	}
	
	public EmployeeClass(String empName, String designation, String address, double salary, String aadharNum) {
		this(empName, designation, salary, address);
		this.aadharNum = aadharNum;
	}
	
	public EmployeeClass(String empName, String designation, double salary, String address, String panNum, String aadaharNum) {
		this(empName, designation, salary, address, panNum);
		this.aadharNum = aadaharNum;
	}
	
	public void updateAddress(String newAddress) {
		this.address = newAddress;
	}
	
	public void hikeSalary(double hikePercentage) {
		this.salary = this.salary + (this.salary * hikePercentage * 0.01);
	}
	
	public void upgradeDesignation(String newDesignation) {
		this.designation = newDesignation;
		this.hikeSalary(15);
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
		EmployeeClass chandana = new EmployeeClass("sri lakshmi", "sr tester", 45000, "lingampally", "aapp1122k");
		chandana.displayEmployeeDetails();
		chandana.updateAddress("kukatpally");
		chandana.hikeSalary(10);
		chandana.displayEmployeeDetails();
//		chandana.salary = 20000;
//		chandana.displayEmployeeDetails();
//		
		
		EmployeeClass ahalya = new EmployeeClass("ahalya", "jr tester", 35000, "chandanagar", "aaqq2233o", "987654321234");
		ahalya.displayEmployeeDetails();
		ahalya.upgradeDesignation("sr tester");
		ahalya.updateAddress("hitech city");
		ahalya.displayEmployeeDetails();


		EmployeeClass lakshmi = new EmployeeClass("lakshmi", "jr tester", 35000, "kukatpally");
		lakshmi.displayEmployeeDetails();
		
		
		
		
		
	}

}
