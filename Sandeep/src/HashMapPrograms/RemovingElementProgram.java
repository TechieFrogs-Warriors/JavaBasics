package HashMapPrograms;

import java.util.*;

public class RemovingElementProgram {
    public static void main(String[] args) {
        // Initialization of a HashMap
        Map<Integer, String> hm = new HashMap<Integer, String>();

        // Add elements using put method
        hm.put(1, "Sandeep");
        hm.put(2, "Answini");
        hm.put(3, "karthik");
        hm.put(4, "chandra");
        hm.put(5, "Kalyani");

        // Initial HashMap
        System.out.println("Mappings of HashMap are  :: " + hm);

        // remove element with a key
        // using remove method
        hm.remove(1);

        // Final HashMap
        System.out.println("Mappings after removal are :: " + hm);
    }
}
