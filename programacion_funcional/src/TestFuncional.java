import interfaces.ProductRule;
import models.Product;

public class TestFuncional {
    public static void main(String[] args) {
        ProductRule rule = new ProductRule() {

            @Override
            public boolean test(Product Product) {
                return Product.price() > 1000;
            }
            
        };
        Product product = new Product("Laptop",1500);
        System.out.println(rule.test(product));

        ProductRule rule2 = p -> p.price() > 1000;
        System.out.println(rule2.test(product));
    }
}
