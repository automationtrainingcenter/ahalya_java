package chandana_assignment;

import java.util.Scanner;

public class Assignment1 {

	// write a method to find out given character is vowel or not using if else
	// statement
	static Scanner s;

	public void vowel() {
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.println("enter a character");
		ch = s.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			System.out.println("Given character is vowel");
		else
			System.out.println("given character is consonant");
	}

	// write a method to verify given number is palindrome or not

	public void palindrom() {
		int num, rem, orig, rev = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = scan.nextInt();

		orig = num;

		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (rev == orig) {
			System.out.println("This is a Palindrome Number");
		} else {
			System.out.println("This is not a Palindrome Number");
		}
	}

	// write a method to find factorial of a given number

	public void factorial() {
		int n, i, fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		n = s.nextInt();

		for (i = n; i > 0; i--) {
			fact = fact * i;
		}

		System.out.print("Factorial of " + n + " is " + fact);
	}

	// write a method to verify given number is prime or not

	public void prime() {
		int temp;
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = s.nextInt();
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is not a Prime Number");
	}

	// write a method to find sum and average of an array

	public void sumandaverage() {
		int n, sum = 0;
		float average;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}
		System.out.println("Sum:" + sum);
		average = (float) sum / n;
		System.out.println("Average:" + average);
	}

	// write a method to search an element in an array
	public void array() {
		int n, x, flag = 0, i = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Enter the element you want to find:");
		x = s.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] == x) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Element found at position:" + (i + 1));
		} else {
			System.out.println("Element not found");
		}

	}
	// write a method to reverse the given string

	public void reverse() {
		String original, reverse = "";
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a string to reverse");
		original = s.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		System.out.println("Reverse of the string: " + reverse);
	}

	// write a method which will convert the case of alternate words of a string
	// ex: This is a sample string after conversion THIS is A sample STRING
	public void convertCaseOfString() {
		System.out.println("enter a string");
		String str = s.nextLine();
//		String[] words = str.split(" ");
		char[] chars = str.toCharArray();
		String convertedStr = "";
		for(int i = 0; i< chars.length; i++) {
			if(i%2 == 0) {
//				string case conversion
//				chars[i] = chars[i].toUpperCase();
//				character case conversion
				chars[i] = Character.toUpperCase(chars[i]);
			}
			convertedStr = convertedStr+chars[i];
		}
		System.out.println("converted string is : \n"+convertedStr);
	}
	

	// create a main method and call all the above methods

	public static void main(String args[]) {
		s = new Scanner(System.in);
		Assignment1 obj = new Assignment1();
//		obj.vowel();
//		obj.palindrom();
//		obj.factorial();
//		obj.prime();
//		obj.sumandaverage();
//		obj.array();
//		obj.reverse();
		obj.convertCaseOfString();
		s.close();
	}
}
