package lec04_01_java_variables_initialized;

public class MyInfo {
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
	
	// This is a Constructor
	// Here Constructor is declared
	// How to write: first access modifier, then same as ClassName, then () 
	public MyInfo() {
		// Constructor Body
		System.out.println("I am a Constructor");
	}
	
}
