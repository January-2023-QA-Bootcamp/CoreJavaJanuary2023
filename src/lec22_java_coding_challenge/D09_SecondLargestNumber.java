package lec22_java_coding_challenge;

import java.util.Arrays;

public class D09_SecondLargestNumber {

	public static void main(String[] args) {

		int[] number = { 12, 10, 100, 5, 6, 2, 892, 77, 55, 7, 8, 5, 56, 323, 44, 12, 1456, 6, 4, 5, 5, -1};
		System.out.println(Arrays.toString(number));
		// System.out.println(number.length);
		
		int temp;
		
		for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j<number.length; j++) {
				if (number [i] > number [j]) {
					temp = number [i];
					number [i] = number[j];
					number [j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(number));
		System.out.println(number.length);
		System.out.println("Second largest number is:: " + number[number.length - 2]);
		System.out.println("Largest number is:: " + number[number.length - 1]);
		System.out.println("Smallest number is:: " + number[0]);
		System.out.println("Second Smallest number is:: " + number[1]);

	}

}
