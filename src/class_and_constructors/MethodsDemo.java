package class_and_constructors;
/*
 * There are 4 types of methods in Java
 * 1. method without arguments and without return type
 * 2. method without arguments and with return type\
 * 3. method with argument and without return type
 * 4. method with argument and with return type
 * 
 * every method contains 3 parts
 * method declaration
 * method body or method definition
 * method call
 * 
 * syntax to write a method declaration with method body
 * 		access_modifier return_type method_name(arg1, arg2, ... argN){
 * 			statements inside the body
 * 		}
 * 
 * here arguments are option, if method is not returning anything then the return type of the method is void
 * 
 *syntax to call a method
 *		return_type_data_type var_name = method_name(para1, para2, ... paraN);
 *
 *here parameters and return type variable are optional
 */

public class MethodsDemo {
	
//	method without return type and without arguments
	public void methodOne() {
		System.out.println("this is method one without arguments and without return type");
	}
	
//	method without return type and with arguments
	public void methodTwo(String arg) {
		System.out.println("this is method two without return type and with arguments");
		System.out.println("argument value is "+arg);
	}
	
//	method with return type and without argumets
	public String methodThree() {
		System.out.println("this is method three without arguments and with return type");
		System.out.println("the return value is");
		return "methodThreeReturnValue";
	}
	
//	method with return type and with arguments
	public String methodFour(String arg) {
		System.out.println("method four wiht argument and with return type");
		System.out.println("argument value is "+arg);
		System.out.println("the return value is ");
		return arg.concat(" methodFourReturnValue");
	}
	
	
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo();
		obj.methodOne();
		obj.methodTwo("ahalaya");
		String m3Result = obj.methodThree();
		System.out.println(m3Result);
		String m4Result = obj.methodFour("chandana");
		System.out.println(m4Result);
	}

}
