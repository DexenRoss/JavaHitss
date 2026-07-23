package services;

import java.util.HashSet;
import java.util.Set;

import models.Product;

public class ProductRegistry {
    private final Set<Product> products;

    public ProductRegistry() {
        this.products = new HashSet<>();
    }

    public boolean registerProduct(Product p){
        boolean skuExists = false;
        for (Product product : products) {
            if (product.sku().equals(p.sku())) {
                //skuExists = true;
                return skuExists;
            }
        }
    
        return products.add(p);
    }

    public boolean containsProduct(Product p){
        return products.contains(p);
    }

    public boolean removeProduct(Product p){
        return products.remove(p);
    }

    public void showAllProducts(){
        products.forEach(p -> System.out.println(p));
    }
    
}
