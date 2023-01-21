package lec07_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class03 {

	public static void main(String[] args) {
		System.out.println("Please Type your Full Name: ");
		Scanner scanner = new Scanner(System.in);
		String fullName =  scanner.nextLine(); // nextLine() -- Reads Strings value from the user
		System.out.println("\nHey! " + fullName + ". Now You know how the Scanner class works!");
		scanner.close();
	}

}
