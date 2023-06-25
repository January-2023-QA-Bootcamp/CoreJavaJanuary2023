package lec24_java_coding_challenge;

public class H04_A_PlayWithString {
	public static void main(String args[]) {
		// Here s1 and s2 is object, not variable
		// when they are object, they have a memory location or reference number
		String s1 = new String("Test");
		String s2 = new String("Test");

		System.out.print("Results: ");
		
		if (s1 == s2) // comparing memory location
			System.out.print("Same");
		
		if (s1.equals(s2)) // Comparing content
			System.out.print("Equals");
	}

}

// (s1 == s2) comparing memory location number, which should not be same