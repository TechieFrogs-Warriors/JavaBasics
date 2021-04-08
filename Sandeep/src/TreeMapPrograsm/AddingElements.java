package TreeMapPrograsm;

import java.util.*;

public class AddingElements {
    public static void main(String[] args) {
        // Default Initialization of a TreeMap
        TreeMap<Integer, String> tm1 = new TreeMap<>();

        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>();

        // Inserting the Elements
        tm1.put(3, "Sai sandeep");
        tm1.put(2, "Sandeep");
        tm1.put(1, "Krishna");

        tm2.put(1, "Geeks");
        tm2.put(2, "For");
        tm2.put(3, "Geeks");

        System.out.println(tm1);
        System.out.println(tm2);
    }
}
