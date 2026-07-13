package test;

import genericos.Box;

import genericos.Printer;

public class TestConstructor {
    public static void main(String[] args) {
        Printer printer = new Printer("Java 21");
        Printer number = new Printer(234);

        Box<String> box = new Box<>("Java 21", 2026);
    }
}
