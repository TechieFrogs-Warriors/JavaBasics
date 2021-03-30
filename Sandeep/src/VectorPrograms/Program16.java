package VectorPrograms;

import java.util.*;

public class Program16 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        // Get the first element using firstElement() method
        System.out.println("First element of the vector :: " + v.firstElement());
        System.out.println(v.lastElement());
    }

}
