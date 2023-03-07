package lec18_02_java_control_statements;

public class G_use_of_java_continue {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) { // 1, 2, 3, 4, 5
			System.out.println("The values is: " + i);
		}

		System.out.println("\n---------- for loop after continue 01  ----------\n");
		for (int i = 1; i <= 5; i++) { // Generally the outcome should be: 1, 2, 3, 4, 5
			if (i==3) {
				continue;  // if you use continue, this condition will only be skipped
				// continue used inside condition, it shows error without using inside condition
			}
			System.out.println("The values is: " + i);
		}
		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) { // Generally the outcome should be: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			if (i % 2 == 0) { // condition for the even numbers and
				continue; // continue will skip all the even number
			}
			System.out.println("The value is: " + i); // 1, 3, 5, 7, 9
		}
		
		System.out.println("\n---------- for loop after continue 02  ----------\n");
		for (int i = 1; i <= 10; i++) { // Generally the outcome should be: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
			if (i % 2 == 1) { // condition for the odd numbers and
				continue; // continue will skip all the odd number
			}
			System.out.println("The value is: " + i); // 2, 4, 6, 8, 10
		}
		
		// not important
		// Exception in while and do while loop for using continue
		// if feel trouble, skip below
		System.out.println("\n---------- while loop after continue ----------\n");
		int j = 1;
		while (j <= 9) {
			if (j == 5) {
				 j+=2; // important info:  this is an exception, because the outcome 5, doesn't go to print  and increment in next line, 
				// we use increment in line 42, now, 5 become 7
				// important: if you comment out line 42: the code don't proceed further and stopped like infinite loop
				continue;  
			}
			System.out.println("The value is: " + j); // 1, 3, 7, 9
			j+=2; 
		}
		
		System.out.println("\n---------- do while loop ----------\n");
		int k = 1;
		do {
			System.out.println("The value is: " + k);
			k = k + 2;
		} while (k <= 7);

		
		System.out.println("\n---------- do while loop after continue ----------\n");
		int l = 1;
		do {
			if (l == 5) {
				l=l+2; // this is an exception, because the outcome doesn't go to print  and increment in next line, we use increment here
				continue;
			}
			System.out.println("The value is: " + l);
			l = l + 2;
		} while (l <= 9);
				
		


	}

}
