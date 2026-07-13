package test;

import classes.Employee;
import genericos.Util;

public class TestUtil {
    public static void main(String[] args) {
        Util.print("String");
        Util.print(34);
        Util.print(new Employee("Emilio"));

        System.out.println(Util.duplicate(34.23));
        Util.otrer("Description");
    }
}
