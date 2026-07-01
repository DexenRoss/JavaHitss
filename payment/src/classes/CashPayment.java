package classes;

/**
 * CashPayment
 */
public final class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void processPayment() {
        validAmount();
        System.out.println("Receiving cash..........");
        System.out.println("Cash Payment succesfully");
    }

}
