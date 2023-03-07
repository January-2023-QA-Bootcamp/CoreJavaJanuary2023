package lec18_05_java_access_modifier_private_type;

public class G {
	
	// variable declared
	private String info3; 
	
	// constructor declared
	private G() {
		System.out.println("This Constructor is coming from class G which is private type");
	}
	
	// method implemented
	private void g() {
		System.out.println("This method is coming from class G which is private type");
	}

	public static void main(String[] args) {
		System.out.println("\n---------- private type modifier content can be accessed inside the same class ----------\n");
		G g = new G(); // Constructor will be initialized here
		g.info3 = "This variable is coming from class G which is private type"; // variable initialized here
		System.out.println(g.info3); 
		g.g(); // method initialized here

	}

}
