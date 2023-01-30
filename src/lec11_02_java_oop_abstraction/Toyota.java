package lec11_02_java_oop_abstraction;

// A regular class
public class Toyota {
	
	public int yearOfManufacture = 1885; // Global variable
	
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

	

}
