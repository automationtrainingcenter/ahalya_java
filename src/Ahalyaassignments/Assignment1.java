package Ahalyaassignments;

import java.util.Scanner;

public class Assignment1 {
	// write a method to find out given character is vowel or not using if else statement
	
	// write a method to verify given number is palindrome or not
	
	// write a method to find factorial of a given number
	
	// write a method to verify given number is prime or not
	
	// write a method to find sum and average of an array
	
	// write a method to search an element in an array
	
	// write a method to reverse the given string
	
	// write a method which will convert the case of alternate words of a string
	// ex: This is a sample string after conversion THIS is A sample STRING
	
	//create a main method and call all the above methods
	
	public static void main(String[] args) {
		int i=0;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a character");
		ch=s.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U')
			System.out.println("Given character is vowel");
		else
			System.out.println("given character is consonant");
		
		
		
		
			
	}
	
	
	
	
	

}
