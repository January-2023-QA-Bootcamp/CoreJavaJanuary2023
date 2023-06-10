package lec22_java_coding_challenge;

// 20
// in line 11, value of num changed to 2*10 = 20, line 15, 20 is printed

public class H01_calculator {

	int num = 100;

	public void cal(int num) {
		this.num = num * 10;
	}

	public void printNum() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		H01_calculator obj = new H01_calculator();
		obj.cal(2);
		obj.printNum();

	}
}
