package test;

import hijas.Administrative;
import hijas.Sales;


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
        administrative.showInformation();
        administrative2.showInformation();
        System.out.println("============================");
        System.out.println("Info about our Sales team");
        salesMan.showInformation();
        salesMan2.showInformation();
        
    
    }
}
