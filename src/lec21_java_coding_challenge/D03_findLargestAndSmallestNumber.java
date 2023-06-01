package lec21_java_coding_challenge;

public class D03_findLargestAndSmallestNumber {

	public static int[] desiredNumber(int[] number) { // remember this
		int largest = number[0];
		int smallest = number[0];

		for (int i = 1; i < number.length; i++) {
			if (number[i] > largest) {
				largest = number [i];
			} else if (number[i] < smallest) {
				smallest = number[i];
			}
		}

		System.out.println("The largest number is: " + largest);
		System.out.println("The smallest number is: " + smallest);
		// below line is just to check --> how is the Array look like now, is there any changes happened in indexing
		// System.out.println(Arrays.toString(number));
		return number;
	}

	public static void main(String[] args) {

		// This is an array, number is the name of the array and type is int type, [] container
		int [] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 6, 4, 5, 5 };
		/*
		 * number[0] = 12; number[1] = 10; number[2] = 100; .......................
		 * number[number.length-1]
		 */
		// System.out.println(number.length);
		
		desiredNumber(number);

	}

}
