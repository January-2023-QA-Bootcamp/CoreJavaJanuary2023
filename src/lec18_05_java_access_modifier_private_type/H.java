package lec18_05_java_access_modifier_private_type;

import lec18_07_java_access_modifier_class_from_outside_package.N;
import lec18_07_java_access_modifier_class_from_outside_package.M;

public class H extends I{
	private String name3 = "This variable is coming from H which is private";

	private void h() {
		System.out.println("This method is coming from H which is private");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- Inside same package, private type modifier content of Parent class [I] can't be accessed by sub/child class (Here H) ----------");
		H  h = new H();
	  // h.iMethod();

		System.out.println("\n---------- private type modifier content of Parent class [N] from different package can't be accessed in non-sub/child class (Here H)  ----------");
		System.out.println("---------- The below code is coming from class N of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		N n3 = new N();
		// n3.n3();

	}

}
