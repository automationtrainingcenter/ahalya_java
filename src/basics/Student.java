package basics;

public class Student {
	String name;
	static String instituteName;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name+"------------"+s1.instituteName);
		s1.name = "ahalya";
		Student.instituteName = "SSTS";
		System.out.println(s1.name+"------------"+s1.instituteName);
		
		Student s2 = new Student();
		s2.name = "chandaana";
		System.out.println(s2.name+"------------"+s2.instituteName);
	}

}
