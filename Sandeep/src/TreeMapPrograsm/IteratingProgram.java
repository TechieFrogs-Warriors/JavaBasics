package TreeMapPrograsm;

import java.util.*;

public class IteratingProgram {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the Elements
        tm.put(3, "Sai");
        tm.put(2, "Krishna");
        tm.put(1, "Sandeep");

        for (Map.Entry<Integer, String> mapElement : tm.entrySet()) {

            // getting the key by using hetkey() method
            int key = (int) mapElement.getKey();

            // getting the value by using the getvalue() methid
            String value = (String) mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
