package lec18_01_java_array;

import java.util.Arrays;

public class UseOfArray02 {

	public static void main(String[] args) {
		// This is new here
		int [] x = new int [] {15, 34, 59, 5, 28, 12}; 
		// Above is the alternate way to write Array, called literal representation, you will hear this words in the industry
		// int [] a = {15, 34, 59, 5, 28, 12}; 
		// you can also write like this way, most common way to write the Array
		// Literal representation of an int type Array
		// I didn't present - like a[0]=15, a[1]=34. no need to write that way, if you literally present the value inside the Array
		
		int [] a = new int [] {15, 34, 59, 5, 28, 12}; 
		System.out.println("\n------------- Printing single index value -------------\n");
		System.out.println("Printing single index value: " + a[0]); // output: ?
		System.out.println("Printing single index value: " + a[3]);// output: ?
		System.out.println("Printing single index value: " + a[4]);// output: ?
		System.out.println("Printing single index value: " + a[1]);// output: ?
		System.out.println("Printing single index value: " + a[2]);// output: ?
		
		System.out.println("First index value: " + a[0]);
		// Que: how can you find the last number from an array?
		// {15, 34, 59, 5, 28, 12}
		// a[5] = a [6-1] = a[a.length-1]
		System.out.println("Last index value: " + a[a.length - 1]); // important
		System.out.println("Second last index value: " + a[a.length - 2]); // important		
		System.out.println("To find the list of an (or what is inside the array) Array: " + Arrays.toString(a) + "\n");
		
		// This is New from here, also important
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Before sort of the Array: " + Arrays.toString(a) + "\n");
		Arrays.sort(a);
		// sort() method sorts the specified array of bytes into ascending numerical order.
		System.out.println("After sort of the Array: " + Arrays.toString(a) + "\n");
		
		System.out.println("\n------------------------------------------------------------------------");
		// How to find the smallest and largest number from an Array?
		// Answer: First sort the Array by Arrays.sort(a);, then a[0]=smallest, a[a.length-1]=largest
		// The interviewer don't like this answer
		System.out.println("Smallest value of Array is: " + a[0]);
		System.out.println("Largest value of Array is: " + a[a.length - 1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
