package lec06_01_java_casting;

// mostly used for converting float/double to byte/short/int/long

public class UseOfNarrowingCasting {

	public static void main(String[] args) {
		// default type access modifier
		double myGrade = 3.776563848;
		System.out.println("What is my Grade? Ans: " + myGrade);
		
		// How can you convert a double to an int type?
		// By Narrowing casting
		int myNewGrade = (int) myGrade;
		System.out.println("What is my new Grade in int? Ans: " + myNewGrade);
		
		// How can you convert a double to a byte type?
		// By Narrowing casting
		byte myNewGradeInByte = (byte) myGrade; // casting here
		System.out.println("What is my new Grade in byte? Ans: " + myNewGradeInByte);

	}

}
