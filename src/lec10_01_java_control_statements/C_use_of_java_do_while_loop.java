package lec10_01_java_control_statements;

/*
do while loop
all the loop contain: initialization block, conditional block and increment or decremental block
common mistakes: type of variable (like: int), semicolon (;) -- we put coma instead 

what is the difference between while and do while loop? very important interview question (100%)
*/

public class C_use_of_java_do_while_loop {

	public static void main(String[] args) {
		System.out.println("\n-------------- for loop --------------\n");
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- do while loop 01 ----------\n");
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j<=10);
		
		// very very important interview question: what is the difference between while loop and do while loop?
		
		System.out.println("\n---------- do while loop 02, condition is not true ----------\n");
		int k = 2;
		do {
			System.out.println("The value is: " + k);
			k+=2; // same as k=k+2
		} while (k > 4); // the value of k will be evaluated from line 31, change the condition to >=4, you can see
		// as the condition is not true, loop stop after 1st iteration
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
