package lec18_05_java_access_modifier_private_type;

import lec18_07_java_access_modifier_class_from_outside_package.M;

public class I extends M {
	private void iMethod() {
		System.out.println("This method is from I class (Here as a parent class) which is private");
	
	}
	public static void main(String[] args) {
		System.out.println("\n---------- private type modifier content of Parent class [M] from different package can't be accessed by sub/child class (Here I)  ----------");
		System.out.println("---------- The below is coming from class M of package 'lec16_08_java_access_modifier_class_from_outside_package' ----------\n");
		I i = new I();
		// i.m3();
	}

}
