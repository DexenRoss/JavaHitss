package classes;

/**
 * PaypalPayment
 */
public final class PaypalPayment extends Payment {

    private String email;
    public PaypalPayment(double amount, String email) {
        super(amount);
        this.email = email;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void processPayment() {
        validAmount();
        System.out.println("Conecting to PayPal......");
        System.out.println("Account: "+email);
        System.out.println("PayPal Payment completed.");
    }

}
