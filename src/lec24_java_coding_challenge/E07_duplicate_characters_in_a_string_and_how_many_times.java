package lec24_java_coding_challenge;

import java.util.HashMap;

// I need to know about it from Nasir/Shohag

public class E07_duplicate_characters_in_a_string_and_how_many_times {

	public static void main(String[] args) {
		String str = "a beautiful beach bob";
		str = str.replaceAll("\\s", "");
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if (map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else {
				int occurrence = map.get(str.charAt(i));
				map.put(str.charAt(i), occurrence + 1);
			}
		}
		for (char key : map.keySet()) {
			if(map.get(key)>1) {
				System.out.print(key + " : " + map.get(key) + " times\n");
			}			
		}
	}

}