import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import models.Employee;
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

        Product product = new Product("Laptop",23000);
        Product product1 = new Product("Laptop Gamer",33000);


        Function<Product,String> productName = p -> p.name();
        String name = productName.apply(product);
        System.out.println("Product name: "+name);

        BiFunction<Product,Integer, Double> calculateSubTotal = (p, quantity) -> p.price()*quantity;
        System.out.println(calculateSubTotal.apply(product, 2));

        UnaryOperator<String> upperCase = s -> s.toUpperCase();
        System.out.println(upperCase.apply("Hola Java"));

        UnaryOperator<Product> discount = p-> new Product(p.name(),p.price()*.9);
        System.out.println(discount.apply(product));

        BinaryOperator<Product> expensiveProduct = (p1,p2)-> p1.price()>=p2.price()? p1: p2;
        System.out.println(expensiveProduct.apply(product, product1));

        Predicate <Integer> evenNumber = n -> {
            return n % 2 == 0;
        };
        System.out.println(evenNumber.test(26));

        Predicate<Product> max = p -> p.price()>200000;
        System.out.println(max.test(product1));

        Employee employee = new Employee("Emilio",25000.00);

        BiPredicate<Employee, Double> salaries = (e,s) ->  e.salary()>s;
        System.out.println(salaries.test(employee, 28000.00));

        String greeting = "Hola Java 21";
        Supplier<String> supplier = () -> greeting.toUpperCase();
        System.out.println(supplier.get());
    }
}
