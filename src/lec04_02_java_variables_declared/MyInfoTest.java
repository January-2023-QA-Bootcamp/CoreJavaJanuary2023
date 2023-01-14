package lec04_02_java_variables_declared;

public class MyInfoTest {
	
	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); // Constructor is initialized here
		// variables are initialized here
		tofael.name = "Tofael Kabir";
		tofael.age = 88;
		tofael.myApartmentRent = 32445;
		tofael.myYearlySalary = 376482364;
		tofael.myBankBalance = 7658736472686l;
		tofael.myHeight = 1.679f;
		tofael.myGrade = 3.67568346;
		tofael.sex = 'M';
		tofael.usCitizen = false;	
		tofael.myInfo(); // Method is initialized here
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		MyInfo ifzall = new MyInfo();
		ifzall.name = "Ifzall";
		ifzall.age = 28;
		ifzall.myApartmentRent = 12445;
		ifzall.myYearlySalary = 3782364;
		ifzall.myBankBalance = 76536472686l;
		ifzall.myHeight = 2.679f;
		ifzall.myGrade = 3.88346;
		ifzall.sex = 'M';
		ifzall.usCitizen = true;	
		ifzall.myInfo();
		
		System.out.println("\n-----------------------------------------------------------------------\n");
		
		MyInfo aroah = new MyInfo();
		aroah.name = "Aroah";
		aroah.age = 23;
		aroah.myApartmentRent = 32445;
		aroah.myYearlySalary = 1782364;
		aroah.myBankBalance = 86536472686l;
		aroah.myHeight = 1.679f;
		aroah.myGrade = 3.488346;
		aroah.sex = 'F';
		aroah.usCitizen = false;	
		aroah.myInfo();
	
	}

}
