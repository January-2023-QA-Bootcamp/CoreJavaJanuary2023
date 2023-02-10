package lec14_01_java_oop_abstraction;

// implements keyword can be used alone without using extends keyword
// but it you inherit by extends, that keyword must be written before implements keyword
public class Mercedez implements CableCar {
	public void mercedezInfo() {
		System.out.println("Invented in Germany");
	}

	@Override
	public void cheap() {
		System.out.println("cheap method from Cable Car Interface");
		
	}

	
	


}
