package lec22_java_coding_challenge;

import java.util.Arrays;

public class D02_smallestNumber {

	public static int smallest(int[] number) {
		int smallest = number[0];

		for (int i = 1; i < number.length; i++) {
			if (number[i] < smallest) {
				smallest = number[i];
			}
		}

		System.out.println(smallest);
		// below line is just to check --> how is the Array look like now, is there any changes happened in indexing
		// System.out.println(Arrays.toString(number));
		return smallest;
	}

	public static void main(String[] args) {

		// This is an array, number is the name of the array and type is int type, [] container
		int [] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 6, 4, 5, 5 };
		/*
		 * number[0] = 12; number[1] = 10; number[2] = 100; .......................
		 * number[number.length-1]
		 */
		// System.out.println(number.length);
		
		smallest(number);

	}

}
