package lec24_java_coding_challenge;

// Armstrong number is a number that is equal to the sum of cubes of its digits. 
// For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
// 153 = (1X1X1)+(5X5X5)+(3X3X3)= 153
// Not important

public class I07_armstrongNumber {

	public static boolean isArmstrongNumber(int num) {
		System.out.println("The " + num + " is Armstrong Number ?");		
		int remainder = 0; // Remainder
		int cube = 0; // change here
		int total = num; // total
		
		while (num > 0) {
			remainder = num % 10;		
			cube = cube + (remainder * remainder * remainder); // change here
			num = num / 10;
		}
		
		if (total == cube) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(123)); // no
		System.out.println(isArmstrongNumber(153)); // yes
		System.out.println(isArmstrongNumber(407)); // yes

	}

}
