package LinkedHashSetPrograms;

import java.util.*;

public class SynchronizedProgram {
    public static void main(String[] args) {
        LinkedHashSet<String> l = new LinkedHashSet<String>();

        l.add("Sai Sandeep");
        l.add("Answini");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Karthik");
        l.add("Srikanth");

        Set<String> synchronizedSet = Collections.synchronizedSet(l);
        System.out.println(synchronizedSet);
    }
}
