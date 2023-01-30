package lec11_02_java_oop_abstraction;

// Abstract Class contains both abstract and non abstract methods
// Abstract Class names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Abstract Class --> ElectricCar
// Snake_case example for an Abstract Class --> Electric_car

public abstract class ElectricCar {

	public String nameOfElectriccar = "Tesla";
	public int costOfTesla = 65000;

	// Can you Declare a Constructor inside Abstract class?
	// Yes
	public ElectricCar() {
		System.out.println("This constructor is from Abstract class-- Electric Car");
	}
	// Interview question: Can a Constructor of an Abstract class be initialized?
	// When we will instantiate the Abstract class, we will get that answer that time

	// method implemented
	// non-abstract method
	public void battery() {
		System.out.println("The Battery is very efficient, from Electric Car class");
	}

	// method declared
	// when method is declared, that method is also called abstract method
	// This is mandatory to put abstract keyword with the abstract method inside Abstract Class
	// This is the norm/rules to write at least one abstract method inside abstract class
	public abstract void price();
	
	// this is a return type abstract method
	public abstract String carName();
	
	
	
	
	
}
