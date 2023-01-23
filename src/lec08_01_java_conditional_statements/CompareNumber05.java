package lec08_01_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber05 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Scanner scanner = new Scanner(System.in);
		
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		
		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		} else if (val1 > val2){
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("The system failed to figure it out");
		}
		scanner.close();
	}

}
