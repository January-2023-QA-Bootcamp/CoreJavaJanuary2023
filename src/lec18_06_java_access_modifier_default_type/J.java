package lec18_06_java_access_modifier_default_type;

public class J {
	
	// variable declared
	String info4; 
	
	// constructor declared
	J() {
		System.out.println("This Constructor is coming from class J which is default type");
	}
	
	// method implemented
	void j() {
		System.out.println("This method is coming from class J which is default type");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- default type modifier content can be accessed inside the same class ----------\n");
		J j = new J(); // Constructor will be initialized here
		j.info4 = "This variable is coming from class J which is default type"; // variable initialized here
		System.out.println(j.info4); 
		j.j(); // method initialized here

	}

}
