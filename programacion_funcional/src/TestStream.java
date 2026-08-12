import java.util.List;

import models.Employee;

public class TestStream {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Emilio", 25000.00),
            new Employee("Mariana", 35000.00),
            new Employee("Liz", 45000.00)
        );  
    }

    //var total = employees.stream().filter()
}
