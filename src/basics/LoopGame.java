package basics;

import java.util.Scanner;

public class LoopGame {
	public static void main(String[] args) {
		int score = 0;
		int lives = 3;
		String value;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("enter something");
			value = s.next();
			if(value.length() % 2 == 0) {
				score += 10;
				continue;
			}else {
				lives--;
			}
			if(lives == 0) {
				break;
			}
		}while(true);
		
		System.out.println("your score is "+score);
	}

}
