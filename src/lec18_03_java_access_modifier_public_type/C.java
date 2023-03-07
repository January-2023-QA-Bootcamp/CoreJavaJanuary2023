package lec18_03_java_access_modifier_public_type;

import lec18_07_java_access_modifier_class_from_outside_package.M;

public class C extends M {
	public void cMethod() {
		System.out.println("This method is from C class (Here as a parent class) which is public");

	}
	public static void main(String[] args) {
		
		System.out.println("\n---------- public type modifier content of Parent class [M] from different package can be accessed by sub/child class (Here C)  ----------");
		System.out.println("---------- The below is coming from class M of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		C c = new C();
		c.m1();
	}
	
	
	
}
