package VectorPrograms;

import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<Integer>(null);

        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(20);

        // Check the existence of vector2 in the vector1
        // it thwowa null pointer exception as the vector 1 is null
        System.out.println("Existence: " + v1.containsAll(v2));
    }
}
