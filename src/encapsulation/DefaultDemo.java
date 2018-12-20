package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class DefaultDemo {
	public static void main(String[] args) {
		AccessModifiersDemo obj = new AccessModifiersDemo();
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar); // can't access outside the class
//		System.out.println(obj.dVar); //can't access outside the package
//		System.out.println(obj.proVar); //can't access outside the package
	}

}
