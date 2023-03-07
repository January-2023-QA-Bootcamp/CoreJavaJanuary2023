package lec18_04_java_access_modifier_protected_type;

import lec18_07_java_access_modifier_class_from_outside_package.M;

public class F extends M {
	protected void fMethod() {
		System.out.println("This method is from F class (Here as a parent class) which is protected");
	
	}
	
	public static void main(String[] args) {
		System.out.println("\n---------- protected type modifier content of Parent class [M] from different package can be accessed by sub/child class (Here F)  ----------");
		System.out.println("---------- The below is coming from class M of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		F f = new F();
		f.m2();
	}

}
