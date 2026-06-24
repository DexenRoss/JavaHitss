package test;

import hijas.Administrative;
import hijas.Sales;
import hijas.Teacher;

public class Test {
    public static void main(String[] args) {
        /*Teacher teacher = new Teacher();
        teacher.setName("Eloy");
        teacher.setAge(41);
        //System.out.println(teacher);
        teacher.showInformation();*/
        Administrative administrative = new Administrative(null, 0, 0, null);
        Administrative administrative2 = new Administrative("Carlos Villagran", 56, 34546.23, "Desarrollo");
        Sales salesMan = new Sales(null, 0, 0);
        Sales salesMan2 = new Sales("Eduardo", 45, 23456.89);
        System.out.println("Info about our Administrative team:");
        System.out.println("admin1: %s\tSalary: %f\tDepartment %s\t Bono this year: %f".formatted(administrative.getName(),administrative.getSalary(),administrative.getDepartment(),administrative.calculateBonusYear()));
        System.out.println("admin2: %s\tSalary: %f\tDepartment %s\t Bono this year: %f".formatted(administrative2.getName(),administrative2.getSalary(),administrative2.getDepartment(),administrative2.calculateBonusYear()));
        System.out.println("============================");
        System.out.println("Info about our Sales team");
        System.out.println("admin1: %s\tSalary: %f\t Bono this month: %f".formatted(salesMan.getName(),salesMan.getSalary(),salesMan.getComission()));
        System.out.println("admin1: %s\tSalary: %f\t Bono this month: %f".formatted(salesMan2.getName(),salesMan2.getSalary(),salesMan2.getComission()));
        
    
    }
}
