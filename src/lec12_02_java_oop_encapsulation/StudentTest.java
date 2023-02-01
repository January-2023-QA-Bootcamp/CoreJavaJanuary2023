package lec12_02_java_oop_encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		// we put argument in the parameterized method 
		student.setStName("Alex Butcher");
		student.setStId(2188458);
		student.setSex('M');
		student.setFulltimeSt(true);
		student.setGrade(3.598f);
		
		System.out.println("Student Name: " + student.getStName() + ", \nID: " + student.getStId() + ", \nSex: "
				+ student.getSex() + ", \nFull Time student? : " + student.isFulltimeSt() + " \nGrade: " + student.getGrade());

	}

}
