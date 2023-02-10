package lec14_02_java_oop_abstraction_final;


public class Toyota extends ElectricCar implements Car {
	public void toyotaInfo() {
		System.out.println("This method is from Toyota Class");
	}

	@Override
	public void price() {
		System.out.println("price method from ElectricCar Abstract class");
		
	}

	@Override
	public void start() {
		System.out.println("start method from Car Interface");

	}

	@Override
	public void stop() {
		System.out.println("stop method from Car Interface");

	}

	@Override
	public String brake() {
		String m = "brake method from Car Interface";
		System.out.println(m);
		return m;
	}
	
}
