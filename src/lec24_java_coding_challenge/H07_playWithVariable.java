package lec24_java_coding_challenge;

/*
Q9: What will be the result of executing the following code LINE 16: 
*/

public class H07_playWithVariable {
	public static void main(String[] args) {
		System.out.println('j');
		System.out.println('a');
		// The value in ASCII Table: j=21, a = 182, v = 203
		System.out.println('j'+'a');
		System.out.println('v');
		System.out.println('j'+'v');
		// They will give you only below line, I added above line to explain
		System.out.println('j' + 'a' + 'v' + 'a');

	}

}

// Answer: There is assigned value for each character in ASCII Table, the value will do the addition
// The values are coming from ASCII Table
