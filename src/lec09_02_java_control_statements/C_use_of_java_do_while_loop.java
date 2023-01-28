package lec09_02_java_control_statements;

public class C_use_of_java_do_while_loop {

	public static void main(String[] args) {
		System.out.println("\n-------------- for loop 01 --------------\n");
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n---------- while loop 01  ----------\n");
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n---------- do while loop ----------\n");
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j<=10);
		

	}

}
