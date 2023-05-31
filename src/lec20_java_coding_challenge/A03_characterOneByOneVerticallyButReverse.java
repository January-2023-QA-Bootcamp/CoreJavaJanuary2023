package lec20_java_coding_challenge;

/*
Que: Print your name vertically but reverse (without changing the for loop), can skip it, if feel tough
Alternate way, but not smart way
*/

public class A03_characterOneByOneVerticallyButReverse {

	public static void main(String[] args) {
		String s = "Tofael Kabir";
		for (int i =0; i<s.length(); i++) {
			System.out.println(s.charAt(s.length()-1-i));
		}

	}

}
