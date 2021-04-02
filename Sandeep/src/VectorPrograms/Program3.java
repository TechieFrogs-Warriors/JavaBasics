package VectorPrograms;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        // Create an empty Vector
        Vector<Integer> v = new Vector<>();

        // Add elements in the vector
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(20);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);

        // Display the vector elements
        System.out.println("\nValues in vector: " + v);

        // use remove() method to delete the first occurence of an element
        System.out.println("\nRemove first occourence of element :: " + v.remove((Integer) 20));

        // Display the vector elements afre remove() method
        System.out.println("\nValues in vector :: " + v);

        // Remove the element at index 4
        System.out.println("\nRemove element at index :: " + v.remove(4));
        System.out.println(v);

        // Remove an element
        v.removeElementAt(5);

        // Checking vector and displays the element
        System.out.println("\nVector element after removal :: " + v);

        // Get the hashcode for this vector
        System.out.println("\nHash code of this vector :: " + v.hashCode());

        // Get the element at specified index
        System.out.println("\nElement at index  is :: " + v.get(1));
    }
}
