package test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import models.Product;
import models.ProductTraditional;
import services.ProductRegistry;

public class App {
    public static void main(String[] args){
        ProductRegistry registry = new ProductRegistry();
        Product p1 = new Product("SKU-001", "Laptop", new BigDecimal(15000.50));
        Product p2 = new Product("SKU-002","Mouse", new BigDecimal(1250.30));
        Product p3 = new Product("SKU-003","Mouse Gamer", new BigDecimal(1750.99));
        Product p4 = new Product("SKU-003","Mouse Gamer ", new BigDecimal(1750.99));
        System.out.println("===============================REGISTRAR=========================");
        System.out.println("p1: "+ registry.registerProduct(p1));
        System.out.println("p2: "+ registry.registerProduct(p2));
        System.out.println("p3: "+ registry.registerProduct(p3));
        System.out.println("===============================AGREGADOS=========================");
        registry.showAllProducts();
        System.out.println("============================BUSCAR============================");
        System.out.println(registry.containsProduct(p4));
        System.out.println("============================ELIMINAR============================");
        System.out.println(registry.removeProduct(p4));
        System.out.println("===============================AGREGADOS=========================");
        registry.showAllProducts();
        
        /*Set<Product> products = new HashSet<>();
        products.add(p1);
        products.add(p2);
        System.out.println(products);

        System.out.println("==============================================");

        Set<ProductTraditional> traditionals = new HashSet<>();
        ProductTraditional pt1 = new ProductTraditional("SKU-001", "Laptop", new BigDecimal(15000.50));
        ProductTraditional pt2 = new ProductTraditional("SKU-002","Mouse", new BigDecimal(1250.30));
        ProductTraditional pt3 = new ProductTraditional("SKU-001","Keyboard", new BigDecimal(2250.99));
        traditionals.add(pt1);
        traditionals.add(pt2);
        traditionals.add(pt3);
        System.out.println(traditionals);*/


    }
}
