package Ahalyaassignments;

import java.util.Scanner;

public class Conditional {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int num = s.nextInt();
		if (num > 0) {
			System.out.println("num is positive");
		}
		if (num % 2 == 0) {
			System.out.println("num is even ");
		} else {
			System.out.println("num is odd");
		}
		if (num > 0 && num < 50) {
			System.out.println("fail");
		} else if (num > 50 && num < 70) {
			System.out.println("passed");
		} else if (num > 70 && num <= 100) {
			System.out.println("distinction");
		} else {
			System.out.println("check ur marks");
		}

		System.out.println("enter username:");
		{
			String username = s.next();
			if (username.equalsIgnoreCase("Ahalya")) {
				System.out.println("enter password:");
				String password = s.next();
				if (password.equals("Ahaly@")) {
					System.out.println("welcome Ahalya");
				} else {
					System.out.println("invalid password");
				}
			} else {
				System.out.println("enter valid username");
			}
		}
		System.out.println("enter browser name");
		String brname = s.next();
		brname = brname.toLowerCase();
		switch (brname) {
		case "chrome":
			System.out.println("Launching chrome browser");
			break;
		case "safari":
			System.out.println("Launching safari browser");
			break;
		default:
			System.out.println("Launching IE browser");
		}
		System.out.println("enter ur name");
		String myName = s.next();
		myName = myName.toUpperCase();
		switch (myName) {
		case "AHALYA":
			System.out.println("welcome to ahalya");
			break;
		case "JYOTHI":
			System.out.println("welcome jyothi");
			break;
		default:System.out.println("welcome MAA");

		}
		System.out.println("enter name:");
		String s1=s.next();
		s1="AHALYA";
		s1=s1.concat(s1+"MANNE");
		System.out.println(s1);
		s1=s1.substring(2);
		System.out.println(s1);
		s1=s1.replace('A', 'a');
		System.out.println(s1);
		
		
		
				

	}

}
