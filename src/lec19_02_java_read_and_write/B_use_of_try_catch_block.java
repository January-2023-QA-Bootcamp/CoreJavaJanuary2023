package lec19_02_java_read_and_write;

public class B_use_of_try_catch_block {
	public static void main(String[] args) {
		int a = 12;
		int b = 0;
		
		try {
			int division = a/b;
			System.out.println(division);
		} catch (ArithmeticException e) {
			System.out.println("The Exception is >>>>>> " + e);
		}
		
	}

}
