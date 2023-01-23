package lec08_01_java_conditional_statements;

/*
Conditional Statement:
Conditional Statements allow the program to behave differently based on condition. 
Below keywords are used
Example: if, else, else if, switch. 
Regarding condition: First condition we have to always use 'if' keyword.
now, if the condition is true, the body will be executed. 
if the condition is false, the body will be skipped
Generally we don't use - 2 if condition (code wise OK), 
Generally the true statement is written at the end.
 */

public class CompareNumber01 {

	public static void main(String[] args) {
		int val1 = 67;
		int val2 = 23;
		
		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		}
		
		if (val1 > val2) {
			System.out.println(val1 + " is greater than " + val2);
		}

	}

}
