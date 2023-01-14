package lec04_01_java_variables_initialized;

public class MyInfoTest {

	public static void main(String[] args) {
		MyInfo myInfo = new MyInfo(); // Here Constructor is Initialized
		System.out.println(myInfo.name);
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
	
	}

}
