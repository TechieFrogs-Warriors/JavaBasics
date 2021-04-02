package LinkedListPrograms;

import java.util.*;

public class IteratingProgram {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        l.add("Sai sandeep");
        l.add("answini");
        l.add(1, "Kalyani");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Sai sandeep");
        l.add(null);

        // Using the for each loop
        for (String str : l) {
            System.out.print(str + " ");
        }
    }
}
