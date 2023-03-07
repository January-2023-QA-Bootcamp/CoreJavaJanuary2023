package lec18_04_java_access_modifier_protected_type;

public class D {
	
	// variable declared
	protected String info2; 
	
	// constructor declared
	protected D() {
		System.out.println("This Constructor is coming from class D which is protected type");
	}
	
	// method implemented
	protected void d() {
		System.out.println("This method is coming from class D which is protected type");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- protected type modifier content can be accessed inside the same class ----------\n");
		D d = new D(); // Constructor will be initialized here
		d.info2 = "This variable is coming from class D which is protected type"; // variable initialized here
		System.out.println(d.info2); 
		d.d(); // method initialized here

	}

}
