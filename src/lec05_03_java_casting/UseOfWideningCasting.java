package lec05_03_java_casting;

public class UseOfWideningCasting {

	public static void main(String[] args) {
		int myHeight = 5;
		System.out.println("My height in ft is: " + myHeight);
		
		// How can you convert an int to a double type?
		// By Widening casting, you don't need to write the casting type in parentheses
		double myHeightInDouble = myHeight;
		System.out.println("My height in double type  is: " + myHeightInDouble);

	}

}
