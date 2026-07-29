package services;

import java.util.HashMap;
import java.util.Map;

import model.ProductStadistics;

public class SalesProductStadisticService {
    private final Map<String, ProductStadistics> sales;

    public SalesProductStadisticService(){
        sales = new HashMap<>();
    }

    public void registerSales(ProductStadistics p){
        //(oldValue,newValue) ->oldValue+newValue
        sales.compute(p.productCode(),(key,current) -> {
            if (current == null) {
                return new ProductStadistics(key,p.unit());
            }
            return new ProductStadistics(key,current.unit()+p.unit());
        } );
    }

    

    public void showStadistics(){
        if (sales.isEmpty()) {
            System.out.println("No hay estadisticas");
            return;
        }
        sales.forEach((p,u)-> System.out.println(p+" "+u));
    }
}
