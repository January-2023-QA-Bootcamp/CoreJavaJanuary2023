package lec13_01_java_oop_use_of_super_in_child_class;

public class MountSinai {
	// variables declared
	public String location;
	public int bonus;
	
	// We created this 2 variables to use in child class to call by super keyword
	public boolean inNewYork;
	public float rating;
	
	// default Constructor
	public MountSinai() {
		System.out.println("This is a default constructor from the Parent Class MountSinai");
	}

	// parameterized Constructor
	public MountSinai(String location, int bonus) {
		this.location = location;
		this.bonus = bonus;
		System.out.println("From Parent Class, Location: " + location + " and Yearly Bonus: " + bonus + "%");
	}
	
	// void type method
	public void msInfo() {
		System.out.println("This is a void type method from the Parent Class MountSinai");
	}
	
	// parameterized method
	public void mountSinaiInfo (String location, int bonus) {
		this.location = location;
		this.bonus = bonus;
		System.out.println("From Parent Class, Location: " + location + " and Yearly Bonus: " + bonus + "%");
	}
	
	
	
	
	
	
	
	
	
	

}
