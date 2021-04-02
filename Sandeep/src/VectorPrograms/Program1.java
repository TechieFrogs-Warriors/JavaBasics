package VectorPrograms;

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        // Create a vector
        Vector<String> v = new Vector<String>();
        // Adding elements using add() method of List
        v.add("Sai sandeep");
        v.add("Chandra");
        v.add("Answini");
        v.add("Kalyani");
        v.add(null);
        // Adding elements using addElement() method of Vector
        v.addElement("Karthik");
        v.addElement("Srikanth");

        System.out.println("Elements are: " + v);
        
    }
}
