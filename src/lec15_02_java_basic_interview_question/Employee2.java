package lec15_02_java_basic_interview_question;

// Can you call a non-static variable or method inside the main method (without creating object)? 

public class Employee2 {
	public static String empName = "Tofael";
	public static int empId = 2188458;
	public static char sex = 'M';
	public static boolean fullTimeEmployee = true;

	public static void main(String[] args) {
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Sex: " + sex
				+ " and Full time Employee? Ans: " + fullTimeEmployee);
	}

}
