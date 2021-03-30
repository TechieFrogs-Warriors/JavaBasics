package VectorPrograms;

import java.util.*;

public class Program18 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("Chandra");
        v.add("Karthik");
        v.add("Kalyani");
        v.add("Answini");

        System.out.println("elements of vector :: ");
        v.forEach(System.out::println);

        // Insert the element at 2nd position
        v.insertElementAt("Sai sandeep", 1);
        System.out.println("\nElements of vector after insertion :: ");
        v.forEach(System.out::println);

    }
}
