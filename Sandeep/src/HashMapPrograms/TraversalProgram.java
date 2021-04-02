package HashMapPrograms;

import java.util.*;

public class TraversalProgram {
    public static void main(String[] args) {
        // initialize a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Add elements using put method
        hm.put("Sandeep", 1);
        hm.put("Answini", 2);
        hm.put("karthik", 3);
        hm.put("chandra", 4);
        hm.put("Kalyani", 5);

        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : hm.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
}
