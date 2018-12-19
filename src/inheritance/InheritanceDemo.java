package inheritance;
/*
 * Inheritance means acquiring the properties and behavior (methods) of one class (parent or super or base)in 
 * another class (child or sub). The main advantage of Inheritance is code re-usability
 * 
 * There are 5 types of inheritance in Java
 * 
 * single: single parent and single child. A -> B
 * multilevel: parent and child and sub child. A->B->C
 * Hierarchical: single parent and multiple child. A->B A->C
 * multiple: multiple parent and single child. A->C B->C
 * Hybrid: combination hierarchical and multiple. 
 * 
 * 
 * multiple and hybrid inheritance is not possible directly in Java.
 * 
 * Inside the child class we can access Parent class properties and methods directly and outside the child class
 * By creating a child class object we can access parent class properties and methods
 * 
 * To achieve inheritance we have to use extends keyword
 * 
 * child class extends parent class
 * 
 * super keyword always represents the parent class instance. 
 */

public class InheritanceDemo {
	public static void main(String[] args) {
//		In child class static methods we have to create object of either parent class or child class to 
//		access parent class methods.
//		by creating an object of Parent class we can not access child class instance methods
		Parent pObj = new Parent();
		pObj.methodOne();

//		by creating an object of Child class we can access both parent and  child class objects
//		single inheritance
		ChildOne c1Obj = new ChildOne();
		c1Obj.childMethod(); // child one method
		c1Obj.methodOne(); //parent method
//		((SubChild)c1Obj).subChildMethod();
		
//		reference to the Parent class and object creation to the child class
		Parent obj = new ChildOne();
		obj.methodOne();
//		we can call child class methods by type casting parent class object to child class
		((ChildOne)obj).childMethod();
		
//		multilevel inheritance
		SubChild sObj = new SubChild();
		sObj.subChildMethod(); // sub child method 
		sObj.childMethod(); // child method
		sObj.methodOne(); // parent method
		
		
//		hierarchical (Parent - ChildOne and Parent - ChildTwo)
		ChildTwo c2Obj = new ChildTwo();
		c2Obj.childTwoMethod(); // child two method
		c2Obj.methodOne(); // parent method
		c1Obj.methodOne(); // parent method
		c1Obj.childMethod(); // child one method
		
	}
}
