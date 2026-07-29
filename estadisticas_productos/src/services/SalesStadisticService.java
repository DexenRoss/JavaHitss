package services;

import java.util.HashMap;
import java.util.Map;

public class SalesStadisticService {
    private final Map<String, Integer> sales;

    public SalesStadisticService(){
        sales = new HashMap<>();
    }

    public void registerSales(String productCode, int units){
        //(oldValue,newValue) ->oldValue+newValue
        sales.merge(productCode, units, Integer::sum);
    }

    public int getSale(String productCode){
        return sales.getOrDefault(productCode,0);
    }

    public void regiterProduct(String productCode){
        sales.putIfAbsent(productCode, 0);
    }

    public void addBonus(String productCode){
        sales.computeIfPresent(productCode, (code,units)->units+10);
    }

    public void initializeCounter(String productCode){
        sales.computeIfAbsent(productCode, code -> 0);
    }

    public void showStadistics(){
        if (sales.isEmpty()) {
            System.out.println("No hay estadisticas");
            return;
        }
        sales.forEach((p,u)-> System.out.println(p+" "+u));
    }
}
