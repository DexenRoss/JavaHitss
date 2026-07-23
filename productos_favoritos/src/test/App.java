import java.math.BigDecimal;

import models.FavoriteProducts;
import services.FavoriteProductService;

public class App {
    public static void main(String[] args){
        FavoriteProductService service = new FavoriteProductService();
        FavoriteProducts laptop = new FavoriteProducts("SKU-001","Laptop", new BigDecimal("25000"));
        FavoriteProducts mouse = new FavoriteProducts("SKU-002","Mouse", new BigDecimal("500"));
        FavoriteProducts keyboard = new FavoriteProducts("SKU-003","Kaeyboard", new BigDecimal("2500"));
        FavoriteProducts mouseDuplicate = new FavoriteProducts("SKU-002","Mouse", new BigDecimal("500"));

        System.out.println("========AGREGAR=========");

        System.out.println(service.addFavoriteProduct(laptop));
        System.out.println(service.addFavoriteProduct(mouse));
        System.out.println(service.addFavoriteProduct(keyboard));
        System.out.println(service.addFavoriteProduct(mouseDuplicate));
        service.showAllFP();
        System.out.println("=====BUSCAR=====");
        System.out.println(service.containFavoriteProduct(mouseDuplicate));
        System.out.println("=====ELIMINAR=====");
        System.out.println(service.removeFavoriteProduct(mouseDuplicate));
        service.showAllFP();

    }
}
