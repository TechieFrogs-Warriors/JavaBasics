package LinkedHashSetPrograms;

import java.util.*;

public class RemovingProgram {
    public static void main(String[] args) {

        LinkedHashSet<String> l = new LinkedHashSet<String>();

        l.add("Sai Sandeep");
        l.add("Answini");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Karthik");
        l.add("Srikanth");

        // print elements to the console
        System.out.println("Elements in LinkedHashSet :: " + l);

        // Removing the element by using the remove() method
        l.remove("Srikanth");

        System.out.println("\nAfter removing element " + l);

        // Returns false if the element is not present in the linkedhashset
        System.out.println(l.remove("Sai"));
    }
}
