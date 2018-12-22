package finalkeyword;

/*
 * we can declare a variable, method and class as final
 * if we declare a variable as final then we can't change it's value i.e those variables constants
 * if we declare a method as final we can't override that method in child classes
 * if we declare a class as final we can't create child classes for that class but it can have parent
 */

public class FinalKeywordDemo {
	
	//final variable
	public final double PI = 3.14;
	
	public void changeFinalVariable() {
//		PI = 6.28;
	}
	

}
