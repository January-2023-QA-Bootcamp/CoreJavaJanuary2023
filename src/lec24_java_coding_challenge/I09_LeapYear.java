package lec24_java_coding_challenge;

import java.util.Scanner;

/*
 A leap year is exactly divisible by 4 except for century years (years ending with 00). 
 The century year is a leap year only if it is perfectly divisible by 400.
 */

public class I09_LeapYear {
	public static boolean isLeapYear(int year) {
		// if the year is divided by 4
		if (year % 4 == 0) {
			// if the year is century, and divided by 4 is not leap year, so we have to make sure they are century by dividing by 100
			if (year % 100 == 0) {
				// A century is a leap year when divided by 400
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				// if the year is not century
				return true;
			}
		} else {
			return false; // not leap year
		}

	}

	public static void main(String[] args) {
		System.out.println("please enter the year");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		System.out.println(isLeapYear(year));
		scanner.close();
	}

}
