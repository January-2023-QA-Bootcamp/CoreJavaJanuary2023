package lec06_02_java_methods;

public class CalcultaorTest {
	public static void main(String[] args) {
		Calculator01 cal01 = new Calculator01();
		cal01.addition();
		cal01.subtraction();
		cal01.multipliaction();
		cal01.division();
		
		System.out.println("\n-----------------------------------------------------\n");
		Calculator02 cal02 = new Calculator02();  // Constructor Initialized
		cal02.addition();
		cal02.myName();
		cal02.subtraction();
		cal02.usCitizen();
		
		System.out.println("\n-------------------------- From calSpecial -----------------------------\n");
		Calculator03 cal03 = new Calculator03(); // Constructor Initialized
		
		System.out.println("\n-------------------------- calling subtraction method only -----------------------------\n");
		Calculator04 cal04 = new Calculator04(); // Constructor Initialized
		cal04.subtraction();
		
		System.out.println("\n-----------------------------------------------------\n");
		Calculator05 cal05 = new Calculator05();  // Constructor Initialized
		cal05.multiplication();
		cal05.addition(1.34f, 3.22f); // either we can change value of a and b, or keep same
		cal05.division(4.02f, 2.01f); // argument
		cal05.division(9.432402f, 2.63501f); // argument
		cal05.division(6.4302f, 5.501f); // argument
		cal05.addition(9.432402f, 2.63501f);
		cal05.division(3.234f, 2.889f);
		cal05.division(4.234f, 12.889f);
		cal05.division(8.234f, 3.889f);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator06 cal06 = new Calculator06();
		cal06.addition(323, 409); // argument
		cal06.addition(123, 9); // argument
		cal06.addition(30, 19); // argument
		cal06.subtraction(3251, 9);
		cal06.subtraction(333, 11);
		cal06.multiplication(22, 4);
		cal06.multiplication(322, 74);
		cal06.division(44, 8);
		cal06.division(764, 238);
		cal06.stName("Ahmed", "Imran");
		cal06.stName("Shumi", "Aktar");
		cal06.stName("Ifzall", "Ahmed");
		cal06.stName("Sharmin", "Ema");
		System.out.println("\n------------------------------------------------\n");
		cal06.allMethods(4, 2);
		cal06.allMethods(9, 2);
		cal06.allMethods(2239, 332);
		System.out.println("\n------------------------------------------------\n");
		cal06.employee("Mohammad Sharkar", 2188458, 'M', false);
		cal06.employee("Shahiduzzaman", 9088458, 'M', true);
		cal06.employee("Sumaya", 1088458, 'F', true);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator07 cal07 = new Calculator07();
		cal07.addition(34, "43");
		// cal07.addition(34, "Tofael"); // see what kind of error come
		cal07.multiplication(3.65426, "2.73687");
		cal07.addition(32, "66");
		cal07.multiplication(3.65426, "2.73687");
		cal07.subtraction(323, 24.4234);
		cal07.division01(62357, 642.823974f);
		cal07.division02(2357, 42.84f);
		
		System.out.println("\n------------------------------------------------\n");
		Calculator08 cal08 = new Calculator08();
		cal08.division();
		cal08.multiplication();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
