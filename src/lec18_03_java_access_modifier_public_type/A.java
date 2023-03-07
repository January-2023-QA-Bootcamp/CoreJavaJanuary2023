package lec18_03_java_access_modifier_public_type;

public class A {
	
	// variable declared
	public String info1; 
	
	// constructor declared
	public A() {
		System.out.println("This Constructor is coming from class A which is public type");
	}
	
	// method implemented
	public void a() {
		System.out.println("This method is coming from class A which is public type");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- public type modifier content can be accessed inside the same class ----------\n");
		A a = new A(); // Constructor will be initialized here
		a.info1 = "This variable is coming from class A which is public type"; // variable initialized here
		System.out.println(a.info1); 
		a.a(); // method initialized here

	}

}
