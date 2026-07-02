package classes;

public class Manager extends Employee {

    @Override
    public void work() {
        System.out.println("Admin Enterprise");
    }

    @Override
    public void calculateSalary() {
        System.out.println("Salary: $300000");

    }
    
    public void vacationsApproved(){
        System.out.println("Vacations Approved");
    }
}
