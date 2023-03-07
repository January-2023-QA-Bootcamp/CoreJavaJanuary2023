package lec18_07_java_access_modifier_class_from_outside_package;

public class N {
	
	int a = 60; // class variable or global variable
	int b = 30;

	// public type method
	public int n1() {
		int total1 = a + b;
		System.out.println("Addition of a and b is: ");
		return total1;
	}

	// protected type method
	protected int n2() {
		int total2 = a - b;
		System.out.println("Subtraction of a and b is: " + total2);
		return total2;
	}

	// private type method
	private int n3() {
		int total3 = a * b;
		System.out.println("Multipliaction of a and b is: " + total3);
		return total3;
	}

	// default type method
	int n4() {
		int total4 = a / b;
		System.out.println("Division of a and b is: " + total4);
		return total4;
	
	}

}
