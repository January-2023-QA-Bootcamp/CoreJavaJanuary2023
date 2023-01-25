package lec09_01_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber12 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();

		if (val1 % 2 == 0) { // outer if block
			if (val1 < val2) { // inner if block
				System.out.println(val1 + " is an even number and " + val1 + " is less than " + val2);
			} else if (val1 > val2) { // inner else if block
				System.out.println(val1 + " is an even number and " + val1 + " is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is equal to " + val2);
			} else if (val1 != val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is not equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an even number and " + val1 + " is less than or equal to " + val2);
			}
			
		} else if (val1 % 2 == 1) { // outer else if block
			if (val1 < val2) { // inner if block
				System.out.println(val1 + " is an odd number and " + val1 + " is less than " + val2);
			} else if (val1 > val2) { // inner else if block
				System.out.println(val1 + " is an odd number and " + val1 + " is greater than " + val2);
			} else if (val1 == val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is equal to " + val2);
			} else if (val1 != val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is not equal to " + val2);
			} else if (val1 >= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is greater than or equal to " + val2);
			} else if (val1 <= val2) {
				System.out.println(val1 + " is an odd number and " + val1 + " is less than or equal to " + val2);
			}
			
		} else {
			System.out.println("The system failed to execute your order");
		}
		scanner.close();
	}

}
