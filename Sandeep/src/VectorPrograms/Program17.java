package VectorPrograms;

import java.util.*;

public class Program17 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("Sai sandeep");
        v.add("Krishna");
        v.add("vamsi");
        v.add("charan");

        // Get the hash code value for this vector by using the hashCode() methode
        System.out.println("HashCode of the vector is :: " + v.hashCode());

        System.out.println("\nThe names are :::::::::");
        v.forEach(System.out::println);

        System.out.println("\nThe elemnent at the given index value is :: " + v.get(0));
    }

}
