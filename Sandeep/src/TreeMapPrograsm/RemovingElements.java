package TreeMapPrograsm;

import java.util.*;

public class RemovingElements {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the Elements
        tm.put(3, "Sai");
        tm.put(2, "Krishna");
        tm.put(1, "Sandeep");

        System.out.println(tm);

        tm.remove(2);

        System.out.println(tm);
    }
}
