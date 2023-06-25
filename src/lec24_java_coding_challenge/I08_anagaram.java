package lec24_java_coding_challenge;

import java.util.Arrays;

/*
Interview Question:
Write a Java Program to check if the two String are Anagram. 
Two String are called Anagram when there is same character but in different order.
For example,"CAT" and "ACT", "ARMY" and "MARY", "RACECAR" and  "RRAACCE", "MALAYALAM" and "MALAYALAM"
SO, A Palindrome word can be anagram too.
All palindrome are Anagram, but not all anagram are palindromic
*/

public class I08_anagaram {

	public static boolean isAnagram(String str1, String str2) {
		// First compare length
		if(str1.length() != str2.length()) {
			return false;
		}
		// Then convert to Upper or lower case as String is case sensitive
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		// Then convert to a char Array
		char [] charArray1 = str1.toCharArray();
		// Then convert the char array to ascending order
		Arrays.sort(charArray1);
		char [] charArray2 = str2.toCharArray();
		Arrays.sort(charArray2);
		// here you compare 2 array by Arrays.equal()
		return Arrays.equals(charArray1, charArray2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("ARMY", "MARY")); // Anagram
		System.out.println(isAnagram("RACECAR", "RRAACCE")); // Anagram
		System.out.println(isAnagram("RACECAR", "RACECAR")); // Palindrome and Anagram
		System.out.println(isAnagram("ENTHRALL", "mentholl"));

	}

}
