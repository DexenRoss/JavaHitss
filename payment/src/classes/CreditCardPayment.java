package classes;

/**
 * CreditCardPayment
 */
public final class CreditCardPayment extends Payment {
    private String carNumber;
    public CreditCardPayment(double amount, String string) {
        super(amount);
        //TODO Auto-generated constructor stub
        this.carNumber = string;
    }

    @Override
    public void processPayment() {
        validAmount();
        System.out.println("Connecting to bank......");
        System.out.println("Authorizing card: "+carNumber.substring(carNumber.length()-4));
        System.out.println("Credit Card Payment accepted");
    }

}
