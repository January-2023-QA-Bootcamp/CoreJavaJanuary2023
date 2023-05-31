package lec20_java_coding_challenge;

//  Monjurul

public class A06_ConvertSumOfTwoNumbersToAReverseString {

	public static void main(String[] args) {
		int firstNumber = 100;
	    int secondNumber = 200;
	    
	    int sum = firstNumber + secondNumber;
	    System.out.println("Sum of Two Numbers as int: " + sum);
	    // Conversion from int to String
	    String str = String.valueOf(sum);
	    System.out.println("Sum of Two Numbers as String: " + str);
	    
	    String reverseString = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	    	// System.out.print(str.charAt(i)); // if you use it you can't use any string inside it, it will directly print 003
	    	reverseString = reverseString + str.charAt(i);
	    	// System.out.println(reverseString); // to see how the line 20 behaving
	    }
	   System.out.println("Reverse string: " + reverseString);
	    
	  }

}
