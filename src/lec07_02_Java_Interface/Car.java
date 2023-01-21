package lec07_02_Java_Interface;

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
	// and here method declared
	// inside Interface body, method declared, but not implemented
	public void start ();
	public void stop ();
	public void brake ();
	
	// I am not initializing interface today
	// Also not showing a relation between class and Interface
}
