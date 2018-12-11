package basics;

public class StringMethods {
	public static void main(String[] args) {
		String s1 = "selenium";
		String s2 = "";
		
		String s3 = " webdriver";
		String s4 = "AHALYA";
		String s5 = "welcome to the selenium course with Java programming launguage";
		String s6 = "                          actual text                          ";
		/*
		 * length() : which will return an integer value which is the number of
		 * characters in the given string
		 */
		System.out.println(s1.length());//8
		System.out.println(s4.length()); // 6
		
		/* isEmpty() : returns true if a given string is an empty string */
		System.out.println(s1.isEmpty()); //false
		System.out.println(s2.isEmpty()); //true
		
		/* concat(): combines two given strings */
		System.out.println(s1.concat(" webdriver")); //selenium webdriver
		System.out.println(s1.concat(s3));
		
		/* equals(): verifies two strings by considering case */
		System.out.println(s1.equals("Selenium")); // false
		System.out.println(s4.equals("AHALYA")); //True
		/*
		 * equalsIgnoreCase(): verifies two strings are equal or not without considering
		 * the case
		 */
		System.out.println(s1.equalsIgnoreCase("SeleNium")); //true
		System.out.println(s4.equalsIgnoreCase("ahalya")); //true

		/*
		 * contains(): verifies a given substring is available inside the given string
		 * or not
		 */
		System.out.println(s5.contains("Java")); //true
		System.out.println(s5.contains(s1)); //true

		/* toLowerCase(): converts given string to lower case */
		System.out.println(s4.toLowerCase()); //ahalya
		System.out.println("ChanDana".toLowerCase()); //chandana
		
		/* toUpperCase(): converts given string to upper case */
		System.out.println(s1.toUpperCase()); //SELENIUM
		System.out.println("ChanDana".toUpperCase()); //CHANDANA
		
		/* charAt(): returns a character at a given index number */
		System.out.println(s1.charAt(7)); //m
		System.out.println(s4.charAt(3)); // L
		
		/* indexOf(): returns index value of first occurrence of a given character */
		System.out.println(s1.indexOf('u')); //6
		System.out.println("chandana".indexOf('a')); //2
		
		/* stratsWith(): verifies a given string starts with given substring */
		System.out.println(s1.startsWith("sel")); //true
		System.out.println(s5.startsWith("Welcome")); //false
		
		/* endsWith(): verifies a given string ends with given substring */
		System.out.println(s5.endsWith("launguage")); //true
		System.out.println(s4.endsWith("ya")); //false
		
		/*
		 * replace(): it will replace given old character or old substring with new
		 * character or new substring
		 */
		System.out.println(s1.replace('e', 'E'));
		System.out.println(s5.replace("Java", "Python"));
		
		/*
		 * substring(): returns substring from a given string based on beginning and
		 * optional ending index values
		 * Note: substring() will include the beginning index character and excludes ending
		 * index character
		 */
		System.out.println(s1.substring(3));
		System.out.println(s5.substring(12, 17));
		

		/* toCharArray() return an array of characters inside the given string */
		char[] letters = s4.toCharArray();
		System.out.println(letters.length);
		System.out.println(letters[3]+"\t"+ s4.charAt(3));
		
		/*
		 * split() return an array of substrings inside the given string, divided based
		 * on some expression
		 */
		String[] words = s5.split(" ");
		System.out.println(words.length);

		/*
		 * trim() which will remove extra spaces at beginning and ending of given string
		 */
		System.out.println(s6.trim());


	}

}
