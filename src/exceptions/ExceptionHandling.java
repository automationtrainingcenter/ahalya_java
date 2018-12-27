package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Exception means interruption to the normal flow of execution.
 * Generally we have two types of exceptions
 * 1. checked exceptions also known compile time exception
 * 		These are the exceptions which will extends Exception class
 * 	 we can handle checked exception either by throwing that exception or by handling that exception using
 * try and catch blacks
 * 2. unchecked exceptions also known as runtime exception
 * 		These are the exceptions which will extends RuntimeException class
 * 	we can handle unchecked exception using try and catch block
 * 
 * try block contains the code which will rise an exception
 * 
 * catch block will catch that exception and handles that exception
 * 
 * finally block will execute the statement irrespective of exception
 * 
 * throws keyword will throw the exception to the corresponding method declaration
 */
public class ExceptionHandling {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("statement 1");
		
//		Compile time exception
		Thread.sleep(5000);
		try {
			FileInputStream f = new FileInputStream(".//notebook.txt");
		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("statement 2");
		
//		Runtime exceptions
		try{
			int i = 10;
			int j = 0;
			System.out.println(i/j);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		String s = "ahalya";
		try {
			System.out.println(s.charAt(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally block");
		}
		
	}
	
	
	

}
