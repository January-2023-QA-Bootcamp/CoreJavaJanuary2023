package lec20_java_coding_challenge;

import java.util.Arrays;

/*
vvimportant:
Interview question in comcast (PA)
Write a function to transform input, e.g.:
Input: "Hello Mohammad Tofael Kabir Sharkar"
Output: "Sharkar Kabir Tofael Mohammad Hello"

*/

public class A05_reverseTheWordsFromParagraph {
	
	public static String outcome(String s) {
		String [] words = s.split(" ");
		// System.out.println(Arrays.toString(words));
		// I did above line just to show that the sentence is split to an String type Array
		for (int i = words.length-1; i >=0; i--) {
			System.out.print(words [i] + " ");
		}		
		return s;
	}
	
	public static void main(String[] args) {
		outcome("Hello Mohammad Tofael Kabir Sharkar");
		
	}

}
