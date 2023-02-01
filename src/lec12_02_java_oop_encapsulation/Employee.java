package lec12_02_java_oop_encapsulation;

public class Employee {
	private String name;
	private int age;
	private char sex;
	private boolean usCitizen;
	
	public Employee(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

}
