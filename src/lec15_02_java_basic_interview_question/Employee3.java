package lec15_02_java_basic_interview_question;

// Can you call a non-static variable or method inside the main method (without creating object)? 

public class Employee3 {
	
	public static void main(String[] args) {
		// You can find it in conditional statement
		String empName = "Tofael";
		int empId = 2188458;
		char sex = 'M';
		boolean fullTimeEmployee = true;
		
		System.out.println("Employee Name: " + empName + ", Employee Id: " + empId + ", Employee Sex: " + sex
				+ " and Full time Employee? Ans: " + fullTimeEmployee);
	}

}
