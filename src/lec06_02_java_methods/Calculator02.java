package lec06_02_java_methods;

public class Calculator02 {
	// global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 39;
	int b = 21;
	
	String fName = "Mohammad";
	String lName = "Sharkar";
	
	// void type method
	public void addit () {
		int total = a+b; // here total1 is a local variable. why? because this variable belongs to the addition method
		System.out.println("Addition of a and b is: " + total);
	}
	
	// return type method
	public int addition () {
		int total1 = a+b;
		System.out.println("Addition of a and b is: " + total1);
		return total1;
		// return keyword should be the last statement of return type method
		// if you don't know what to return, then return the default value of that type : important info
		// here int default value is : 0	
	}
	
	public String myName () {
		String fullName = fName + " " + lName;
		System.out.println("My name: " + fullName);
		return fullName;
		// String default value is : null
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		return total2;
	}
					
	public boolean usCitizen() {
		System.out.println("I am not a US citizen");
		return false; // why false? not true? default value of boolean is false
	}

	
	
	
	
	
	
}
