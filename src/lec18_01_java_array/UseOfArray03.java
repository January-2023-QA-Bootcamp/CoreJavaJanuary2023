package lec18_01_java_array;

import java.util.Arrays;

public class UseOfArray03 {

	public static void main(String[] args) {
		int [] a = {15, 34, 59, 5, 0, 12}; 
		// you can also write Array like this way, the most common way to write the Array
		System.out.println("To find the list of an Array: " + Arrays.toString(a));
		
		// Printing all indexed Value one by one
		System.out.println("\n------------- Printing all index value of Array one by one by for loop -------------");
		for ( int i=0; i<a.length; i++) { 
			System.out.println(a[i]);
		}
		
		System.out.println("\n---------- Printing all index value of Array one by one by while loop ----------\n");
		int j = 0;
		while (j < a.length) {// when the condition is true, the loop started
			System.out.println(a[j]);
			j++;
		}

		System.out.println("\n---------- Printing all index value of Array one by one by do while loop ----------\n");
		int k = 0;
		do { // when the condition is true or false, the first loop will started
			System.out.println(a[k]);
			k += 1;
		} while (k < a.length);
		
		// new loop you are going to learn today --> for each loop
		// In Java, the for-each loop is used to iterate through elements of Array and collections (like ArrayList).
		// It is also known as the enhanced for loop.
		System.out.println("\n------------- Printing all index value of Array by for each loop -------------");
		for(int m: a) {  // here m is the name of the expected outcome
			System.out.println(m);
		}
		
		
		
		

	}

}
