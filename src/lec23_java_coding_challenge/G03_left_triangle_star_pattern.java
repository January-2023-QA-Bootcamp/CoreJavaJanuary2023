package lec23_java_coding_challenge;

/*   Java Program to Print left Triangle Star Pattern 

			   * 
			* * 
		 * * * 
	  * * * * 
   * * * * *  

*/

//same as pyramid, just need 3 space as blank

public class G03_left_triangle_star_pattern {
	
	public static void leftTriangleStar(int n) {
		for ( int i = 0; i<n; i++) { // Outer loop for rows
			// This loop create 3 space and give us total 15 space first, then 12, 9, 6, 3
			for (int j = 0; j < n-i ; j++) { // Inner loop for space
				System.out.print("   ");
			}
			
			for (int k = 0; k<=i; k++) {  // Inner loop for columns
				System.out.print("* ");
			}
			
			System.out.println(); // throws the cursor in a new line after printing each line
		}
		
	}

	public static void main(String[] args) {
		leftTriangleStar(5);

	}

}
