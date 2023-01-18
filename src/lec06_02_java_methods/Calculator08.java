package lec06_02_java_methods;

// not important

public class Calculator08 {
	// Global variable or class variable
	// default type of access modifier is used
	byte a = 60;
	byte b = 60;

	// Not necessarily important: extra information
	// return type method
	// in terms of byte without casting, not possible to execute code, need some research.
	// need answer immediately
	public byte division() {
		byte total1 = (byte) (a / b);
		System.out.println("Division of a and b is: " + total1);
		return total1;
	}
	
	// how the result is 16, while it should be 3600, out of range of byte
	// 60 * 60 = 3600 which is 111000010000 in binary form.
	// byte is a 8-bits data form. Therefore it will truncate into 8 bits of the data which is equivalent to 
	// 00010000 which is 16 in decimal. Hope this answer your question.
	// https://stackoverflow.com/questions/24236140/multiplying-two-byte-numbers
	public byte multiplication() {
		byte total2 = (byte) (a*b);
		System.out.println("Multiplication of a and b is: "+total2);
		return total2;
	}


}
