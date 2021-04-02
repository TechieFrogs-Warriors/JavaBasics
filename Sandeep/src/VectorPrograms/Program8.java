package VectorPrograms;

import java.util.*;

public class Program8 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Sai sandeep");
        v.add("Answini");
        v.add("Kalyani");
        v.add("Karthik");
        v.add("Chandra");

        // Checking if the given element is present or not
        if (v.contains("Kalyani")) {
            System.out.println("The given name is present at the index " + v.indexOf("Kalyani"));
        } else {
            System.out.println("The given name is not present in the list");
        }

        System.out.println("\n Does the gievn name is present? :: " + v.contains("Sai"));
    }
}
