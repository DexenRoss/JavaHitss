package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Emilio");
        names.add("Liz");
        names.add("Mariana");
        names.add("Emilio");
        System.out.println(names);

    }
}
