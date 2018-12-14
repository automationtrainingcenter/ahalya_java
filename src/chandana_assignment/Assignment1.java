package chandana_assignment;

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
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		System.out.println("enter a character");
		char ch = new Scanner(System.in).next().charAt(0);
		boolean flag =false;
		for(char vowel : vowels) {
			if(ch == vowel) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("character is vowel");
		else
			System.out.println("character is not a vowel");
		
	}
	
	

}
