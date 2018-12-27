package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * List is used to store multiple values of similar data type
 * List size is dynamic
 * List is index based and index always starts with 0
 * List is an interface which is implemented by ArrayList and LinkedList
 * 
 */

public class ListDemo {
	public static void main(String[] args) {
//		List<String> courses = new ArrayList<String>();
		List<String> courses = new LinkedList<String>();
		
//		add the data to the list
		courses.add("core java"); 
		courses.add("Python");
		courses.add("c#");
		courses.add("SAP");
		courses.add("testing");
		
//		get the number of elements inside the list
		System.out.println(courses.size());
		
//		check list is empty or not
		System.out.println(courses.isEmpty());
		
//		retrieve the data from the list
		System.out.println(courses.get(3));
		
//		print all the contents of list
		System.out.println(courses);
		
//		we can get all the data from the list by iterating over it
		for(String course : courses) {
			System.out.println(course);
		}
		
//		insert data in the list based on index value
		courses.add(2, "AWS");
		System.out.println(courses);
		
//		update the data a given index
		courses.set(3, ".net");
		System.out.println(courses);
		
//		search for data inside a list
		System.out.println(courses.contains("Python"));
		
//		remove the data from the list using index value
		courses.remove(3);
		System.out.println(courses);
		
//		remove the data from the list using value
		courses.remove("SAP");
		System.out.println(courses);
		
//		remove all the contents of the list
		courses.clear();
		
		System.out.println(courses);
		
		
		
	}
}
