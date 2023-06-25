package lec24_java_coding_challenge;

//Que: Write a method to find the number of vowels from the String? Vowel: a, e, i, o, u

public class C01_countVowel {
	
	public static String countVowel (String s) {
		s = s.toLowerCase(); // here the whole String converted to lower case
		// line 10 is not mandatory here, but for C02 Class must
		s = s.replaceAll("\\s", ""); // replacing all white space [\s stands for “whitespace character”]

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// in logical or operator: if one condition is true, then the whole condition is true
			// in logical and operator: if all condition is true, then the whole condition is true
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
				count ++;
			}
		}
		System.out.println("Number of Vowel: " + count);
		return s;
	}

	public static void main(String[] args) {
		countVowel("Pack my box with five dozen liquor jugs");
	}

}
