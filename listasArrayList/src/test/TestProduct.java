package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import models.Product;
import services.ProductManager;

public class TestProduct {
    private static final Comparator<Product> PRICE_NAME = Comparator.comparingDouble(Product::price).thenComparing(Product::name);
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product p1 = new Product(1L,"Laptop",3500);
        manager.addProduct(p1);
        manager.addProduct(new Product(2L,"Mouse",1200));
        manager.addProduct(new Product(5L,"Monitor",12000));
        manager.addProduct(new Product(3L,"Keyboard",3500));
        manager.addProduct(new Product(4L,"Mouse",120));
        System.out.println("=============================");
        manager.printAllProducts();
        System.out.println("========================");
        Product p2 = manager.geProduct(3);
        System.out.println(p2);
        System.out.println("=============================");
        Product p3 = manager.replaceProduct(4, new Product(6L,"Mouse Gamer",2200));
        System.out.println("replace"+p3);
        manager.printAllProducts();
        manager.sizeProduct();
        System.out.println("===============================");
        String name = "Webcam";
        manager.insertProduct(2, new Product(7L,"Webcam",800));
        manager.findByName(name).ifPresentOrElse(p -> System.out.println(p),()->System.out.println("Producto no encontrado"));

        Optional<Product> optional = manager.findByName(name);
        if (optional.isEmpty()) {
            System.out.println("No encontrado");
        }else{
            System.out.println(optional.get());
        }

        manager.allProducts().forEach(System.out::println);
        System.out.println("================Ordenamineto=================");
        List<Product> products = manager.allProducts();

        Collections.sort(products, PRICE_NAME);
        products.forEach(System.out::println);
        products.sort(Comparator.comparing(Product::price));
        products.forEach(p -> System.out.println(p));
        System.out.println("==============================");
        products.sort(Comparator.comparing(Product::price).reversed());
        products.forEach(p -> System.out.println(p));
        System.out.println("==============================");
        products.sort(Comparator.comparing(Product::name));
        products.forEach(p -> System.out.println(p));
        System.out.println("==============================");
        products.forEach(p -> System.out.println(p));
    }
}
