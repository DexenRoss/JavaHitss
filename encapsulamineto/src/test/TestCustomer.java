package test;

import clases.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Emilio","emi@gmail.com");
        customer.showInformation();
        Customer customer2 = new Customer("", null);
        
        customer2.showInformation();

    }
}
