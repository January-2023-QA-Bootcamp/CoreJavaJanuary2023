package lec03_java_variables;

// Project names generally starts with UpperCase --> January2023CoreJava
// Package names are generally starts with lowerCase --> lec01_java_basic
// Class names starts with UpperCase. Class names are usually nouns or noun phrases --> Naming_convention 

// Project, package, Class follow Camel case or Snake case pattern.

// Camel case feature considered from second word (not from the first word)
// Camel case example for a Project --> January2023CoreJava
// Camel case example for a package --> lec01JavaBasic
// Camel case example for a Class --> NamingConvention

// Alternative example of Camel case (Called snake_case).
// Snake case feature considered from second word, (not from the first word)
// Snake case example for a Project --> January_2023_core_java
// Snake case example for a package --> lec01_java_basic
// Snake case example for a Class --> Naming_convention

public class C_naming_convention {
	// Non-constant (Regular) variable (or field) names starts with lowerCase
	// But follow camelCase feature or snake_case_feature
	// variable names must be specific and meaningful
	// (variable name) no duplication is accepted inside the same class
	
	// public is an access modifier, int is the type of variable, houseNumber is the name of the variable	
	public int houseNumber = 625; // variable initialized
	public int avenue_name; // variable declared
	
	// Constant names are written with all upper case letters with words separated by underscores
	// We will use it in automation framework, no need to worry about it right now
	public String PLANET_NAME = "Earth";
	public String WEDDING_REGISTRY_PAGE_TITLE = "Amazon Wedding";
	public int LONG_WAIT = 10;
	public int IMPLICITLY_WAIT = 10;
	public int EXPLICITLY_WAIT = 10;
	
	// names like "string1, myarray1, no_1" are not acceptable as variable names
	// because they are are not specific and can cause confusion like the variable below:
	public String string1 = "String"; // not acceptable or encouraged to use 
	public int int1;
	
	public static void main(String[] args) {
		System.out.println("This is all about Naming Convention");
	}

}
