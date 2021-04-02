package VectorPrograms;

import java.util.*;

public class Program5 {
    public static void main(String[] args) {
        Vector<String> v1 = new Vector<>(4);

        v1.add("Sai sandeep");
        v1.add("Answini");
        v1.add("Kalyani");
        v1.add("Karthik");

        // Create a second empty vector
        Vector<String> v2 = new Vector<>(4);

        // Add elements in the second vector
        v2.add("Chandra");
        v2.add("Srikanth");

        // Add elements of the v2 at 1st element position in the v1
        v1.addAll(0, v2);

        System.out.println("Final vector list: " + v1);
    }
}
