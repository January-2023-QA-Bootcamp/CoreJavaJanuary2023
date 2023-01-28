package lec10_01_java_control_statements;

public class E_use_of_java_break {

	public static void main(String[] args) {
		System.out.println("\n---------- for loop  ----------\n");
		for (int i = 1; i <= 5; i++) { // 1, 2, 3, 4, 5
			System.out.println("The value is: " + i);
		}

		System.out.println("\n---------- for loop after break  ----------\n");
		for (int j = 1; j <= 5; j++) { // 1, 2
			if (j==3) { // if the condition meet the criteria, the code will move to body of condition, and break will work
				break;
				// break used inside condition, it shows error without using inside condition
			}
			System.out.println("The value is: " + j);
		}
		
		System.out.println("\n---------- for loop after break  ----------\n");
		for (int k = 1; k <=5; k+=2) { // 1, 3, 5
			if (k==4) { // if the condition doesn't meet, no break
				break;
			}
			System.out.println("The values is: " + k);
		}
		
		// Try to understand at least the for loop, that is enough, if you feel stress don't go below
		// See the code by yourself
		System.out.println("\n---------- while loop ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- while loop after break 01 ----------\n");
		int j = 0;
		while (j <= 10) { // regular outcome will be: 0, 2, 4, 6, 8, 10
			if (j == 7) {
				break;
			}
			System.out.println("The value is: " + j); // break is not implemented because no value as 7
			j=j+2;
		} 
		
		System.out.println("\n---------- while loop after break 02 ----------\n");
		int n = 1;
		while (n <= 10) { // normally 1, 3, 5, 7, 9
			if (n == 7) {
				break;
			}
			System.out.println("The value is: " + n); // break is implemented because 7 is present as value
			n=n+2;
		}
		
		System.out.println("\n---------- do while loop after break 01 ----------\n");
		int l = 1;
		do { // regular outcome is: 1, 3, 5, 7
			System.out.println("The value is: " + l);			
			if (l == 5) {
				break;
			}
			l = l + 2;
		} while (l <= 7);
		
		System.out.println("\n---------- do while loop after break 02 ----------\n");
		int m = 1;
		do {
			System.out.println("The value is: " + m);		// 1, 3, 5, 7
			// remember, in do while loop, sysout is present before break condition
			if (m == 6) {  // condition is absent, so break is not implemented
				break;
			}
			m = m + 2;
		} while (m <= 7);
		
	}

}
