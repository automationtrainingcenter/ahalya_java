package basics;
/*
 * In java we have mainly two types of data types
 * 1. primitive
 * 		boolean either true or false - Boolean
 * 		char which will store single character - Character
 *		byte store integer values - Byte
 *		short store integer values - Short
 *		int store integer values -Integer
 *		long store integer values - Long
 *		float store floating point number -Float
 *		double store floating point number - Double
 * 	
 * 2. reference
 * 		Arrays
 * 		Strings
 * 
 *  Wrapper class: For every primitive data_type we have an equivalent class in Java. Those classes
 * are known as Wrapper classes. These are used to perform different operations on data.
 * 		1. Boolean
 * 		2. Character
 * 		3. Byte
 * 		4. Short
 * 		5. Integer
 * 		6. Long
 * 		7. Float
 * 		8. Double
 * 
 * 	WCData_type obj_name = new WCData_type(value);
 * 
 * 	Type Casting: converting one type of data to another type of data
 * 	up casting: lower memory type to higher memory type : widening : no data loss
 * 	down casting: higher memory data type to lower memory data type : narrowing : data loss is possible
 * 
 * 	Converting primitive data type to wrapper class: boxing
 *  Converting wrapper to primitive : un-boxing
 * 
 * 
 * syntax to create primitive data type
 * data-type var-name  = value; //initialization
 * data-type var-name; //declaration
 * var-name = value; //assignment to the variable which is already declared
 * 
 * variable is nothing but name of memory location where we are storing data
 */


public class DataTypeDemo {
	
	public static void main(String[] args) {
//		boolean type
		boolean b = true;
		System.out.println("boolean value is " + b);
		
		
//		character type
		char ch = 'S';
		System.out.println("character value is " + ch);
		System.out.println("min value of character is " + Character.MIN_VALUE);
		System.out.println("max value of character is " + Character.MAX_VALUE);
		System.out.println("size of characer in bytes is " + Character.BYTES);
		System.out.println("size of character in bits is "+ Character.SIZE);
		
		
//		byte type
		byte by = 123;
		System.out.println("byte value is " + by);
		System.out.println("min value of byte is " + Byte.MIN_VALUE);
		System.out.println("max value of byte is " + Byte.MAX_VALUE);
		System.out.println("size of byte in bytes is " + Byte.BYTES);
		System.out.println("size of byte in bits is "+ Byte.SIZE);
		
		
//		short type
		short sh = 12345;
		System.out.println("short value is " + sh);
		System.out.println("min value of Short is " + Short.MIN_VALUE);
		System.out.println("max value of Short is " + Short.MAX_VALUE);
		System.out.println("size of Short in bytes is " + Short.BYTES);
		System.out.println("size of Short in bits is "+ Short.SIZE);
		
		
//		integer type
		int i = 1234567;
		System.out.println("integer value is " + i);
		System.out.println("min value of Integer is " + Integer.MIN_VALUE);
		System.out.println("max value of Integer is " + Integer.MAX_VALUE);
		System.out.println("size of Integer in bytes is " + Integer.BYTES);
		System.out.println("size of Integer in bits is "+ Integer.SIZE);
		
		
		
//		long type
		long l = 9876543210l;
		System.out.println("long value is " + l);
		System.out.println("min value of Long is " + Long.MIN_VALUE);
		System.out.println("max value of Long is " + Long.MAX_VALUE);
		System.out.println("size of Long in bytes is " + Long.BYTES);
		System.out.println("size of Long in bits is "+ Long.SIZE);
		
		
//		float type
		float f = 1234.555f;
		System.out.println("float value is " + f);
		System.out.println("min value of Float is " + Float.MIN_VALUE);
		System.out.println("max value of Float is " + Float.MAX_VALUE);
		System.out.println("size of Float in bytes is " + Float.BYTES);
		System.out.println("size of Float in bits is "+ Float.SIZE);
		
//		double type
		double d = 123444.554;
		System.out.println("double value is " + d);
		System.out.println("min value of Double is " + Double.MIN_VALUE);
		System.out.println("max value of Double is " + Double.MAX_VALUE);
		System.out.println("size of Double in bytes is " + Double.BYTES);
		System.out.println("size of Double in bits is "+ Double.SIZE);
		
		
//		type casting
//		up casting : lower to higher
		short s = 12345;
		int in = s;
		System.out.println(in);
		
//		down casting higher to lower
//		lower_data_type var_name = (lower_data_type) higher_type_var_name
		short st = 256;
		byte bt = (byte) st;
		System.out.println(bt);
		
//		float to int
		float ft = 123.44f;
		int it = (int) ft;
		System.out.println(it);
		
//		primitive to wrapper
		int ip = 20;
		Integer iw = Integer.valueOf(ip);
		
		double dp = 23.44;
		Double dw = Double.valueOf(dp);
		
//		wrapper to primitive
		Integer iwr =  new Integer(230);
		int ipr = iwr.intValue();
		
		Float fw = new Float(12.22);
		float fp = fw.floatValue();
		
		
//		reference to primitive
		String str = "12344";
		int i1 = Integer.parseInt(str);
		System.out.println(i1+10);
		
		String str1 = "122.33";
		float f1 = Float.parseFloat(str1);
		System.out.println(f1+10);
		
//		primitive to reference
		double d1 = 123.444;
		String s1 = Double.toString(d1);
		System.out.println(s1+10);
		
		long ln = 9876543210l;
		String sn = Long.toString(ln);
		System.out.println(sn+10);
	}

}
