package lec18_02_java_control_statements;

public class D_use_of_nested_loop {

	public static void main(String[] args) {
		System.out.println("\n---------- nested loop (here, a for loop inside a for loop) ----------\n");
		// very important: nested for loop, we will use a lot during coding challenge in May/June
		for (int i = 0; i <= 2; i++) { // 0, 1, 2 --- outer loop
			for (int j = 0; j <= 3; j++) { // 0, 1, 2, 3 --- inner loop
				System.out.println(i + j);
				// 0+0, 0+1, 0+2, 0+3
				// 1+0, 1+1, 1+2, 1+3
				// 2+0, 2+1, 2+2, 2+3
			}
		}

		// not important
		// Below 2 is for example, but try to understand the first one
		System.out.println("\n---------- nested loop (here, a while loop inside a for loop) ----------\n");
		for (int k = 1; k <= 6; k += 2) { // 1, 3, 5
			// from line 22, while loop
			int l = 2;
			while (l <= 4) { // 2, 3, 4
				System.out.println(k * l);
				l++;
			}
		}

		// not important
		System.out.println("\n---------- nested loop (here, a while loop inside a while loop) ----------\n");
		int m = 1;
		while (m <= 6) {
			// line 34-38 is the inner while loop
			int n = 2;
			while (n <= 4) {
				System.out.println(n * m);
				n++;
			}
			m += 2; // tricky part , where is the first incremental block located
		}

	}

}
