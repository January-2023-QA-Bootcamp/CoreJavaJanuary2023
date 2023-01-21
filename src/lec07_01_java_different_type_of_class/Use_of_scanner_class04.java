package lec07_01_java_different_type_of_class;

import java.util.Scanner;

public class Use_of_scanner_class04 {
	public static void main(String[] args) {
		System.out.println("Please put your grade below: ");
		Scanner scanner = new Scanner(System.in); // this Scanner class allow me to write in the console
		float gradeInHW = scanner.nextFloat();
		float gradeInQuiz = scanner.nextFloat();
		float averageGrade = (gradeInHW + gradeInQuiz)/2;
		// no need to use f in the console, because float type use f at the Editor.
		System.out.println("\nThe Final grade of mine: " + averageGrade);
		scanner.close();
	}

}
