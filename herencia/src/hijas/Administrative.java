package hijas;

import padre.Employee;

public class Administrative extends Employee{
    String department;


    public Administrative(String name, int age, double salary,String department){
        super(name,age,salary);
        try {
            if (department == null) {
            this.department = "HR";
            throw new IllegalArgumentException("You will be a HR kind");
            }else{
                this.department = department;
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error handled by constructor: "+e.getMessage());
        }
        
        
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void showInformation(){
        System.out.println("admin1: %s\tSalary: %f\tDepartment %s\t Bono this year: %f".formatted(getName(),getSalary(),getDepartment(),calculateBonusYear()));
    }
}
