package TreeMapPrograsm;

import java.util.*;

public class ChangingElements {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the Elements
        tm.put(3, "Sai");
        tm.put(2, "Krishna");
        tm.put(1, "Sandeep");

        System.out.println(tm);

        tm.put(2, "Venkata");

        System.out.println(tm);
    }
}
