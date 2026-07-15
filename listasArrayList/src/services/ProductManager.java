package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import models.Product;

public class ProductManager {
    private final List<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p){
        products.add(p);
    }

    public Product geProduct(int index){
        if (index >=0 && index < products.size()) {
          return products.get(index);  
        }
        return null;
    }

    public Product replaceProduct(int index, Product product){
        return products.set(index, product);
    }

    public void insertProduct(int index, Product product){
        products.add(index, product);
    }

    public Product removeProduct(int index){
        return products.remove(index);
    }

    public Optional<Product> findByName(String name){
        for (Product product : products) {
            if (product.name().equalsIgnoreCase(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public void printAllProducts(){
        /*for (Product product : products) {
            System.out.println(product);
        }*/
        products.forEach(p -> System.out.println(p));
    }

    
}
