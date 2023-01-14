package lec04_02_java_variables_declared;

public class MyInfo {
	// variables declared
	public String name;
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance; 
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;
	
	// Constructor declared
	public MyInfo() {
		System.out.println("This is all about me: ");
	}
	
	// method implemented
	public void myInfo () {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy Apartment Rent: " + myApartmentRent
				+ "\nYearly Salary: " + myYearlySalary + "\nMy Bank Balance" + myBankBalance + "\nSex: " + sex
				+ "\nMy Height: " + myHeight + "\nMy Grade: " + myGrade + "\nAm I US Citizen? Ans: " + usCitizen);
	}
	
	


}
