package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Emilio","Eloy","Carlos"));
        Iterator<String> iterator = names.iterator();
        System.out.println(names);
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Eloy")) {
                iterator.remove();
            }
            
        }


        /*for (String string : names) {
            if (string.equals("Eloy")) {
                names.remove(string);
            }
        }*/
        System.out.println(names);
        //System.out.println(iterator.next());

        
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
        //System.out.println(iterator.next());
        //System.out.println(iterator.next());
        //System.out.println(iterator.next());
    }
}
