package VectorPrograms;

import java.util.*;

public class Program20 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(10);
        v.add(40);

        // Obtain an index of last occurrence of the specified element by using the
        // lastIndexOf() method
        System.out.println("The Last Index of the  element is :: " + v.lastIndexOf(10));

        System.out.println("\nThe lase element of the vector is :: " + v.lastElement());
    }
}
