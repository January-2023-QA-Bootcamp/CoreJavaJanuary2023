package lec20_java_coding_challenge;

// sometimes they can say write a method to do .......

public class A04_characterOneByOneHorizontallyButReverse {
	
	public static String horizontalButReverse (String s) {
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}	
		return s;
	}

	public static void main(String[] args) {
		horizontalButReverse("Tofael Kabir");
	}

}
