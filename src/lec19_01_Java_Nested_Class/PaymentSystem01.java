package lec19_01_Java_Nested_Class;

//To organize code: command/control + Alt + l

public class PaymentSystem01 { // opening of outer class body
	PayByPayPal payByPayPal = new PayByPayPal();
	PayByCrypto payByCrypto = new PayByCrypto();
	PayByCreditCard payByCreditCard = new PayByCreditCard();

	public void processPayment() { // method of outer class
		System.out.println("process customer payment");
	}

	public class PayByPayPal {// opening of inner class body
		public void processPaymentByPayPal() {
			System.out.println("process customer payment by PayPal");
		}
	}// closing of inner class body

	// static nested class or member class
	public static class PayByCrypto {// opening of static nested class body
		public static void processPaymentByCrypto1() {
			System.out.println("process customer payment by Crypto -- static method");
		}

		public void processPaymentByCrypto2() {
			System.out.println("process customer payment by Crypto -- non-static method");
		}
	}// closing of static nested class body

	public class PayByCreditCard {// opening of inner class body
		public void processPaymentByCreditCard() { // a non-static method cannot contain a static method
			System.out.println("process customer payment by Credit Card");
		}
	}// closing of inner class body

} // closing of outer class body
