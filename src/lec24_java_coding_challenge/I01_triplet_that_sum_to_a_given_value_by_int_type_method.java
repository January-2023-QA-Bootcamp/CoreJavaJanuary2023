package lec24_java_coding_challenge;

/*   
Find a triplet that sum to a given value (Sazzad)

Input: A[] = {1, 4, 45, 6, 10, 8 }, sum = 22; 
Output: ?
					
					1          4         45         6        10         8
										
*/

public class I01_triplet_that_sum_to_a_given_value_by_int_type_method {
	static int [] array = { 1, 4, 5, 45, 6, 10, 8, 7, 9, 12};
	static int sum = 22;
	static int size = array.length;
	// why size-2, size-1, size, because they don't wanna sum same number, 
	// because the question said triplet, it means 3 different number
	public static int findThreeNumber(int[] array, int size, int sum) {
		int count = 0;
		for (int i = 0; i < size-2; i++) { // 1
			// Fix the second element as array[j]
			for (int j = i + 1; j < size - 1; j++) { // 4
				// Fix the third element as array[k]
				for (int k = j + 1; k < size; k++) { // 5, 45, 6, 10, 8, 7, 9, 12
					if (array[i] + array[j] + array[k] == sum) {
						System.out.print("Triplets are:::> " + array[i] + ", " + array[j] + ", " + array[k] + "\n");
						count++;
					}
				}
			}
		}
		System.out.println("Incident Happen: " + count);
		return count;
	}

	public static void main(String[] args) {
		findThreeNumber(array, size, sum);
	}
}
