package test;

import classes.Employee;
import classes.Product;
import genericos.Box;
import genericos.Pair;

public class Test {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setValue("Java 21");
        //box.setValue(34);
        String result = box.getValue();
        System.out.println(result);
        box.show(new Product("Mouse"));

        Box<Integer> box2 = new Box<>();
        box2.setValue(34);
        int suma = box2.getValue() + 34;
        System.out.println(suma);

        Box<Employee> boxEmployee = new Box<>();
        boxEmployee.setValue(new Employee("Emilio Caballero"));
        Employee employee = boxEmployee.getValue();
        System.out.println(employee.getName());

        Pair<String, Integer> pair = new Pair<>("Laptop", 55); 
        System.out.println(pair.getKey()+" -> "+pair.getValue());

        Pair<String, Product> pair2 = new Pair<String,Product>("A100", new Product("Mouse"));
        System.out.println(pair2.getKey()+" -> "+pair2.getValue().getName());
    }

}
