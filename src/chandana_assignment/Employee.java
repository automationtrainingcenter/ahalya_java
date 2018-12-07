package chandana_assignment;
/*
 * write a program to create employee details like name id aadharnum phonenum
 * address salary and companyname
 * and write a method which will print employee name phonenum companyname
 * dont intialize instance variables
 * creates three objects in main methods  *
 */
import java.util.Scanner;

public class Employee {

	     String Ename,address,CompanyName;
	     int Id,Sal,Aadhar;
	     Long PhoneNumber;
	    	    
	    public static void main(String[] args) {
	    	
	    	Employee emp = new Employee();  
	         emp.CreateDetails();  
	         emp.printDetails();  
    	
	        }
	    void CreateDetails()
	    {
	    	Scanner s= new Scanner(System.in); 
	    	System.out.println("Enter Employees Details\n");
	         System.out.println("Enter Name of Employees\n");  
	         Ename=s.nextLine();	         
	         System.out.println("Enter Address\n");  
	         address=s.nextLine(); 
	         System.out.println("Enter CompanyName of Employee\n");
	         CompanyName=s.nextLine();
	         System.out.println("Enter PhoneNumber of Employee\n");
	         PhoneNumber=s.nextLong();
	         System.out.println("Enter Id of Employee\n");
	         Id=s.nextInt();
	         System.out.println("Enter Aadhar Employee\n");  
	         Aadhar=s.nextInt();
	         System.out.println("Enter Salary of Employee\n");
	         Sal=s.nextInt();
         }	
	    
	    
	    void printDetails()
	    {
	    	System.out.println("Printing Employees Details\n");
	    	System.out.println("Name of Employee\n"+Ename);  
            System.out.println("Salary of Employee\n"+Sal);  
            System.out.println("Company\n"+CompanyName); 
                   	    
	    }
}
	    
