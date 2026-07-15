package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        System.out.println("size(): "+products.size());
        System.out.println(products);
        System.out.println("=======For each=========");
        for (String string : products) {
            if (string.equals("Mouse")) {
                products.remove(1);
            }
            System.out.println(string);
        }
        System.out.println("===========For==========");
        for(int i =0; i<products.size();i++){
            System.out.println(products.get(i));
        }
        System.out.println("========products.forEach()=============");
        products.forEach(p->System.out.println(p.toUpperCase()));
    }
}
