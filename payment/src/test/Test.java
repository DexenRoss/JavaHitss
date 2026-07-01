package test;

import classes.CashPayment;
import classes.CreditCardPayment;
import classes.Payment;
import classes.PaypalPayment;

public class Test {
    public static void main(String[] args) {
        CreditCardPayment cardPayment = new CreditCardPayment(2500,"2345456572345678");
        Payment[] payments = {
            cardPayment,
            new PaypalPayment(1250, "testing@test.com"),
            new CashPayment(450),
            new CreditCardPayment(1500, "6789845653423434")
        };

        for (Payment payment : payments) {
            payment.showPaymentInfo();
            payment.processPayment();
        }
    }
}
