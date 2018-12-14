package Ahalyaassignments;

import java.util.Scanner;

public class Assignment1 {
	static Scanner s;
	// write a method to find out given character is vowel or not using if else statement
	public void vowelOrNot() {
		int i=0;
		char ch;
		System.out.println("enter a character");
		String charc = s.next();
		if(charc.length()==1) {
			ch = charc.charAt(0);
			int j = (int)ch;
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U') {
				System.out.println("Given character is vowel");
			}else if(j >= 97 && j <= 122 || j >= 65 && j <= 90) {
				System.out.println("given character is consonant");
			}else {
				System.out.println("charater is not alphabet");
			}
		}else {
			System.out.println("enter single character only");
		}
		
		
	}
	
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
		s = new Scanner(System.in);
		Assignment1 obj = new Assignment1();
		obj.vowelOrNot();
		int n = 5, i =1;
		System.out.println(n+" * "+i+" = "+n*i);
		
	}
	
	
	
	
	

}
