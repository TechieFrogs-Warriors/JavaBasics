package ConcurrentHashMapPrograms;

import java.util.concurrent.*;

public class AddingElements {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();

        // Adding elements to the map
        // using put() method
        chm.put("1", "1");
        chm.put("2", "1");
        chm.put("3", "1");
        chm.put("4", "1");
        chm.put("5", "1");
        chm.put("6", "1");

        // Printing the map
        System.out.println("Mappings of my_cmmap : " + chm);

        // create another concurrentHashMap
        ConcurrentHashMap<String, String> chm1 = new ConcurrentHashMap<>();

        // copy mappings from my_cmmap to new_chm
        chm1.putAll(chm);

        // Displaying the new map
        System.out.println("New mappings are: " + chm1);
    }
}
