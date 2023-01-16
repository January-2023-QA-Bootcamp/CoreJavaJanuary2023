package lec05_01_java_constructor;

public class Employee {
	// Global variable or class variable
	// variables are declared
	public String empName;
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;
	
	// Constructor are 2 types --
	// default constructor (no argument constructor) and parameterized constructor
	// A class can contain one default constructor and one or (more than one) parameterized constructor
	// Default Constructor must be declared before parameterized constructor.
	// you shouldn't write a parameterized constructor without writing a default constructor. It's a norm.
	
	// default Constructor declared
	// a lot of interview question regarding this
	public Employee () {
		System.out.println("This Constructor is from Employee Class");
	}
	
	// parameterized Constructor 01 declared
	public Employee (String empName) { // here String empName is Parameter, not variable
		this.empName = empName; // here making a relation between variable and parameter
		System.out.println("Employee name: " + empName);
	}
	
	// parameterized Constructor 02 declared
	public Employee (String empName, int empId) { 
		this.empName = empName; 
		this.empId = empId; 
		System.out.println("Employee name: " + empName + ", Id: " + empId);
	}
	
	// parameterized Constructor 03 declared
	// parameters are placed in different position in sysout
	// Sysout outcome also not similar as above one
	// Sequence of parameter and sequence of argument should be same to get the outcome (print)
	public Employee (String empName, int empId, char empSex) { 
		this.empName = empName; 
		this.empId = empId; 
		this.empSex = empSex; 
		System.out.println("Employee name: " + empName+ ", Sex: " + empSex + ", Id: " + empId);
		// But the sequence of outcome doesn't matter
		// that's why I change the sequence
	}
	
	// parameterized Constructor 04 declared
	public Employee (String empName, int empId, char empSex, boolean fullTimeEmployee) { 
		this.empName = empName; 
		this.empId = empId; 
		this.empSex = empSex; 
		this.fullTimeEmployee = fullTimeEmployee; 
		System.out.println("Employee name: " + empName + ", Id: " + empId + ", Sex: " + empSex + " and Full Time Employee? Ans: " + fullTimeEmployee);
	}
	
	// Parameterized Constructor 05 declared
	// 04 vs 05 -- just the position of parameters are changed
	// It is possible to create a parameterized constructor with the same number of parameters 
	// but they are organized in a different position.
	public Employee(String empName, int empId, boolean fullTimeEmployee, char empSex) {
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		this.fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employee Name is: " + empName + ", Employee Id: " + empId+", Employee Sex: " + empSex+" and Full time Employee? Ans: " + fullTimeEmployee); 
	}

	
	
	

}
