package encapsulation;

import accessmodifiers.AccessModifiersDemo;

public class ProtectedDemo extends AccessModifiersDemo{
	public static void main(String[] args) {
		ProtectedDemo obj = new ProtectedDemo(); // child class object of AccessModifiersDemo parent
		System.out.println(obj.pVar);
//		System.out.println(obj.prVar); // can't be accessed outside the class
//		System.out.println(obj.dVar); // can't be accessed outside the package
		System.out.println(obj.proVar);// protected can be accessed outside the package by creating child class objects
	}

}
