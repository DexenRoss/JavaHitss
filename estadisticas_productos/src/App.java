import services.SalesStadisticService;
import model.ProductStadistics;
import services.SalesProductStadisticService;

public class App {
    public static void main(String[] args){
        SalesStadisticService service= new SalesStadisticService();
        service.initializeCounter("P001");
        service.regiterProduct("P002");
        service.registerSales("P001", 10);
        service.registerSales("P002", 12);
        service.registerSales("P001", 15);
        service.registerSales("P003", 5);
        service.addBonus("P002");
        System.out.println("Ventas P001: "+service.getSale("P001"));
        System.out.println("===============================");
        service.showStadistics();

        SalesProductStadisticService service2= new SalesProductStadisticService();
        service2.registerSales(new ProductStadistics("P001", 10));
        service2.registerSales(new ProductStadistics("P002", 5));
        service2.registerSales(new ProductStadistics("P001", 15));
        System.out.println("===============================");
        service2.showStadistics();
    }
}
