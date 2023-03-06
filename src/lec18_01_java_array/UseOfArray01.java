package lec18_01_java_array;

import java.util.Arrays;

public class UseOfArray01 {

	public static void main(String[] args) {
		System.out.println("\n------------------------------------------------------------------------");
		// same data type or a cluster of data present
		// How to write Array: first data type, then [] called container, student (OBJECT) is the name of Array, [4] represent total 4 data is present
		// Array is static
		String [] student = new String [4]; // or you can use line 220
		student [0] = "Abdul Pasha";
		student [1] = "Alam";
		student [2] = "Sumaya";
		student [3] = "Tanjilla";
		
		System.out.println(student[3]);
		System.out.println(student[0]);
		System.out.println(student.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// or
		String [] stJanuary = new String [] {"Masud Rana", "Taslim", "Jahedul", "Saimul", "Shahid"};
		System.out.println(stJanuary[0]);
		System.out.println(stJanuary[4]);
		System.out.println(stJanuary.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// or	without new int [] 
		int [] age = {25, 30, 35, 47, 45, 23, 100, 44, 62};
		System.out.println(age[0]);
		System.out.println(age.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// char type
		char [] sex = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(sex[3]);
		System.out.println(sex.length);
		
		// New 
		int [] a = new int [5]; // declaring size of the array, 5 here
		// Array is fixed size (Array is static)
		// a is the name of the array
		// [] called container
		// Mixed data type can't be used, example: int and String can't mixed inside one Array
		
		a[0] = 5;
		a[1] = 15;
		a[2] = 'C'; // just know of ASCII table, explained at the end, no need to memorize
		
		a[4] = 3;
		
		System.out.println("\n------------- Printing single index value ------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]);// output: ?
		System.out.println("Printing single index value: " + a[4]);// output: ?
		System.out.println("Printing single index value: " + a[1]);// output: ?
		System.out.println("Printing single index value: " + a[2]);// output: ?
		// System.out.println("Printing single index value: " + a[5]);// output:
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
		// out of bounds for length 5
		// interview question: What is the exception you got if Array called is out of range?
		// ArrayIndexOutOfBoundsException 
		
		System.out.println("\nThe length of the array is: " + a.length); // interview question
		// length preserve the size of array, length is not a method, field or variable,
		// rather a parameter/properties
		
		// a = {5, 15, 50, 0, 56}
		// a.length = 5
		// index [0] = 5, index [1] = 15, index [2] = 50, index [3] = 0, index [4] = 56
		// a[4] = a[5-1] = a[a.length-1]
		// important interview question: How to find (what is the formula) the value for last index from an Array?
		System.out.println("\nPrinting the last number of the Array: " + a[a.length - 1]); 
		
		// Que: how can you find the second last index from an array?
		// Ans: a[a.length - 2])
		
		
		// very very important -->  toString(a) method
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
		// Array vs Arrays, Arrays is a class which is used to manipulate the Array
		// What will happen if you directly print by Array name or object? Ans: you will get the Array ID
		System.out.println(a); // get something else to check, it is run
		System.out.println("To find the list of an Array: " + Arrays.toString(a) + "\n");
		
		// Returns "null" if b is null.
		int [] b = new int [0]; // 0 elements, no elements there, also called null
		System.out.println("To find an Array when size is Null: " + Arrays.toString(b) + "\n"); // You will find Empty Array
		
		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + a); // Array ID
		// NOT IMPORTANT
		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(a));
		// hashCode of the Array used for representation of array by data	
		// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
		// NOT IMPORTANT
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(a, 15)); // which index is 15?
		// binary search to get the index position of the value from the ref

	}

}
