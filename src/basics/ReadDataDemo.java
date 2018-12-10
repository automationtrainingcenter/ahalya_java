package basics;

import java.util.Scanner;

/*to read data from the console we have to Scanner class
 * this class provides several methods to read different types of data
 */
public class ReadDataDemo {
	String name;
	int rollNum;
	static String collegeName;
	double fee;
	char gender;
	
	public void display() {
		System.out.println("name : "+name+"\nroll num : "+rollNum+"\ncollege name : "+collegeName+"\nfee : "+fee+"\ngender : "+gender );
	}
	
	public static void main(String[] args) {
		ReadDataDemo s1 = new ReadDataDemo();
//		create scanner class object
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name");
		s1.name = s.next();
		System.out.println("enter rollnum");
		s1.rollNum = s.nextInt();
		System.out.println("enter college name");
		ReadDataDemo.collegeName = s.next();
		System.out.println("enter fee");
		s1.fee = s.nextDouble();
		System.out.println("enter gender");
		s1.gender = s.next().charAt(0);
		
		
		s1.display();
	}

}
