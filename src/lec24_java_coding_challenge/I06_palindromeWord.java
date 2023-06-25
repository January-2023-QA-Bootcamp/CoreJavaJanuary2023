package lec24_java_coding_challenge;

// BOB
// RACECAR = Palindrome word
// MALAYALAM = Palindrome word
// NAALAYALAM = Not Palindrome word

public class I06_palindromeWord {

	public static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;

		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("RACECAR"));
		System.out.println(isPalindrome("EATHRUAE"));
		System.out.println(isPalindrome("L"));
		// Mathematically, yes, a single letter word is palindromic

	}

}
