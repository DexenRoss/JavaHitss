package test;

import classes.Employee;
import genericos.Pair;
import genericos.Response;

public class TestPair {
    public static void main(String[] args) {
        Response<Employee,String> responseEmployee = new Response<Employee,String>(new Employee("Emilio Caballero"), null);

        System.out.println(responseEmployee.getData()+" -> "+responseEmployee.getError());

        Response<Employee, String> response = new Response<Employee,String>(null, "Employee doesn't exist");
        if (response.getData() !=null) {
            System.out.println(response.getData().getName());
        }else{
            System.out.println(response.getError());
        }
        
    }
}
