package lec03_java_variables;

public class B_all_about_variables {
	// In the class body, we have to write First Variable, Then Constructor and then Method
	// And they should be before main method
	// Variable is also called field
	// Variables ended with ;
	
	// all the variables name start with lower case
	// Variable follow Camel Case and snake case feature
	// The most common variables type used are String, int, char and boolean -- always used
	
	// Here variable is declared, how? We didn't give a value for the variable Name	
	public String schoolName;
	
	// public, private, protected, default --> They are access modifier (they represent accessibility), 
	// String = type of the variable, firstName is the name of the String type variable
	// String type variable is initialized inside double quotation as Mohammad
	public String firstName = "Mohammad";
	private String secondName = "Tofael"; // CamelCase is used
	protected String second_name = "Tofael"; // snake_case is used
	String lastName = "Sharkar"; // default type access modifier, when public, private and protected are absent
	
	// int (We say it -- integer) = type of the variable, myYearlySalary is the name of the int type variable
	// int type variable is initialized without any quotation
	public int myYearlySalary = 46862387;
	
	// char (character) = type of the variable, mySex is the name of the char type variable
	// char type variable is initialized inside single quotation, 
	// and represented by upper case single letter, No number
	public char sex = 'M';
	
	// boolean = type of the variable, usCitizen is the name of the boolean type variable
	// boolean type variable is initialized without any quotation, only represented by true or false (always in lower case)
	public boolean usCitizen = true;
	

}
