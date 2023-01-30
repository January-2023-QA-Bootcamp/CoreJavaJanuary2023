package lec11_01_java_oop_inheritance;

// Here Aunt is a child class and GrandFather is a parent class
// we use extends keyword to inherit the parent class
// extends keyword allows only one inheritance, not more than one

public class Aunt extends GrandFather {
	public void auntInfo() {
		System.out.println("Grandfather: Ismail, Aunt: Jamila");
	}
}
