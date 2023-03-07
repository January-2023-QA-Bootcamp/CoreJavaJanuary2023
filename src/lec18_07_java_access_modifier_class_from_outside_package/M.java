package lec18_07_java_access_modifier_class_from_outside_package;

public class M {
	int a = 60; // class variable or global variable
	int b = 30;

	// public type method
	public void m1() {
		int total1 = a + b;
		System.out.println("Addition of a and b is: " + total1);
	}

	// protected type method
	protected void m2() {
		int total2 = a - b;
		System.out.println("Subtraction of a and b is: " + total2);
	}

	// private type method
	private void m3() {
		int total3 = a * b;
		System.out.println("Multipliaction of a and b is: " + total3);
	}

	// default type method
	void m4() {
		int total4 = a / b;
		System.out.println("Division of a and b is: " + total4);

	}


}
