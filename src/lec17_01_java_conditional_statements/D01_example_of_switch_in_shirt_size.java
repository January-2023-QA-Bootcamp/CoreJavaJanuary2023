package lec17_01_java_conditional_statements;

public class D01_example_of_switch_in_shirt_size {

	public static void main(String[] args) {
		char size = 'M';
		
		switch(size) {
		
		case 'S':
			System.out.println("Yes We have your Small Size Shirt");
			break;
		case 'M':
			System.out.println("Yes We have your Medium Size Shirt");
			break;
		case 'L':
			System.out.println("Yes We have your Large Size Shirt");
			break;
		case 'X':
			System.out.println("Yes We have your Extra Large Size Shirt");
			break;
		default:
			System.out.println("Sorry! We don't have your Size");
			break;
			
		}
		
	}

}
