package lec17_01_java_conditional_statements;

import java.util.Random;

public class CompareNumber06 {

	public static void main(String[] args) {
		System.out.println("---: Please put number belows :---");
		Random random = new Random();

		int val1 = random.nextInt(100);
		int val2 = random.nextInt(100);

		if (val1 < val2) {
			System.out.println(val1 + " is less than " + val2);
		} else if (val1 > val2) {
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1 == val2) {
			System.out.println(val1 + " is equal to " + val2);
		} else if (val1 != val2) { // This not equal to represent line 14 and 16
			System.out.println(val1 + " is not equal to " + val2);
		} else if (!(val1 == val2)) { // This logical not also represent line 14, 16, 20
			// logical not operator is generally used for 2 condition, coming next
			System.out.println(val1 + " is not equal to " + val2);
		} else {
			System.out.println("The system failed to figure it out");
		}

	}

}
