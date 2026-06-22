package clases;

public class Product {
    String code;
    String name;
    double price;
    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
    public Product() {
        this("N/A", "Generic Product", 0);
    }

    // Metodos de instancia --> Pertenecen al objeto, necesito una instancia para ejecutar

    void applyDiscount(double percentage){
        price -= (price*percentage)/100;
    }

    void showInformation(){
        System.out.println("Code: %s\tName: %s\tPrice: $%.2f".formatted(code,name,price));
    }

    // Metodos estaticos --> Pertenecen a la clase, se invocan sin crear objetos (instancias), utilizan la palabra estatic

    static Product creatTestProduct(){
        return new Product("P001","Soccer ball",650.45);
    } 
}
