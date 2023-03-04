package lec17_01_java_conditional_statements;

public class D08_use_of_switch_as_nested {

	public static void main(String[] args) {
		// C - CSE, E - ECE, M - Mechanical
		
		int collegeYear = 5;
		char department = 'M';
		
		switch (collegeYear) { // outer switch method
		
		case 1:
			System.out.println("English, Maths, Science");
			break;
		
		case 2:
			switch (department) { // inner switch method
			case 'C':
				System.out.println("Operating System, Java, Data Structure");
				break;
			case 'E':
				System.out.println("Micro processors, Logic switching theory");
				break;
			case 'M':
				System.out.println("Drawing, Manufacturing Machines");
				break;
			default:
				System.out.println("Although your year is 2, But please add a valid Department Name");
				break;
			}
			break;

		case 3:
			switch (department) { // inner switch method
			case 'C':
				System.out.println("Computer Organization, MultiMedia");
				break;
			case 'E':
				System.out.println("Fundamentals of Logic Design, Microelectronics");
				break;
			case 'M':
				System.out.println("Internal Combustion Engines, Mechanical Vibration");
				break;
			default:
				System.out.println("Although your year is 3, But please add a valid Department Name");
				break;
			}
			break;
			
		case 4:
			switch (department) { // inner switch method
			case 'C':
				System.out.println("Data Communication and Networks, MultiMedia");
				break;
			case 'E':
				System.out.println("Embedded System, Image Processing");
				break;
			case 'M':
				System.out.println("Production Technology, Thermal Engineering");
				break;
			default:
				System.out.println("Although your year is 4, But please add a valid Department");
				break;
			}
			break;	
					
		default:
			System.out.println("I am sure you are not studying hard enough, You took more than 4 years to complete your course. Saiyonara");
			break;
		}
	}

}
