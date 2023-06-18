package lec23_java_coding_challenge;

/*   Implement a large Pyramid of stars in the screen with java.

 		*
 	   * *
      * * *
     * * * *
    * * * * *

*/

public class G01_makingPyramid {
	// This method will create a pyramid with n number of star 
	public static void pyramid (int n) {
		for (int i = 0; i< n; i++) { // 0
			// line 19 is printing  the space only
			for (int j = 0; j < n-i ; j++) { // 0, 1, 2, 3, 4
				System.out.print(" ");
			}
			// Line 23 is printing * then space
			for (int k = 0; k<=i; k++) { // 0
				System.out.print("* ");
			}
			// Line 26 is bringing the code to next line
			System.out.println(); // throws the cursor in a new line after printing each line
		}
		
	}

	public static void main(String[] args) {
		pyramid(5);

	}

}
