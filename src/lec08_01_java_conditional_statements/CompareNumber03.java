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
rather we use 'if' as first condition and 'else' or 'else if' as second condition. 
Generally the true statement is written at the end.
When we write 'else' keyword, no condition is necessary to write,
Whatever you want to print, it will be printed in else block. 
either it is true or false, correct or incorrect, it doesn't matter
But if we wish to write a second condition , we have to use 'else if', not 'else' 
The last condition is generally else, but not always
If condition and else condition is used one time in the execution

 */

public class CompareNumber03 {

	public static void main(String[] args) {
		int val1 = 27;
		int val2 = 67;
		
		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		} else if (val1 > val2){
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else {
			System.out.println("The system failed to figure it out");
		}

	}

}
