package clases;

public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product();
        product.showInformation();

        Product product2 = Product.creatTestProduct();
        product2.applyDiscount(10);
        product2.showInformation();
    }
}
