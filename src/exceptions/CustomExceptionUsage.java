package exceptions;

import java.util.Scanner;

public class CustomExceptionUsage {
	public static void launchBrowser(String br) throws InvalidBrowserException {
		if (br.equalsIgnoreCase("chrome")) {
			System.out.println("chrome browser launched");
		} else if (br.equalsIgnoreCase("firefox")) {
			System.out.println("firefox browser launched");
		} else {
			throw new InvalidBrowserException();
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter a browser");
		String br = s.next();
		try {
			launchBrowser(br);
		} catch (InvalidBrowserException e) {
			System.out.println(e.getMessage());
		}

	}

}
