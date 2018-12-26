package Ahalyaassignments;

public class AbstractionMainMethod {
	public static void main(String[] args) {
		Father obj=new Son();
		obj.sum();
		obj.sub();
		obj.mul();
		obj= new Daughter();
		obj.sum();
		obj.sub();
		
		
	}

}
