package services;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
    private final Map<String,Customer> customers;

    public CustomerService(){
        customers = new HashMap<>();
    }

    public void registerCustomer(Customer c){
        customers.put(c.customerID(), c);
    }

    public boolean updateEmailCustomer(String id,String email){
        Customer cus = findCustomer(id);
        if (cus == null) {
            return false;
        }
        Customer updateCustomer = new Customer(cus.customerID(),cus.fullName(),email);
        customers.put(id, updateCustomer);
        return true;
    }

    public Customer findCustomer(String customerId){
        return customers.get(customerId);
    }

    public boolean exitCustomer(String cusId){
        return customers.containsKey(cusId);
    }

    public Customer removeCustomer(String cusId){
        return customers.remove(cusId);
    }

    public void showCustomers(){
        if (customers.isEmpty()) {
            System.out.println("No hay clientes");
        }
        customers.forEach((k,v)->System.out.println(k+" -> "+v));
    }

    public int totalCustomers(){
        return customers.size();
    }
}
