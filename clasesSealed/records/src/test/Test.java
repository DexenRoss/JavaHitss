package test;

import clases.Person;
import records.Rectangle;

public class Test {
    public static void main(String[] args) {
        //Clase Person
        Person person = new Person("Eduardo", 23);
        System.out.println(person);

        records.Person personRecord = new records.Person("Emilio",26);
        System.out.println(personRecord);
        System.out.println(person.getName().equals(personRecord.name()));

        System.out.println("==========Rectangle===========");
        Rectangle square = Rectangle.square(4);
        System.out.println(square.area());
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.area());
    }
}
