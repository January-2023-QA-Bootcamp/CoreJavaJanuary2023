package lec14_01_java_oop_abstraction;

public class VehicleTest {

	public static void main(String[] args) {
		System.out.println("\n--------------------- Regular class Toyota ------------------------\n");
		Toyota toyota = new Toyota();
		toyota.toyotaInfo();
		toyota.toyotaPrice();
		// if a method is static, no help needed from object, the class or Interface can directly call it.
		Toyota.countryOfOrigin();
		toyota.rent();
		toyota.carryingPassenger();
		toyota.carryingGoods();
		toyota.start();
		toyota.stop();
		toyota.brake();
		toyota.autopilot();
		toyota.expensive();
		toyota.canFloat();
		toyota.lightWeight();
		toyota.price();
		toyota.carName();
		toyota.battery();
		toyota.yearOfEstablishment(); // it is giving us warning, because static method of Abstract class
		// yearOfEstablishment() is a static method in Abstract class. Toyota class, (not object) can extends that Abstract class, 
		// so, Toyota itself can initialize that method, but in terms of Interface, it (here gear method) is not allowed for Toyota
		Toyota.yearOfEstablishment();
		toyota.flyingFeature();
		toyota.honk();
		// toyota.gear();
		// Toyota.gear();
		// gear () is a static method of an Interface, static method of Interface can't be call by object of a regular class
		System.out.println("Toyota manufactured in: " + toyota.yearOfManufacture);
		System.out.println(toyota.INVENTED); // This got warning
		System.out.println(Toyota.INVENTED); // as INVENTED variable is static and Toyota implements Car, that's why no error
		
		
		System.out.println("\n--------------------- Interface Car ------------------------\n");
		// Cannot instantiate the type Car which is an Interface
		// an Interface can't be instantiated, it needs the help of a concrete class, here Toyota is a concrete class, Because Toyota helps to implement the Car Interface
		// Interview question: why Interface can't instantiate? because implementation is not complete because of abstract methods present in Interface
		Car car = new Toyota(); // Why this line works but not the next line?
		// CableCar cc = new Toyota(); // because Toyota never implements the Interface Cable Car
		car.start();
		car.stop();
		car.brake();
		car.honk();
		// car.gear();
		Car.gear();
		// no need of object, Interface/class can directly call static methods, 
		// but static method in abstract class can be called by Regular class Toyota object (but got warning), Regular class can call directly
		car.honk1();
		car.rent();
		car.carryingPassenger();
		car.carryingGoods();
		System.out.println("The Car invented in: " + Car.INVENTED );
		
		// Taxi can get help of Toyota, because Car extends Taxi
		Taxi taxi = new Toyota();
		
		System.out.println("\n--------------------- Abstract class ElectricCar ------------------------\n");
		// Cannot instantiate the type ElectricCar
		// an abstract class can't be instantiated, it needs the help of a concrete class, here Toyota is the concrete class
		// Interview question: why? because implementation is not complete because of some abstract methods present
		ElectricCar electricCar = new Toyota();
		electricCar.battery();
		electricCar.price();
		electricCar.carName();
		electricCar.yearOfEstablishment(); // it get's warning because better to call by Class or Interface 
		ElectricCar.yearOfEstablishment();
		electricCar.flyingFeature();
		electricCar.autopilot();
		electricCar.expensive();
		electricCar.canFloat();
		System.out.println("Electric Car name: " + electricCar.nameOfElectricCar + ", and price: " + electricCar.costOfTesla);
		
		
		// CableCar cableCar = new Toyota(); // because Toyota doesn't implements CableCar
		// Same for Abstract class
		
		System.out.println("\n--------------------- Not Instantiating here: Drone, FlyingCar, Ferrari, HoverCar, Mercedes, Rocket, Taxi, Truck. But possible ------------------------\n");
		
		
		
		
		
		
		
		

	}

}
