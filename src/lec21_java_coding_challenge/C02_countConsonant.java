package lec21_java_coding_challenge;

//Que: Write a method to find the number of vowels from the String? Vowel: a, e, i, o, u

public class C02_countConsonant {
	
	public static String countConsonant (String s) {
		s = s.toLowerCase(); // here the whole String converted to lower case
		s = s.replaceAll("\\s", "");  // replacing all white space [\s stands for “whitespace character”]
		// if we don't remove white space, white space will be counted as no vowel
		// System.out.println(s);
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// in logical or operator: if one condition is true, then the whole condition is true
			// in logical and operator: if all condition is true, then the whole condition is true
			if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
				count ++;
			}
		}
		System.out.println("Number of Consonant: " + count);
		return s;
	}

	public static void main(String[] args) {
		countConsonant("A quick brown fox jumps over the lazy dog");
	}

}
