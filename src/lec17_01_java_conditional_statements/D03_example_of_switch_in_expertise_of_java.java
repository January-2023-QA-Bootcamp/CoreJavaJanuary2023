package lec17_01_java_conditional_statements;

import java.util.Scanner;

public class D03_example_of_switch_in_expertise_of_java {

	public static void main(String[] args) {
		System.out.println("<-- Please Write about your Java level  -->");
		Scanner scanner = new Scanner(System.in);
		String myLevelOfJava = scanner.nextLine();

		switch (myLevelOfJava) {

		case "Beginner":
			System.out.println("I am at the beginning level");
			break;

		case "Intermediate":
			System.out.println("I am at the Intermediate level");
			break;

		case "Expert":
			System.out.println("I am an expert in Java");
			break;

		case "Excellent":
			System.out.println("I have a Java certification from Oracle");
			break;

		default:
			System.out.println("I am a drop out");
			break;

		}
		scanner.close();

	}

}
