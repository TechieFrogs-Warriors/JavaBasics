package TreeSetPrograms;

import java.util.*;

public class RemovingProgram {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        t.add("SaiSandeep");
        t.add("Answini");
        t.add("Karthik");
        t.add("Chandra");
        t.add("Karthik");
        t.add("Srikanth");

        System.out.println("TreeSet is ::  " + t);

        // Removing the element b
        t.remove("SaiSandeep");

        System.out.println("After removing element is :: " + t);

        // Removing the first element
        t.pollFirst();

        System.out.println("After removing first Element is :: " + t);

        // Removing the last element
        t.pollLast();

        System.out.println("After removing last Element is :: " + t);
    }
}
