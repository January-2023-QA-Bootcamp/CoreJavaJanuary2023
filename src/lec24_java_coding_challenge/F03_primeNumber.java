package lec24_java_coding_challenge;

/*

Prime number is a positive natural number that has only two positive natural number divisors -> 1 and the number itself.

Prime numbers are subset of natural numbers. A natural number is a positive natural number that has at least one positive divisor other than one or itself.

The number 1 is not a prime number by definition - it has only one divisor.

The number 0 is not a prime number - it is not a positive number and has infinite number of divisors.

Prime numbers list
List of prime numbers up to 100: 

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, ...

Is 0 a prime number?
The number 0 is not a prime number.

Zero is not a positive number and has infinite number of divisors.

Is 1 a prime number?
The number 1 is not a prime number by definition.

One is has one divisor - itself.

Is 2 a prime number?
The number 2 is a prime number.

Two has 2 natural number divisors: 1 and 2

2 / 1 = 2

2 / 2 = 1

Is 6 a prime number?
6/2 = 3
6/3 = 2
6/1 = 6
6/6 = 1
so, 6 is not a prime number

I introduce what is divisor, what is remainder and what is divider
7/3 ---> divisor is 3, remainder is 1, quotient is 2

 * */

// Can you tell how many prime number present within 30?


public class F03_primeNumber {
	// A specific number is a prime Number?
	public static boolean isPrimeNumber(int n) {
		if (n<2) {
			return false;
		}
		for (int i=2; i<n; i++) {
			if (n%i==0) {
				return false; // because they are even number
			}
		}
		return true;
	}
	
	// how many prime number present between 50?
	public static void findPrimeNumber (int number) {
		for (int i =0; i<=number; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + ", ");
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Is The number a Prime Number? : " + isPrimeNumber(19));
		findPrimeNumber(50);
	}

}
