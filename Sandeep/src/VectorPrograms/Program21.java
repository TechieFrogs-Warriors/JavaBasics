package VectorPrograms;

import java.util.*;

public class Program21 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(2);
        v.add(30);
        v.add(40);
        v.add(2);

        System.out.println("Vector elements: " + v);

        // replace all vector element "2" with "20"
        Collections.replaceAll(v, 2, 20);

        // Display vector elements after replacement
        System.out.println("New vector elements: " + v);
    }

}
