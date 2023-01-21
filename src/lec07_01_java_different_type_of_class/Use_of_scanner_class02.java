package lec07_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class02 {

	public static void main(String[] args) {
		System.out.println("Please put values below: ");
		Scanner scanner = new Scanner(System.in);
		// if we want to put more than one int, it is possible by below way
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		int val3 = scanner.nextInt();		
		int total = val1 + val2 + val3;
		System.out.println("\nThe sum of the val1, 2 and 3 is: " + total);
		scanner.close();

	}

}
