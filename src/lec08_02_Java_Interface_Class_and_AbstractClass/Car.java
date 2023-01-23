package lec08_02_Java_Interface_Class_and_AbstractClass;

// Interface names starts with UpperCase 
// They follow Camel case or Snake case pattern.
// CamelCase or Snake_case feature considered from second word, not from first word
// CamelCase example for an Interface --> CarToyota
// Snake_case example for an Interface --> Car_toyota

// What is Interface
// Interface is a Blueprint of the Class. 
// An interface is a collection of methods that are defined (declared) but not implemented. 

public interface Car {
	// doesn't have method body like class
	// the method which are declared -- also called abstract method
	// This is not mandatory to put abstract keyword with the abstract method inside Interface
	// inside Interface body, method declared, but not implemented
	public void start ();
	public abstract void stop ();
	public void brake ();
	
	// I am not initializing interface today
	// Also not showing a relation between class and Interface
}
