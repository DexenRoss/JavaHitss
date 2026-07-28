import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args){
        String name = "Javac 1";
        System.out.println(name.hashCode());
        Map<Integer,String> names = new HashMap<>();
        names.put(21, "Emilio");
        names.put(21, "Dexen");
        names.put(12, "Liz");
        names.put(14, "Mar");
        System.out.println(names);

        System.out.println(names.get(21));
        if (names.containsKey(21)) {
            System.out.println(names.remove(21));
        }
        
        System.out.println("key? "+names.containsKey(14));
        System.out.println("Valor: "+names.containsValue("Liz"));
    }
}
