package test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String> maps = new TreeMap<>();
        maps.put(40, "D");
        maps.put(10, "A");
        maps.put(30, "C");
        maps.put(20, "B");
        maps.put(50, "E");

        maps.forEach((k,v)-> System.out.println(k+" -> "+v));
        if (!maps.isEmpty()) {
            System.out.println("Primer llave "+maps.firstKey());
            System.out.println("Ultima clave "+maps.lastKey());
        }
        
        System.out.println("Siguiente clave estrictamente mayor "+maps.higherKey(25));
        System.out.println("Anterior clave estrictamente menor "+maps.lowerKey(25));
        System.out.println("Clave misma o mayor "+maps.ceilingKey(30));
        System.out.println("Clave misma o menor "+maps.floorKey(30));

        //headMap() obtiene las primeras key-1 entradas
        System.out.println("Anteriores: "+maps.headMap(30));
        System.out.println("Anteriores incluida la clave: "+maps.headMap(30, true));

        //tailMap() obtiene las key posteriores
        System.out.println("Posteriores: "+maps.tailMap(30));
        System.out.println("Posteriores sin clave: "+maps.tailMap(30, false));

        //subMap() obtiene un rango
        System.out.println("Tomamos un rango: "+maps.subMap(20,40));
    }
}
