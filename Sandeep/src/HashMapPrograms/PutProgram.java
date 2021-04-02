package HashMapPrograms;

import java.util.*;

public class PutProgram {
    public static void main(String[] args) {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap
        // using Generics
        HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

        // Add Elements using put method
        hm1.put(1, "Sandeep");
        hm1.put(2, "Karthik");
        hm1.put(3, "Chandra");

        hm2.put(1, "Answni");
        hm2.put(5, "Kalyani");

        System.out.println("Mappings of HashMap hm1 are : " + hm1);
        System.out.println("Mapping of HashMap hm2 are : " + hm2);
    }
}
