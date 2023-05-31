package lec20_java_coding_challenge;

// Que: How many 'z/Z'  inside the provided String? They like to confuse you by not saying upper or lower case
// you have to ask -- is it upper case or lower case?
// Better not to ask if they don't define

// Follow B04
public class B03_countASpecificCharacter {
	
	public static String countSpecificCharacterString (String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// you can also convert the String to Upper case [toUpperCase()] and look for 'Z'
			if (s.toLowerCase().charAt(i) == 'z') {
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
