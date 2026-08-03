import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import models.Product;

public class TestInterface {
    public static void main(String[] args) {
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Hola Java 21");

        Consumer<Product> consumer = p -> {
            System.out.println("Name: "+ p.name());
            System.out.println("Price: "+ p.price());
        };

        consumer.accept(new Product("Laptop",23000));

        BiConsumer<String, Integer> maps = (v1,v2) -> System.out.println(v1+ " -> "+v2);
        maps.accept("Laptop", 23000);

        Consumer<String> upper = s -> System.out.println(s.toUpperCase());

        Consumer<String> chain = print.andThen(upper);
        chain.accept("Curso Java 21");

        Supplier<Integer> random = () -> (int) (Math.random() * 100) + 1;
        System.out.println(random.get()); 

        Function<Product,String> productName = p -> p.name();
        String name = productName.apply(new Product("Laptop",23000));
        System.out.println("Product name: "+name);
    }
}
