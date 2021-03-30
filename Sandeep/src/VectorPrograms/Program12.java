package VectorPrograms;

import java.util.*;

public class Program12 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Kalyani");
        v.add("Answini");
        v.add("Karthik");
        v.add("Chandra");
        v.add("Sai sandeep");

        // Create an new Array with intial size 6
        String tempArray[] = new String[6];

        // Copy Vector element to Array
        v.copyInto(tempArray);

        System.out.println("Elements in the Array ");
        for (String temp : tempArray) {
            System.out.println(temp);
        }
    }
}
