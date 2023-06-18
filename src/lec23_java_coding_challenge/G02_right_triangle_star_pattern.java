package lec23_java_coding_challenge;


/*   Java Program to Print Right Triangle Star Pattern (Que: Atiqur Rahman)

* 
* * 
* * * 
* * * * 
* * * * *  

*/
// same like pyramid

public class G02_right_triangle_star_pattern {
	
	public static void rightTriangleStar(int n) {
		
		for (int i = 0; i< n; i++) { // 0
			// Line 22 is printing * then space
			for (int k = 0; k<=i; k++) { // 0
				System.out.print("* ");
			}
			// Line 25 is bringing the code to next line
			System.out.println(); // throws the cursor in a new line after printing each line
		}
	}

	public static void main(String[] args) {
		rightTriangleStar(5);

	}

}
