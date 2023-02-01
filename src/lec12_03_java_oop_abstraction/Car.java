package lec12_03_java_oop_abstraction;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// What is Interface
// Interface is a Blueprint of the Class. 
// An interface is a collection of methods that are defined (declared) but not implemented. 

// An Interface can't inherit a regular class or an abstract class by extends keyword
// An Interface can inherit more than one Interface (separated by coma) by extends keyword
public interface Car extends Taxi, Truck {
	// Interview question: Can we declare variables inside Interface? 
	// No, we must have to initialize
	// what is the feature of variable that can be used inside Interface?
	// the variables inside Interface are final and static in nature.
	public static final int INVENTED = 0;
	
	// variable never been declared inside Interface
	// public boolean inGermany;
	
	// Interview question: Does Interfaces have constructors?
	// Ans: Interfaces cannot have constructors
	
	/*
	public Car () {
		
	}
	*/
	
	// doesn't have method body like class
	// the method which are declared -- also called abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	// inside Interface body, method declared, but not implemented
	public void start ();
	public abstract void stop ();
	// this is a return type abstract method, but abstract keyword is not mandatory for methods inside Interface
	public String brake ();
	
	// we can also create parameterized method
		
	// from Java 1.8, JAVA implemented static and default type method in interface which are implemented in nature
	// important interview question
	
	public default void honk() { // this default is not access modifier
		System.out.println("This Honk feature is from Car Interface");
	}
	
	public static void gear () {
		System.out.println("This Gear feature is from Car Interface");
	}
	
	// not important here, just used, can ignore, just showed it is possible
	public default String honk1() { 
		System.out.println("Honk Feature from Car Interface");
		return null;
	}
		
}
