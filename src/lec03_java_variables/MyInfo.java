package lec03_java_variables;

public class MyInfo {
	// variables initialized
	public String name = "Mohammad Tofael Kabir Sharkar"; // not a pure primitive data type
	// primitive data type - 8 type
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 2147483647;
	public long myBankBalance = 9223372036854775807l; // we must have to use lower case L (l), at the end of long value
	public float myHeight = 1.7836382f; // we must have to use f, at the end of float value
	public double myGrade = 3.1463647637647263;
	public char sex = 'M';
	public boolean usCitizen = false;

	public static void main(String[] args) {
		// MyInfo (blue color) is a class, myInfo (yellow color) is an object or
		// reference type variable
		// object always start with lower case, follow camel case or sanke case feature
		// = equal operator, new is a keyword of Java

		// What happened below?
		// an object is created (myInfo) (by you) from MyInfo class which (object) is
		// new and MyInfo type
		// This action (line25) --> (when an object is created from the class) is called
		// instantiation, (vvImp info)
		// Then we say the class (MyInfo) is instantiated
		// Variable, Constructor can be declared or initialized,
		// method can be implemented (not declared) or initialized
		// Class Instantiated
		MyInfo myInfo = new MyInfo();
		System.out.println(myInfo.name); // Object can call the variables, call means object can use those variables
		System.out.println(myInfo.age);
		System.out.println(myInfo.myApartmentRent);
		System.out.println(myInfo.myYearlySalary);
		System.out.println(myInfo.myBankBalance);
		System.out.println(myInfo.myHeight);
		System.out.println(myInfo.myGrade);
		System.out.println(myInfo.sex);
		System.out.println(myInfo.usCitizen);
		System.out.println("My Name: " + myInfo.name);
		System.out.println("My Name: " + myInfo.name + "\nAge: " + myInfo.age + "\nSex: " + myInfo.sex);
		// in line 42, we can call all the variables here, but I didn't do it here, It is possible to call all of them
		// will do in the next class
		

	}

}
