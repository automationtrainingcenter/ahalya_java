package abstraction;

public interface InterfaceDemo {
	
	void add();
	
	void sub();
	
//	from Java 8 interfaces allows static and default methods with definitions
	
	static void staticMethod() {
		System.out.println("static method of interface");
	}
	
	default void defaultMethod() {
		System.out.println("default method of interface");
	}

}
