package lec17_01_java_conditional_statements;

import java.util.Random;


/*
Even number (2, 4, 6, 8, 10): A number divided by 2 with remainder 0.
Example - 56 : 56/2 --- divisor 2, quotient 28, remainder/modulus 0
Odd number (1, 3, 5, 7, 9) : A number divided by 2 with remainder 1.
Example - 37 : 37/2 --- divisor 2, quotient 18, remainder/modulus 1
Is 0 an Even Number? The answer is easy: Yes, zero is an even number. 
Usually, zero together with the even numbers, 
so certainly it is not an odd number. An even number is formally defined as an integer of the form n = 2x, 
where x is an integer.

an odd or even number can als0 be negative
 */

public class CompareNumber07 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Random random = new Random();

		int val1 = random.nextInt();
		
		if (val1 % 2 == 0) {
			System.out.println(val1 + " is an even number");
		} else if (val1 % 2 ==1) {
			System.out.println(val1 + " is an odd number");
		} else {
			System.out.println("Please put a valid number");
		}
		
	}

}
