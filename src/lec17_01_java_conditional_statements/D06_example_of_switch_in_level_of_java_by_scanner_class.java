package lec17_01_java_conditional_statements;

import java.util.Scanner;

public class D06_example_of_switch_in_level_of_java_by_scanner_class {

	public static void main(String[] args) {
		System.out.println("Please enter your level of Java here: ");
		Scanner scanner = new Scanner(System.in);
		int myLevelOfJava = scanner.nextInt();

		String level = null; // default value of int

		switch (myLevelOfJava) {

		case 1:
			level = "Beginner";
			break;

		case 2:
			level = "Intermediate";
			break;

		case 3:
			level = "Expert";
			break;

		case 4:
			level = "Excellent";
			break;

		default:
			level = "NA";
			break;

		}
		System.out.println("My Level of Java is: " + level);
		scanner.close();

	}

}

