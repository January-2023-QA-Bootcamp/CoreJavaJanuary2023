package lec18_04_java_access_modifier_protected_type;

import lec18_07_java_access_modifier_class_from_outside_package.N;

public class E extends F {
	protected String name2 = "This variable is coming from E which is protected";

	protected E() {
		System.out.println("This constructor is from E class which is protected");
	}

	protected void e () {
		System.out.println("This method is coming from E which is protected");
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- Inside same package, protected type modifier content of Parent class [F] can be accessed by sub/child class (Here E) ----------");
		E e = new E();
		e.fMethod();	
		
		System.out.println("\n---------- protected type modifier content of Parent class [N] from different package can't be accessed in non-sub/child class (Here E)  ----------");
		System.out.println("---------- The below code is coming from class N of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		N n2 = new N();
		// n2.n2();
		
	}

}
