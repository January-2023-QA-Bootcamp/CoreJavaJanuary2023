package lec17_01_java_conditional_statements;

import java.util.Scanner;

public class D05_example_of_switch_in_counting_month_of_birth {

	public static void main(String[] args) {
		System.out.println("Print the number of month you born: ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		String BirthMonth = null; // default value of String is null or empty
		
		switch (month) {
		
		case 1:
			BirthMonth = "January";
			break;

		case 2:
			BirthMonth = "February";
			break;

		case 3:
			BirthMonth = "March";
			break;

		case 4:
			BirthMonth = "April";
			break;

		case 5:
			BirthMonth = "May";
			break;

		case 6:
			BirthMonth = "June";
			break;

		case 7:
			BirthMonth = "July";
			break;

		case 8:
			BirthMonth = "August";
			break;

		case 9:
			BirthMonth = "September";
			break;

		case 10:
			BirthMonth = "October";
			break;

		case 11:
			BirthMonth = "November";
			break;

		case 12:
			BirthMonth = "December";
			break;

		default:
			BirthMonth = "Invalid";
			break;
		}
		
		System.out.println("Your Birth Month is: " + BirthMonth);
		scanner.close();

	}


}
