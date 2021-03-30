package VectorPrograms;

import java.util.*;

public class Program2 {
    public static void main(String[] args) {

        // Create an empty vector with initial capacity 5
        Vector<String> v = new Vector<String>(5);

        // Adding elements to a vector
        v.add("Sai sanddep");
        v.add("Karthik");
        v.add("Kalyani");
        v.add("Answini");
        v.add("Krishna");

        // Check size and capacity
        System.out.println("Size is :: " + v.size());
        System.out.println("\nDefault capacity is :: " + v.capacity());

        // Display Vector elements
        System.out.println("\nVector element is :: " + v);
        v.addElement("Chandra");
        v.addElement("Srikanth");

        // Again check size and capacity after two insertions
        System.out.println("\nSize after addition :: " + v.size());
        System.out.println("\nCapacity after addition is :: " + v.capacity());

        // Display Vector elements again
        System.out.println("\nElements are :: " + v);

        // Checking if Tiger is present or not in this vector
        if (v.contains("Chandra")) {
            System.out.println("\nThe name is present at the index ::" + v.indexOf("Chandra"));
        } else {
            System.out.println("\nThe name is not present in the list.");
        }

        // Get the first element
        System.out.println("\nThe first Name of the vector is :: " + v.firstElement());

        // Get the last element
        System.out.println("\nThe last Name of the vector is :: " + v.lastElement());
    }

}
