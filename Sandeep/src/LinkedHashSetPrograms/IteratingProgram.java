package LinkedHashSetPrograms;

import java.util.*;

public class IteratingProgram {
    public static void main(String[] args) {
        Set<String> l = new LinkedHashSet<String>();

        l.add("Sai Sandeep");
        l.add("Answini");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Karthik");
        l.add("Srikanth");

        // Iterating though the LinkedHashSet
        Iterator itr = l.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  ");
        }
    }
}
