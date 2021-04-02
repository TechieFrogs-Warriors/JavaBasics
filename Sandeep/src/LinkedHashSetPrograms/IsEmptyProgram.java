package LinkedHashSetPrograms;

import java.util.*;

public class IsEmptyProgram {
    public static void main(String[] args) {
        LinkedHashSet<String> l = new LinkedHashSet<String>();
       
        l.add("Sai Sandeep");
        l.add("Answini");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Karthik");
        l.add("Srikanth");
        boolean flag = l.isEmpty();
        if (flag) {
            System.out.println("LinkedList empty");
        } else {
            System.out.println("LinkedList is not empty");
        }
    }
}
