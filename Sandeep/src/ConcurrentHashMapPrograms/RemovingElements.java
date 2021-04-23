package ConcurrentHashMapPrograms;

import java.util.Map;
import java.util.concurrent.*;

public class RemovingElements {
    public static void main(String[] args) {
        Map<String, String> chm = new ConcurrentHashMap<String, String>();

        // Adding elements to the map
        // using put() method
        chm.put("1", "1");
        chm.put("2", "1");
        chm.put("3", "1");
        chm.put("4", "1");
        chm.put("5", "1");
        chm.put("6", "1");

        // Printing the map
        System.out.println("Map: " + chm);
        System.out.println();

        // Removing the mapping
        // with existing key 6
        // using remove() method
        String valueRemoved = chm.remove("6");

        // Printing the map after remove()
        System.out.println("After removing mapping with key 6:");
        System.out.println("Map: " + chm);
        System.out.println("Value removed: " + valueRemoved);
        System.out.println();

        // Removing the mapping
        // with non-existing key 10
        // using remove() method
        valueRemoved = chm.remove("10");

        // Printing the map after remove()
        System.out.println("After removing mapping with key 10:");
        System.out.println("Map: " + chm);
        System.out.println("Value removed: " + valueRemoved);
        System.out.println();

        // Now clear the map using clear()
        chm.clear();

        // Print the clea Map
        System.out.println("Map after use of clear(): " + chm);
    }
}
