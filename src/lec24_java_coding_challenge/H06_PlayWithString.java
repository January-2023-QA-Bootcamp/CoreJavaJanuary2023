package lec24_java_coding_challenge;

public class H06_PlayWithString {

	public static void main(String[] args) {
		String s = "Java Java";
		s.replace('a', '@');
		System.out.println(s);
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replaceAll(s, "We wanna know"));
		// Main clue: String is immutable
	}

}
