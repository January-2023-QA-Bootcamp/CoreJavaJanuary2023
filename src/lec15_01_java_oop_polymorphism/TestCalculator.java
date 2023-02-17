package lec15_01_java_oop_polymorphism;

public class TestCalculator {

	public static void main(String[] args) {
		System.out.println("-------- Land Calculator --------");
		LandCalculator lc = new LandCalculator();
		lc.landCalculator(34, 60, 11); // return type parameterized method -01 initialized
		lc.landCalculator(24, 50, 3.6765f); // return type parameterized method -02 initialized
		lc.landCalculator(24, 50); // return type parameterized method -03 initialized
		lc.landCalculator(24, "50", 55); // return type parameterized method -04 initialized
		lc.landCalculator(24, 2.1765f, 50); // return type parameterized method -05 initialized
		lc.landCalculator(34, 60, 11, 10); // return type final parameterized method -06 initialized
		LandCalculator.landCalculator(34, 60, 11, 10, 20); // return type static  parameterized method -07 initialized
		lc.landCalculator(); // void type method -08 initialized
		lc.landCalculator(34, "60", 11, 40, 29, 53); // void type parameterized method -09 initialized
		lc.landCalculator(34, 11, "99", 40, 29, 53); // void type parameterized method -09 initialized
		
		System.out.println("\n-------- Modern Calculator --------");
		ModernCalculator mc = new ModernCalculator();
		mc.landCalculator(34, 60, 11);
		mc.landCalculator(24, 50, 3.6765f); // return type parameterized method -02 initialized
		mc.landCalculator(24, 50); // return type parameterized method -03 initialized
		mc.landCalculator(24, "50", 55); // return type parameterized method -04 initialized
		mc.landCalculator(24, 2.1765f, 50); // return type parameterized method -05 initialized
		mc.landCalculator(); // void type method -08 initialized
		mc.landCalculator(34, "60", 11, 40, 29, 53); // void type parameterized method -09 initialized
		mc.landCalculator(34, 11, "99", 40, 29, 53); // void type parameterized method -09 initialized
		
	}

}
