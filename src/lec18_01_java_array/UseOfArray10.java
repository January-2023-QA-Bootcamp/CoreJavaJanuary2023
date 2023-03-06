package lec18_01_java_array;

import java.util.Arrays;
import java.util.Random;

public class UseOfArray10 {

		public static void main(String[] args) {
			int [] a = new int[5];

	        Random random = new Random();  //class
	      
	        for(int i=0; i<a.length; i++) {
	            a[i] = random.nextInt(100); //if has boundary
	            System.out.println(a[i]);
	        }
	        System.out.println("To find the list of an Array: " + Arrays.toString(a));

	}

}
