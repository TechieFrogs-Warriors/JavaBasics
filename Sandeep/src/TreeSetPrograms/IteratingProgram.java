package TreeSetPrograms;

import java.util.*;

public class IteratingProgram {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        t.add("SaiSandeep");
        t.add("Answini");
        t.add("Karthik");
        t.add("Chandra");
        t.add("Karthik");
        t.add("Srikanth");

        // Iterating though the TreeSet
        for (String value : t)
            System.out.print(value + "   ");
        System.out.println();
    }
}
