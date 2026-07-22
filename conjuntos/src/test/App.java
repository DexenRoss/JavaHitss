package test;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Emilio");
        System.out.println(names.add("Carlos"));
        names.add("Carlos");
        names.add("Liz");
        names.add("Annie");
        
        System.out.println("=================================");
        System.out.println(names);
    }
}
