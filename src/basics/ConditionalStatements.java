package basics;

import java.util.Scanner;

/*These are used to execute a block of statements based on some condition
 * ******** if ************
 * if(expression){
 * 		statements
 * }
 * if the expression true then the statements inside if block will be executed.
 * 
 * 
 * ************ if-else ************
 * if(expression){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if the expression is true the statements inside if block will be executed else statements 
 * inside else block will be executed
 * 
 * 
 * ************ else if ladder ************
 * if(expression 1){
 * 		statements;
 * }else if(expression 2){
 * 		statements;
 * }else if(expression 3){
 * 		statements;
 * }
 * .
 * .
 * .
 * }else if(expression n){
 * 		statements;
 * }else{
 * 		statements;
 * }
 * if expression 1 is true it will execute statements inside if block else if will expression 2 and 
 * if expression 2 is true it will execute statements inside expression 2 else if block else if will
 * verify next expression. if all the expressions are false then it will execute statements inside
 * else block
 * 
 * 
 * ************ nested if ************
 * if(expression 1){
 * 		if(expression 2{
 * 			statements;
 * 		}else{
 * 			statements;
 * 		}
 * }else{
 * 		statements;
 * }
 * 
 * 
 * ************ switch case: it will work based on value ************
 * switch(Value){
 * 		case value1;
 * 			statements;
 * 			break;
 * 		case value2:
 * 			statements;
 * 			break;
 * 		.
 * 		.
 * 		.
 * 		case valueN:
 * 			statements;
 * 			break;
 * 		default:
 * 			statements;
 * }
 * 	
 * 
 */

public class ConditionalStatements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int num = s.nextInt();
		if (num >= 0) {
			System.out.println("positive number");
		}

//		if else
		if (num % 2 == 0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
		
//		else if ladder
		if(num  < 40 && num >=0) {
			System.out.println("failed better luck next time");
		}else if(num < 50 && num >= 40) {
			System.out.println("passed in third class");
		}else if(num < 60 && num >= 50) {
			System.out.println("passed in second class");
		}else if(num < 70 && num >= 60) {
			System.out.println("passed in first class");
		}else if(num < 100 && num >= 70) {
			System.out.println("passed in destinction");
		}else {
			System.out.println("check your marks");
		}
		
//		nested if
		System.out.println("enter username");
		String username = s.next();
		if(username.equalsIgnoreCase("chandana")) {
			System.out.println("enter password");
			String password = s.next();
			if(password.equals("Aha1y@")) {
				System.out.println("welcome chandana");
			}else {
				System.out.println("invalid password");
			}
		}else {
			System.out.println("please check your username");
		}
		
		
//		switch case
		System.out.println("enter browser name");
		String brName = s.next();
		brName = brName.toLowerCase();
		switch(brName) {
		case "chrome":
			System.out.println("launching chrome browser");
			break;
		case "firefox":
			System.out.println("launching firefox browser");
			break;
		case "opera":
			System.out.println("launching opera browser");
			break;
		case "edge":
			System.out.println("launching edge browser");
			break;
		case "safari":
			System.out.println("launching safari browser");
			break;
		default:
			System.out.println("launching internet explorer browser");
		}
	}

}
