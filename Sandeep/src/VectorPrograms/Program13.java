package VectorPrograms;

import java.util.*;

public class Program13 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);

        // Get an element at the specified index
        System.out.println("Element at  given index is = " + vec.elementAt(1));
        System.out.println("\nElement at  given index is = " + vec.elementAt(3));
    }
}
