package lec04_01_java_variables_initialized;

public class Tofael {
	// variables initialized
	public String name = "Mohammad Tofael Kabir Sharkar";
	// primitive data type - 8 type
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l; 
	public float myHeight = 1.7836382f;
	public double myGrade = 3.1463647637647263;
	public char sex = 'M';
	public boolean usCitizen = false;
	
	// This is a Constructor, a special type of method
	// Here Constructor is declared
	// How to write: first access modifier, then same as ClassName, then () 
	public Tofael() {
		// Constructor Body
		System.out.println("This is all about me: ");
	}
	
	// This is a method
	// Here method is implemented
	// How to write: first access modifier, then  type of method (here void), Then name start with lower case, then () 
	// method name can be same as class name but in lower case, but not mandatory
	public void myInfo () {
		// method body
		// The method body can call the variables inside syso
		// We don't need object to call the variables inside method
		// We can also do the concatenation
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
	
	


}
