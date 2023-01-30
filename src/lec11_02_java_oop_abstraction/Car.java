package lec11_02_java_oop_abstraction;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// What is Interface
// Interface is a Blueprint of the Class. 
// An interface is a collection of methods that are defined (declared) but not implemented. 

public interface Car {
	// Interview question: Can we declare variables inside Interface? 
	// No, we must have to initialize
	// what is the feature of variable that can be used inside Interface?
	// the variables inside Interface are final and static in nature.
	public static final int INVENTED = 0;
	
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
	
	// I am not initializing interface today
	// Also not showing a relation between class and Interface
}
