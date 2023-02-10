package lec14_02_java_oop_abstraction_final;

public interface Car {
	public void start ();
	public abstract void stop ();
	public String brake ();
	
	public default void honk() {
		System.out.println("This Honk feature is from Car Interface");
	}
	
	public static void gear () {
		System.out.println("This Gear feature is from Car Interface");
	}
			
}
