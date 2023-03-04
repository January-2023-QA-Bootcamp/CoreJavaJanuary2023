package lec17_01_java_conditional_statements;

import java.util.Scanner;

public class D02_example_of_switch_in_using_day {
	public static void main(String[] args) {
		System.out.println("<-- Please print a day -->");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.nextLine();
		
		switch (day) {
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
			
		case "Sunday":
			System.out.println("Today is Sunday");
			break;

		case "Monday":
			System.out.println("Today is Monday");
			break;

		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;

		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;

		case "Thursday":
			System.out.println("Today is Thursday");
			break;

		case "Friday":
			System.out.println("Today is Friday");
			break;

		default:
			System.out.println("Please put a valid Day!!");
			break;
		}
		
		scanner.close();

		
	}

}
