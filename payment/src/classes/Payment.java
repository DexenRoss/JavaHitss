package classes;

import java.time.LocalDate;

public abstract sealed class Payment permits CreditCardPayment, PaypalPayment, CashPayment {
    private double amount;
    private LocalDate paymentDate;


    public Payment(double amount) {
        this.amount = amount;
        paymentDate = LocalDate.now();
    }

    public abstract void processPayment();

    public double getAmount() {
        return amount;
    }


    public LocalDate getPaymentDate() {
        return paymentDate;
    }


    public void showPaymentInfo(){
        System.out.println("----------------------");
        System.out.println("Payment type: "+getClass().getSimpleName());
        System.out.println("Amount      : $"+getAmount());
        System.out.println("Date        : "+getPaymentDate());
    }

    protected void validAmount(){
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Payment [amount=" + amount + ", paymentDate=" + paymentDate + "]";
    }

    
}
