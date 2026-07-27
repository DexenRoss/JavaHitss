package test;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Emilio");
        names.add("Juan");
        names.add("null");
        System.out.println(names);
    }
}
