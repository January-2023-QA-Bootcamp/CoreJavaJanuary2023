package lec06_02_java_methods;

public class Calculator04 {
	// global variable or class variable
	// default type of access modifier is used, no reason, just for practice
	int a = 39;
	int b = 21;
	
	// return type method
	public int addition () {
		int total1 = a+b;
		System.out.println("Addition of a and b is: " + total1);
		return total1;
		// return keyword should be the last statement of return type method
		// if you don't know what to return, then return the default value of that type : important info
		// here int default value is : 0	
	}
	
	// return type method
	public int subtraction() {
		int total2 = a-b;
		System.out.println("Subtraction of a and b is: "+total2);
		addition(); // we can call method inside a method
		return total2;
	}
					
}
