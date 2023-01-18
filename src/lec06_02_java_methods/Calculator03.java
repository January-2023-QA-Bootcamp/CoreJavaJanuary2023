package lec06_02_java_methods;

public class Calculator03 {
	// global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 39;
	int b = 21;
	
	String fName = "Mohammad";
	String lName = "Sharkar";
	
	public Calculator03() {
		// Constructor can call methods too.
		// Why we need to put methods inside constructor?
		// if a class is instantiated, constructor is initialized, so if we put something need us during instatitation, then it helps
		addition();
		subtraction();
	}

	// return type method
	public int addition () {
		int total1 = a+b;
		System.out.println("Addition of a and b is: " + total1);
		return total1;
		// here int default value is : 0	
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
					
}
