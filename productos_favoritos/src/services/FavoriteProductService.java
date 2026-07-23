package services;

import java.util.LinkedHashSet;
import java.util.Set;

import models.FavoriteProducts;

public class FavoriteProductService {

    private final Set<FavoriteProducts> products;

    public FavoriteProductService() {
        this.products = new LinkedHashSet<>();
    }

    public boolean addFavoriteProduct(FavoriteProducts product){
        return products.add(product);
    }

    public boolean removeFavoriteProduct(FavoriteProducts product){
        return products.remove(product);
    }

    public boolean containFavoriteProduct(FavoriteProducts p){
        return products.contains(p);
    }

    public void showAllFP(){
        if (products.isEmpty()) {
            System.out.println("No hay elemntos");
        }
        System.out.println("======PRODUCTOS FAVORITOS========");
        products.forEach(p -> System.out.println(p));
    }
    
}