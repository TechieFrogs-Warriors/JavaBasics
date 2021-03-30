package VectorPrograms;

import java.util.*;

public class Program6 {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<Integer>();

        // Add elements in the vector
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(null);
        v.add(20);

        // Print all the elements available in vector
        System.out.println("Elements in vector are :: " + v);

        Vector<Integer> vclone = new Vector<Integer>();
        // clone the vector vec
        vclone = (Vector) v.clone();
        // Print all the elements available in vecclone
        System.out.println("\nElements in vecclone vector are :: " + vclone);

    }
}
