package collections;
/*
 * Set does not allow duplicate values
 * Set is not index based
 * To retrieve the data from the set we have use iterator or for each loop
 * Set interface is implemented by 3 classes
 * HashSet: it will not maintain any order
 * LinkedHashSet: it will maintain insertion order
 * TreeSet: it will maintain ascending order for numeric data and alphabetical order for character data
 */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set<String> courses = new HashSet<>();
//		Set<String> courses = new LinkedHashSet<>();
		Set<String> courses = new TreeSet<>();
//		verify set is empty or not
		System.out.println(courses.isEmpty());
		
//		find the number of elements inside the set
		System.out.println(courses.size());

//		add data to the set
		courses.add("core java");
		courses.add("python");
		courses.add("c#");
		courses.add("sap");
		courses.add("testing");
		courses.add("python");

//		print data inside the set
		System.out.println(courses);

// retrieve the data using for loop
//		for(String course : courses) {
//			System.out.println(course);
//		}
		
		//retrieve data using iterator interface
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		remove the data from set
		courses.remove("SAP");
		System.out.println(courses);
		
//		search for a value inside the set
		System.out.println(courses.contains("Python"));
		
//		remove all the contents of the set
		courses.clear();
		System.out.println(courses);
	}

}
