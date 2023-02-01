package lec12_02_java_oop_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee("Mohammad Sharkar", 37282, 'M', false);
		System.out.println("The Employee Name is: " + emp.getName() + "\nEmployee Age: " + emp.getAge()+"\nEmployee Sex: " + emp.getSex()+"\nand Is US Citizen? Ans: " +emp.isUsCitizen());

	}

}
