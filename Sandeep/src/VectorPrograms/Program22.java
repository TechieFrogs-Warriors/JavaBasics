package VectorPrograms;

import java.util.*;

public class Program22 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<String>();

        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("10");
        v1.add("20");

        System.out.println("Vector v1: " + v1);

        Vector<String> v2 = new Vector<String>();

        v2.add("A");
        v2.add("B");
        v2.add("C");
        System.out.println("\nVector v1: " + v2);
        boolean changed = v1.retainAll(v2);

        if (changed)
            System.out.println("\nCollection retained");
        else
            System.out.println("\nCollection not retained");

        System.out.println("\nFinal Vector: " + v1);
    }
}
