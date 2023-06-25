package lec24_java_coding_challenge;

public class H04_B_PlayWithString {
	public static void main(String args[]) {
		// Now they are variable
		String s1 = "Test";
		String s2 = "Test";
		System.out.print("Results: ");
		
		if (s1 == s2) // comparing content
			System.out.print("Same");
		
		if (s1.equals(s2)) // Comparing content
			System.out.print("Equals");
	}

}

// Both are different condition, not like if else, where the first correct condition will be printed
