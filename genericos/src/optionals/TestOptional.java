package optionals;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 21");
        Optional<Integer> optional2 = Optional.ofNullable(null); //Modificar este null para probar el flujo del main
        if (optional.isEmpty()) {
            System.out.println("sin valor");
        }
        System.out.println(optional);
        System.out.println(optional2);
        System.out.println("isPresent(): "+optional2.isPresent());
        System.out.println("isEmpty(): "+optional2.isEmpty());
        if (optional2.isPresent()) {
            System.out.println(optional2.get());
        }
        System.out.println("orElse(): "+optional2.orElse(23));
        optional2.ifPresent(n -> System.out.println(n));
        System.out.println(optional2.orElseThrow(
            () -> new IllegalArgumentException("null number")
        ));
        
    }
}
