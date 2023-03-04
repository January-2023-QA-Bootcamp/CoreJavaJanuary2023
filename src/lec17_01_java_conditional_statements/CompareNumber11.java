package lec17_01_java_conditional_statements;

import java.util.Scanner;

public class CompareNumber11 {

	public static void main(String[] args) {
		System.out.println("Please Enter your age here: ");
		Scanner scanner = new Scanner(System.in);
		// Creating variable for age
		int age = scanner.nextInt();
		
		// Condition: To donate blood, you must be greater than or equal to 18 years old and your weight should be more than 50 kg 
		
		// applying condition on age first
		if (age >= 18) { // outer if block
			System.out.println("Please Enter your weight here: ");
			// Creating variable for weight
			int weight = scanner.nextInt();
			
			// applying condition for weight below
			if (weight > 50) { // inner if block
				System.out.println("You are eligible to donate blood as your weight is " + weight + " kg and age is " +  age);
			} else {
				System.out.println("You are not eligible to donate blood as your weight is " + weight + " kg and age is " +  age);
			}
			
		} else {
			System.out.println("First, Your age should be more than or equal to 18 to donate blood");
		}
		scanner.close();
	}

}
