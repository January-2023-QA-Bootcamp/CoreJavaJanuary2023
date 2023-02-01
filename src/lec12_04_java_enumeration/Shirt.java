package lec12_04_java_enumeration;

public class Shirt {
	Size chart;
	
	public Shirt() {
		
	}

	public Shirt(Size chart) {
		this.chart = chart;
	}
	
	public void findMyShirt () {
		
		switch(chart) {
		
		case XSMALL:
			System.out.println("Extra Small size Shirt is selected");
			break;
			
		case SMALL:
			System.out.println("Small size Shirt is selected");
			break;
			
		case MEDIUM:
			System.out.println("Medium size Shirt is selected");
			break;
			
		case LARGE:
			System.out.println("Large size Shirt is selected");
			break;	
			
		case XLARGE:
			System.out.println("Extra Large size Shirt is selected");
			break;
			
		case XXLARGE:
			System.out.println("Extra Extra Large size Shirt is selected");
			break;
			
		default:
			System.out.println("Sorry! We are out of Stock!");
			break;		
			
		}
	
	}	

}
