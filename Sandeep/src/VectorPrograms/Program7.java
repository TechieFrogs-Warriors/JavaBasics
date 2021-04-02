package VectorPrograms;

import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("A");
        v.add("B");
        v.add("C");
        v.forEach(System.out::println);

        System.out.println("Size of Vector before clear() method :: " + v.size());

        // Clear the vector by using the clear() method
        v.clear();

        System.out.println("\nSize of Vector after clear() method :: " + v.size());

    }
}
