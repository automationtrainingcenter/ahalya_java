package collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map is used to store data in key and value pairs
 * Map is not index based
 * Map is implemented by 3 classes
 * HashMap: will not maintain any order
 * LinkedHashMap: will maintain insertion order
 * TreeMap: will maintain alphabetical or ascending order of the keys
 */

public class MapDemo {
	public static void main(String[] args) {
//		Map<String, Integer> courses = new HashMap<>();
//		Map<String, Integer> courses = new LinkedHashMap<>();
		Map<String, Integer> courses = new TreeMap<>();
//		verify map contains data or not
		System.out.println(courses.isEmpty());
		
//		find the number of elements inside the map
		System.out.println(courses.size());
		
//		add data to the map
		courses.put("core java", 10);
		courses.put("python", 12);
		courses.put("c#", 4);
		courses.put("sap", 5);
		courses.put("testing", 15);
		
//		retrieve data from map
		System.out.println(courses.get("python"));
		
//		print map on the console
		System.out.println(courses);
		
//		retrieve data from map using for
//		get the keys from the map
		Set<String> keys = courses.keySet();
//		for(String key : keys) {
//			System.out.println(key+" : "+courses.get(key));
//		}
		Iterator<String>  kIt = keys.iterator();
		while(kIt.hasNext()) {
			String key= kIt.next();
			System.out.println(key +" = "+courses.get(key));
		}
		
//		get the values from the map
		Collection<Integer> values = courses.values();
		for(int value : values) {
			System.out.println(value);
		}
		
//		get the key value pairs
		Set<Entry<String, Integer>> entrySet = courses.entrySet();
		for(Entry<String, Integer> pair : entrySet) {
			System.out.println(pair.getKey() +" : "+ pair.getValue());
		}
		
//		
		courses.put("python", 16);
		System.out.println(courses);
		
		courses.put("selenium", 9);
		System.out.println(courses);
		
//		remove
		courses.remove("selenium");
		System.out.println(courses);
		
		courses.remove("c#", 8);
		System.out.println(courses);
		
		
//		remove all the contents
		courses.clear();
		System.out.println(courses);
	}

}
