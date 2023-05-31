package lec20_java_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower case
// you have to ask -- is it upper case or lower case?
// Better not to ask if they don't define

public class B04_countASpecificCharacter {
	
	public static String countSpecificCharacterString (String s) {
		// alternate of B03
		s = s.toLowerCase(); // here the whole String converted to lower case
		// if we use it like B03, execution time is more, so we used here
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// you can also convert the String to Upper case [toUpperCase()] and look for 'Z'
			if (s.charAt(i) == 'z') {
				count ++;
			}
		}
		System.out.println(count);
		return s;
	}
	
	public static void main(String[] args) {
		countSpecificCharacterString("ZiyadZ Alz KhilanliezZZZ");
	

	}

}
