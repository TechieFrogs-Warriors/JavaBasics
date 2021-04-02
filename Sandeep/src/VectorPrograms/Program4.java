package VectorPrograms;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(4);

        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println("List of first arrayList :: " + v);

        ArrayList<Integer> arrlist = new ArrayList<Integer>(4);

        arrlist.add(4);
        arrlist.add(5);
        arrlist.add(6);
        System.out.println("List of second arrayList: " + arrlist);

        // Adding all elements of ArrayList into the vector
        v.addAll(arrlist);
        // Printing the final arrayList
        System.out.println("Final Vector elements :: " + v);
    }
}
