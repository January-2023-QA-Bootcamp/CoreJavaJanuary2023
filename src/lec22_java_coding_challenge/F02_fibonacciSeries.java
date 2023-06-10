package lec22_java_coding_challenge;

import java.util.Arrays;

/*
Fibonacci series: (no negative number]
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, .............
= 0, 1, (1+0), {(1+0)+1}, [{(1+0)+1}+(1+0)], ...............
*/

public class F02_fibonacciSeries {

	// Que: Find first 10 fibonacci series number
	public static int getFibonacci (int n) {
		int [] index = new int [n];
		// index [0] = 0;
		// index [1] = 1;
		
		for (int i = 0; i <n; i++) {
			if (i<2) {
				index [i] = i;
			} else {
				index [i] = index [i-1] + index [i-2];
			}
		}
		System.out.println(Arrays.toString(index));
		return n;
	}

	public static void main(String[] args) {
		getFibonacci(10);

	}

}
