package lec12_01_java_access_modifier_private_type;

public class H extends I {
	private String name3 = "This variable is coming from H which is private";
	
	private void h () {
		System.out.println("This method is coming from H which is private");
	}

	public static void main(String[] args) {
		H h = new H();
		h.h();
		// h.iMethod(); // private type method can't be accessed

	}

}
