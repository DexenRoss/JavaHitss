import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        // gotORDefault() -> Obtiene un valor si es que existe o te da uno por defecto
        // putIfAbsent() -> Inserta solo si la clave no existe
        // replace() -> Reemplaza un valor existente
        // compute() -> Calcula un nuevo valor
        // merge() -> combina valores
        Map<String, Integer> sales = new HashMap<>();
        sales.merge("Laptop", 1, Integer::sum);
        System.out.println(sales);
        sales.merge("Laptop", 5, Integer::sum);
        sales.merge("Mouse", 2, Integer::sum); 
        System.out.println(sales);

    }
}
