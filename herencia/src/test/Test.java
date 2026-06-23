package test;

import hijas.Teacher;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("Eloy");
        teacher.setAge(41);
        //System.out.println(teacher);
        teacher.showInformation();
    }
}
