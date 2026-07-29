package services;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Product;

public class ProductHistoryAccesOrderService {
    private final Map<String,Product> history;

    public ProductHistoryAccesOrderService(){
        history = new LinkedHashMap<>(16, 0.75f,true);
    }

    public void registerConsultProduct(Product p){
        history.put(p.sku(), p);

    }

    public Product findProduct(String sku){
        return history.get(sku);
    }

    public void showHistoryProducts(){
        if (history.isEmpty()) {
            System.out.println("Historial vacio");
            return;
        }
        history.forEach((sku,product)->System.out.println(sku+" -> "+product));
    }
}
