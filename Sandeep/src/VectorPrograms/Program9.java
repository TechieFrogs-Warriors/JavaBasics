package VectorPrograms;

import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        v.add("Kalyani");
        v.add("Answini");
        v.add("Karthik");
        v.add("Chandra");

        List<String> list = new ArrayList<String>();

        list.add("Kalyani");
        list.add("Karthik");

        System.out.println("Does vector contains all list elements? :: " + v.containsAll(list));

        // adiing the another name to the list
        list.add("Sai sandeep");
        System.out.println("\nDoes vector contains all list elements? :: " + v.containsAll(list));
    }
}
