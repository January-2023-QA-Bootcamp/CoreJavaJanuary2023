package lec19_01_Java_Nested_Class;

public class PaymentSystem04 { //opening of outer class body
    PayByPayPal payByPayPal = new PayByPayPal();
    PayByCrypto payByCrypto = new PayByCrypto();
    PayByCreditCard payByCreditCard = new PayByCreditCard();

    public void processPayment() { // method of outer class
        System.out.println("process customer payment");
        payByPayPal.processPaymentByPayPal();
        PayByCrypto.processPaymentByCrypto1(); //static method
        payByCrypto.processPaymentByCrypto2(); //non-static method
        payByCreditCard.processPaymentByCreditCard();
    }

    private void processPayment1() { // method of outer class
        System.out.println("process customer payment01");
    }

    protected void processPayment2() { // method of outer class
        System.out.println("process customer payment02");
    }

    // New: The innner classes are private
    private class PayByPayPal {//opening of inner class body
        public void processPaymentByPayPal() {
            System.out.println("process customer payment by PayPal");
        }
    }//closing of inner class body

    private static class PayByCrypto {
        public static void processPaymentByCrypto1() {
            System.out.println("process customer payment by Crypto -- static method");
        }
        public void processPaymentByCrypto2() {
            System.out.println("process customer payment by Crypto -- non-static method");
        }
    }

    private class PayByCreditCard {//opening of inner class body
        public void processPaymentByCreditCard() { // a non-static method cannot contain a static method
            System.out.println("process customer payment by Credit Card");
        }
    }//closing of inner class body

} //closing of outer class body
