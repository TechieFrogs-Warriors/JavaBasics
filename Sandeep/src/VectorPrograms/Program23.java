package VectorPrograms;

import java.util.*;

public class Program23 extends Vector<String> {
    public static void main(String[] args) {
        Program23 v = new Program23();

        v.add("Sai");
        v.add("Answini");
        v.add("Karthik");
        v.add("Chandra");
        v.add("Kalyani");
        v.add("Sandeep");

        System.out.println("The vector values :: " + v);

        // calling removeRange() function to delete the elements in a given range

        v.removeRange(1, 3);

        System.out.println("Vector values after removing elements :: " + v);
    }
}
