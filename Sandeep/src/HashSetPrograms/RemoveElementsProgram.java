package HashSetPrograms;

import java.util.*;

public class RemoveElementsProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Sai Sandeep");
        h.add("Answini");
        h.add("Karthik");
        h.add("Kalyani");
        h.add("chandra");
        System.out.println("An initial list of elements: " + h);

        // Removing specific element from HashSet
        h.remove("chandra");
        System.out.println("\nAfter calling remove(object) method: " + h);
        HashSet<String> h1 = new HashSet<String>();
        h1.add("Srikant");
        h1.add("Sai");
        h.addAll(h1);
        System.out.println("\nUpdated List: " + h);

        // Removing all the new elements from HashSet
        h.removeAll(h1);
        System.out.println("\nAfter calling removeAll() method: " + h);

        // Removing elements on the basis of specified condition
        h.removeIf(str -> str.contains("Sai Sandeep"));
        System.out.println("\nAfter calling removeIf() method: " + h);
        // Removing all the elements available in the set
        h.clear();
        System.out.println("\nAfter calling clear() method: " + h);
    }
}
