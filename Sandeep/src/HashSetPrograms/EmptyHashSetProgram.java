package HashSetPrograms;

import java.util.*;

public class EmptyHashSetProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        // Add elements into the Set
        h.add("Sai");
        h.add("Sandeep");
        h.add("Krishna");
        h.add("Maddipati");

        // Print the HashSet Elements
        System.out.println("HashSet Elements are :: " + h);

        // Check for the hash set is empty or not by using the isEmpty() method
        System.out.println("\nIs the hashset is empty :: " + h.isEmpty());

        // Clearing the set and Check for the empty set
        h.clear();

        // Check for the hash set is empty or not by using the isEmpty() method
        System.out.println("\nIs the hashset is empty :: " + h.isEmpty());
    }
}
