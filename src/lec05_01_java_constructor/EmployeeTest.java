package lec05_01_java_constructor;

public class EmployeeTest {
	
	public static void main(String[] args) {
		// When class is instantiated, means when object is created, Constructor is Initialized
		// default Constructor is Initialized
		Employee employee1 = new Employee(); 
		// parameterized Constructor 01 initialized
		// Here "Mohammad Sharkar" is called argument
		// in Employee class, empName was a parameter and that is String type
		Employee employee2 = new Employee("Mohammad Sharkar");
		// parameterized Constructor 02 initialized
		Employee employee3 = new Employee("Mohammad Sharkar", 2188458);
		// parameterized Constructor 03 initialized
		Employee employee4 = new Employee("Mohammad Sharkar", 2188458, 'M');
		// parameterized Constructor 04 initialized
		Employee employee5= new Employee("Mohammad Sharkar", 2188458, 'M', true);
		// parameterized Constructor 05 initialized
		Employee employee6= new Employee("Jenifer A", 5588, false, 'F');
		// We can initialize a parameter more than one time by creating different object
		Employee employee7= new Employee("John J", 53588, true, 'M');
		Employee employee8= new Employee("Joe Biden", 55580, false, 'M');
		Employee employee9= new Employee("Hillary Clinton", 75512, true, 'F');
		// Using default value, for understanding, please don't use it
		Employee employee10= new Employee("", 0, true, 'F');
		

	}

}
