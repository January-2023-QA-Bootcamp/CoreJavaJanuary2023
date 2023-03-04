package lec17_01_java_conditional_statements;

import java.util.Scanner;

/*
Even number (2, 4, 6, 8, 10): A number divided by 2 with remainder 0.
Example - 56 : 56/2 --- divisor 2, quotient 28, remainder/modulus 0
Odd number (1, 3, 5, 7, 9) : A number divided by 2 with remainder 1.
Example - 37 : 37/2 --- divisor 2, quotient 18, remainder/modulus 1
Is 0 an Even Number? The answer is easy: Yes, zero is an even number. Usually, zero together with the even numbers, 
so certainly it is not an odd number. An even number is formally defined as an integer of the form n = 2x, 
where x is an integer.

Java Logical Operators: 
Logical operators are used to determine the logic between variables or values. example below:

&&  Logical and operator (Returns true if both statements are true, x < 5 &&  y < 10)
If both condition is true, outcome is true
If both condition is false, outcome is false
If one condition is true and one false, outcome is false

||    Logical or operator (Returns true if one of the statements is true, x < 5 || y < 4)
If both condition is true, outcome is true
If both condition is false, outcome is false
If one condition is true and one false, outcome is true

!     Logical not operator [Reverse the result, returns false if the result is true, (!(x < 5 && y < 10))] 

 */

public class CompareNumber09 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Scanner scanner = new Scanner(System.in);

		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();

		if (val1 % 2 == 0 || val1 < val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is less than " + val2);
		} else if (val1 % 2 == 1 || val1 < val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is less than " + val2);
		} else if (val1 % 2 == 0 || val1 > val2) {
			System.out.println(val1 + " is an even number or " + val1 + " is greater than " + val2);
		} else if (val1 % 2 == 1 || val1 > val2) {
			System.out.println(val1 + " is an odd number or " + val1 + " is greter than " + val2);
		} else {
			System.out.println("The system failed to execute your order");
		}

		scanner.close();
	}

}
