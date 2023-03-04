package lec17_01_java_conditional_statements;

public class CompareNumber13 {

	public static void main(String[] args) {
		/*
		int age1 = 18;
		if (age1<18) {
			System.out.println("You can't vote");
		} else {
			System.out.println("You are a voter, you can vote");
		}
		*/
		
		// We can write the above code by below way also
		// Short-hand if else condition
		// There is also a short-hand if else, which is known as the ternary operator 
		// because it consists of three operands. It can be used to replace multiple lines of code with a single line. 
		// It is often used to replace simple if else statements
		// To learn more: https://www.w3schools.com/java/java_conditions.asp
	
		System.out.println("\n--------------------------------------------\n");
		// You can also use Scanner or Random class
		int age = 27;
		String outcome = (age<18) ? "You can't vote" : "You are a voter, you can vote";
		System.out.println(outcome);

	}

}
