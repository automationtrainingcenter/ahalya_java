package basics;

import java.util.Scanner;

/*
 * If we want to execute a block of code for certain number of times then 
 * we are going to use loops
 * Every loop will have three parts
 * 1. initialization
 * 2. condition
 * 3. increment or decrement

 * In Java we have mainly 4 types of loops
 * Infinite loop: A loop which will run forever
 * 
 * 1. while loop
 * 		initialization;
 * 		while(expression){
 * 			statements;
 * 			increment/decrement;
 * 		}
 *  While will verify the condition first then only it'll execute the statements. 
 * 	i.e If the while condition is true then the statements inside the while block will be executed
 * 	The minimum iteration count is 0
 * 	
 * 2. do while loop
 * 		initialization;
 * 		do{
 * 			statements;
 * 			increment/decrement;
 * 		}while(expression);
 *  do-while loop will execute the statement inside the do block for first time then it will verify 
 *  the condition of while . If it is true then the statements inside do block will repeat execution 
 *  else do-while block will be terminated.
 *  The minimum iteration count is 1
 * 
 * 3. for loop
 * 		for(initialization; expression; increment/decrement){
 * 			statements;
 * 		}
 * The minimum iteration count is 0
 * 
 * 4. for-each loop
 * 		It is used iterate over an array or collection
 * 		for(array_type var_name : array_var_name){
 * 			statements;
 * 		}
 * 
 * 
 * we can terminate the loop based on some expression using "break" statement
 * we can skip the current iteration of the loop based on some condition using "continue" statement
 */

public class Loops {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// while loop even numbers until given number
		System.out.println("enter a number");
		int num = s.nextInt();
//	 	Initialization
		int i = 0;
		// condition
		while (i < num) {
			System.out.println(i);
//			increment
			i += 2;
		}

//		do while loop
		
		System.out.println("enter username");
		String username = s.next();
		if(username.equalsIgnoreCase("chandana")) {
			int count = 0;
			String password;
			do {
				System.out.println("enter password");
				password = s.next();
				if(password.equals("Aha1y@")) {
					System.out.println("welcome chandana");
					break;
				}else {
					count++;
				}
			}while(count < 3);
			if(count == 3) {
				System.out.println("account blocked");
			}
			
		}else {
			System.out.println("please check your username");
		}
		
//		for loop
		for(int j = 0; j <= 10; j++) {
			System.out.println(j);
		}
		
// 		continue statement
		int k = 0;
		while(k<10) {
			k++;
			if(k == 5) {
				continue;
			}
			System.out.println(k);
		}
		
//		break statement
		int l = 0;
		while(true) {
			if(l == 10) {
				break;
			}else {
				System.out.println(l);
				l++;
			}
			
		}

	}

}
