package lec22_java_coding_challenge;

import java.util.HashSet;
import java.util.Set;

public class E04_findNumberWhichPresentMoreThanOne {

	public static void main(String[] args) {
		int [] number = {100, 77, 1, 5, 6, 1, 6, 8, 100, 55, 1, 7, 8, 5, 56, 100, 323, 2, 44, 12 };
		
		Set<Integer>duplicatedNumber = new HashSet<>();
		
		for (int i = 0; i < number.length; i++) { // 100
			for (int j = i + 1; j < number.length; j++) { // 77, 1, 5, 6, 1, 6, 8, 100, 55, 1, 7, 8, 5, 56, 100, 323, 2, 44, 12
				if (number[i] == number [j]) { // change is here
					duplicatedNumber.add(number[i]);
				}
			}
		}
		System.out.println("Duplicated numbers are: " + duplicatedNumber);
		// if you see the console, you will feel set doesn't follow indexing
	}

}
