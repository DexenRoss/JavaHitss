import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

//import models.Product;

public class App {
    public static void main(String[] args){
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(56);
        numbers.add(46);
        numbers.add(96);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
        numbers.add(34);
        System.out.println(numbers);
        System.out.println("first: "+numbers.first());
        System.out.println("last: "+numbers.last());
        System.out.println("higher: "+numbers.higher(96));
        System.out.println("lower: "+numbers.lower(5));
        System.out.println("ceiling: "+numbers.ceiling(20));
        System.out.println("floor: "+numbers.floor(78));
        System.out.println("tailSet: "+numbers.tailSet(20));
        System.out.println("tailSet: "+numbers.tailSet(6,false));
        System.out.println("headSet: "+numbers.headSet(56));
        System.out.println("headSet: "+numbers.headSet(56,true));
        System.out.println("subset: "+numbers.subSet(6, 56));


        System.out.println("==============================");
        Set<String> names = new TreeSet<>();
        names.add("Emilio");
        names.add("Wicho");
        names.add("Annie");
        names.add("Mariana");
        names.add("Liz");
        System.out.println(names);
        //System.out.println("first: "+names.first());

        /*System.out.println("=================================");
        Set<Product> products = new TreeSet<>();
        products.add(new Product(1L,"Laptop"));*/


    }
}
