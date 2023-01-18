package lec06_02_java_methods;

public class Calculator05 {
	// global variable or class variable
	float a = 1.34f;
	float b = 3.22f;

	// return type method
	public float multiplication() {
		float total1 = a * b; // local variable
		System.out.println("Multiplication of a and b is: " + total1);
		return total1;
	}
	
	// return type parameterized method
	public float addition (float a, float b) { // parameter
		// Like constructor, we don't need to use this keyword to make a relation between global variables and parameter inside method
		float total2 = a+b; // local variable
		System.out.println("Addition of a and b is: " + total2);
		return total2;
	}
	
	
	// learning something new
	// return type and parameterized type method
	// inside parameterized method, we don't need this keyword like constructor
	public float division(float c, float d) { // parameter
		float total3 = c / d; // local variable
		System.out.println("Division of c and d is: " + total3);
		return total3;
	}
	
	// what is the difference between line 16 and 27?


}
