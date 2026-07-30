package test;

import java.math.BigDecimal;

import models.Product;
import services.ProductHistoryLRU;

public class TestRLU {
    public static void main(String[] args) {
        ProductHistoryLRU history = new ProductHistoryLRU();
        for (int i = 1; i < 11; i++) {
            history.put("p"+i, new Product("P"+i,"Producto "+i,new BigDecimal(i)));
        }
        System.out.println("=================================");
        history.forEach((k,v)->System.out.println(k+" -> "+v));
        history.put("p11", new Product("P11","Producto 11",new BigDecimal(11)));
        history.forEach((k,v)->System.out.println(k+" -> "+v));
    }
}
