package lec12_03_java_oop_abstraction;

// A regular class
// A regular class can inherit only one (regular class or one abstract class) by extends keyword
// A regular class can't inherit an Interface by extends keyword
public class Toyota extends Mercedez {
	// Global variable
	public boolean madeInJapan; // variable declared
	public int yearOfManufacture = 1885; // variable initialized
	
	public Toyota () {
		System.out.println("This constructor is from Toyota class");
	}
	
	// method implemented, but not declared or defined
	// also called non-abstract method
	public void toyotaInfo () {
		System.out.println("This method is from Toyota Class");
	}
	
	// return type method is also possible inside a regular class
	public int toyotaPrice () {
		int price = 45000; // local variable
		System.out.println(price);
		return price;
	}
	// we can also create parameterized method
	
	// Default methods are allowed only in interfaces, not in regular class
	/*
	public default void toyotaColor () {
		
	}
	*/
	
	// static method can be used inside Regular class
	public static void countryOfOrigin () {
		System.out.println("Made in Japan");
	}
	
	
	
	

	

}
