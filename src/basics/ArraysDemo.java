package basics;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */
public class ArraysDemo {
	public static void main(String[] args) {
//		array declaration
		int[] marks = new int[6];

//		we can store data in an array using index numbers
		marks[0] = 21;
		marks[1] = 20;
		marks[2] = 22;
		marks[3] = 19;
		marks[4] = 23;
		marks[5] = 20;

//		retrive the data from an array using index numbers
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);

//		initialization of an array
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

//		length of the array
		System.out.println("number of elements of a array is " + a.length);

//		2D array
		int[][] numbers = new int[2][2];

//		store the data in array
		numbers[0][0] = 1;
		numbers[0][1] = 0;
		numbers[1][0] = 0;
		numbers[1][1] = 1;

		System.out.print(numbers[0][0] + "\t");
		System.out.print(numbers[0][1] + "\n");
		System.out.print(numbers[1][0] + "\t");
		System.out.print(numbers[1][1] + "\n");

//		initialize the 2D array
		String[][] names = { { "ahalya", "lakshmi" }, { "chandana", "spandana" } };
		System.out.println(names[0][0]);
		System.out.println(names[0][1]);
		System.out.println(names[1][0]);
		System.out.println(names[1][1]);

	}
}
