package test;

import classes.Employee;
import records.Result;

public class TestRecord {
    public static void main(String[] args) {
        Result<String> result = new Result<>("Java 21"); 
        Result<Employee> result2 = new Result<>(new Employee(21L,"Ernesto"));
        System.out.println(result2.value());
        System.out.println(result.value());
    }
}
