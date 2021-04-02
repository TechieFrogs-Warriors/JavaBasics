package TreeSetPrograms;

import java.util.*;

public class AsseccingElementProgram {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        t.add("SaiSandeep");
        t.add("Answini");
        t.add("Karthik");
        t.add("Chandra");
        t.add("Karthik");
        t.add("Srikanth");

        System.out.println("Tree Set is :: " + t);

        String check = "Srikanth";

        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains :: " + check + " " + t.contains(check));

        // Print the first element in
        // the TreeSet
        System.out.println("First Value is :: " + t.first());

        // Print the last element in
        // the TreeSet
        System.out.println("Last Value is :: " + t.last());

        String val = "Answini";

        // Find the values just greater
        // and smaller than the above string
        System.out.println("Larger value is :: " + t.higher(val));
        System.out.println("Samller value is :: " + t.lower(val));
    }
}
