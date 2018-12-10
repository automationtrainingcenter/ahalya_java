package basics;
/* String is set of characters.
 * In Java Strings will be stored in a separate memory area known as String Constant Pool
 * Strings are immutable i.e. we can't change String values.
 * 
 *	//declare
 *	String obj_name = new String(string value);
 *	
 *	//string declaration using String literal
 *	String obj_name;
 *	
 *	//assign
 *	obj_name = "value";
 *	
 *	//retrieve
 *	using obj_name we can retrieve String data
 *
 *	//initialization
 *	String obj_name = "value";
 *
 * 	String class provides so many methods to manipulate string data
 */ 
public class StringDemo {
	
	public static void main(String[] args) {
		String s1 = "ahalya";
		String s2 = "chandana";
		System.out.println(s1);
		System.out.println(s2);
		String s3 = s1;
		s1 = "srilakshmi";
		System.out.println(s1);
		System.out.println(s3);
	}

}
