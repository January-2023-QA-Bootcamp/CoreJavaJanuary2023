package lec20_java_coding_challenge;

/*
Que: Print your name vertically but reverse [They will not mention: character by character]
Input: Tofael Kabir
Output below:
r
i
b
a
K

l
e
a
f
o
T

*/

public class A02_characterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		// Total Character = 12, how we get that? s.length()
		// first one: index number 0
		// last one: index number 11 = 12-1 = s.length()-1
		// System.out.println(s.length());
		for (int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
