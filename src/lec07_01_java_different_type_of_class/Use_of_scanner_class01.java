package lec07_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class01 {
	public static void main(String[] args) {
		System.out.println("Please Enter your Age: ");
		// How Scanner class is instantiated? by passing System.in as argument
		// System is a class, in is a (input) properties
		Scanner scanner = new Scanner(System.in); // this Scanner class allow me to write in the console
		int age = scanner.nextInt(); // nextInt() -- Reads an int value from the user
		System.out.println("\nYour Age is: " + age + ". You are allowed to Access this Page.");
		scanner.close();
	}

}
