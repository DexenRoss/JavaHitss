package test;

import java.math.BigDecimal;

import models.Product;
import services.ProductHistoryAccesOrderService;
import services.ProductHistoryService;

public class TestHistoryProduct {
    public static void main(String[] args) {
        //ProductHistoryService service = new ProductHistoryService();
        ProductHistoryAccesOrderService service = new ProductHistoryAccesOrderService();
        service.registerConsultProduct(new Product("SKU-001", "Laptop", new BigDecimal(15000.50)));
        service.registerConsultProduct(new Product("SKU-002", "Keyboard", new BigDecimal(2600.00)));
        service.registerConsultProduct(new Product("SKU-003", "Mouse", new BigDecimal(1500.50)));
        service.registerConsultProduct(new Product("SKU-004", "Monitor", new BigDecimal(10000.50)));
        service.registerConsultProduct(new Product("SKU-005", "Chair", new BigDecimal(12000.50)));
        System.out.println("==================================");
        service.showHistoryProducts();
        service.registerConsultProduct(new Product("SKU-001", "Laptop Gamer", new BigDecimal(15000.50)));

        System.out.println("=============CONSULTA============");
        System.out.println("SKU-003: "+service.findProduct("SKU-003"));
        System.out.println("==================================");
        service.showHistoryProducts();
    }
}
