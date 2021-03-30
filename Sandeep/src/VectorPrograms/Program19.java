package VectorPrograms;

import java.util.*;

public class Program19 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("Chandra");
        v.add("Karthik");
        v.add("Kalyani");
        v.add("Answini");
        v.add("Sai sandeep");

        // checking wether the vector is empty or not by using isEmpty() method
        System.out.println("Vector isEmpty() before? " + v.isEmpty());

        // Remove all elements from the vector by using the removeAllElements() method
        v.removeAllElements();

        // Again checking wether the vector is empty or not by using isEmpty() method
        System.out.println("\nVector isEmpty() after ? " + v.isEmpty());
    }

}
