package VectorPrograms;

import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>();

        v1.add(11);
        v1.add(22);
        v1.add(33);
        v1.add(44);

        Vector<Integer> v2 = new Vector<Integer>();

        v2.add(22);
        v2.add(33);

        // Check the all elemnts of vector2 that contains in the vector1
        System.out.println("Does vector1 contains all the elements in the vector1 :: " + v1.containsAll(v2));

        // adding a new element to vector2
        v2.add(101);

        // Checking again the all elemnts of vector2 that contains in the vector1
        System.out.println("\nDoes vector1 contains all the elements in the vector1 :: " + v1.containsAll(v2));
    }
}
