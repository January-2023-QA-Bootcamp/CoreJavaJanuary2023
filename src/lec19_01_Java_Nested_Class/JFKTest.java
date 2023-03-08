package lec19_01_Java_Nested_Class;

public class JFKTest {

	public static void main(String[] args) {
		System.out.println("\n-------------- JFK01 --------------\n");
		JFK01 jfk01 = new JFK01();
		jfk01.welcome();
		jfk01.t1.destination();
		
		// Line 11 is not ok, because TrminalTwo is an inner class
		// TerminalTwo t2 = new TerminalTwo();
		
		jfk01.t2.usAirlines();
		jfk01.t4.arabianFlights();
		
		
		System.out.println("\n-------------- JFK02 --------------\n");
		JFK02 jfk02 = new JFK02();
		jfk02.welcome();
		// Line 22 is also possible, but the above line can do the purpose, so no need to write it again
		jfk02.t1.destination();
		jfk02.t4.arabianFlights();
		
		System.out.println("\n-------------- JFK02 --------------\n");
		// TerminalFour is a Static class
		JFK02.TerminalFour jt01 = new JFK02.TerminalFour();
		jt01.arabianFlights();
		
		// See below, non static inner class can't follow above line 27
		// TerminalTwo is the non static inner class
		// JFK02.TerminalTwo jt02 = new JFK02.TerminalTwo();
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03 jfk03 = new JFK03();
		jfk03.welcome();
		
		System.out.println("\n-------------- JFK03 --------------\n");
		JFK03.TerminalFour jt02 = new JFK03.TerminalFour();
		jt02.arabianFlights();
		// jt02.asianFlights(); // show warning for static method
		JFK03.TerminalFour.asianFlights();
		
		System.out.println("\n-------------- JFK04 --------------\n");
		JFK04 jfk04 = new JFK04();
		jfk04.t1.destination();
		// The below methods are usual
		jfk04.t2.usAirlines();
		
		

	}

}
