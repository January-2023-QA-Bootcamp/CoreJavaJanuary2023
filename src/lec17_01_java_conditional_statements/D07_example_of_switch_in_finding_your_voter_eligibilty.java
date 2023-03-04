package lec17_01_java_conditional_statements;

import java.util.Scanner;

public class D07_example_of_switch_in_finding_your_voter_eligibilty {

	public static void main(String[] args) {
		System.out.println("Please read carefully");
		System.out.println("Print 1 for age 0-17,  2 for 18-29,  3 for 30-64,  4 for 65+, other = invalid condition");
		System.out.println("Print your age now : ");
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		switch (age) {
		
		case 1:
			System.out.println("You are under 18. you can't vote.");
			break;
		
		case 2:
			System.out.println("You just become eligible to vote.");
			break;
				
		case 3:
			System.out.println("You are a voter for long time, no need to register.");
			break;
			
		case 4:
			System.out.println("You are a voter for long time, do you need any assistance?");
			break;	
			
		default:
			System.out.println("Please give the valid age.");
			break;
		}
		scanner.close();

	}

}

