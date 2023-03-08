package lec19_01_Java_Nested_Class;

public class PaymentSystem02 {
    PayByPayPal payByPayPal = new PayByPayPal();
    PayByCrypto payByCrypto = new PayByCrypto();
    PayByCreditCard payByCreditCard = new PayByCreditCard();

//new from line 9-15
    public void processPayment() { // method of outer class
        System.out.println("process customer payment");
        payByPayPal.processPaymentByPayPal();
        PayByCrypto.processPaymentByCrypto1(); //static method
        payByCrypto.processPaymentByCrypto2(); //non-static method
        payByCreditCard.processPaymentByCreditCard();
    }

    public class PayByPayPal { //inner class
        public void processPaymentByPayPal() {
            System.out.println("process customer payment by PayPal");
        }
    }

    public static class PayByCrypto { //nested static class or member class
        public static void processPaymentByCrypto1() {
            System.out.println("process customer payment by Crypto -- static method");
        }

        public void processPaymentByCrypto2() {
            System.out.println("process customer payment by Crypto -- non-static method");
        }
    }

    public class PayByCreditCard {
        public void processPaymentByCreditCard() {
            System.out.println("process customer payment by Credit Card");
        }
    }
}

