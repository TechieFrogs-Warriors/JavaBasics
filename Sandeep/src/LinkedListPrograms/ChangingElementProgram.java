package LinkedListPrograms;

import java.util.*;

public class ChangingElementProgram {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        // adding elemnts into the linkedlist by using the add() method
        l.add("Sai sandeep");
        l.add("answini");
        l.add(1, "Kalyani");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Sai sandeep");
        l.add(null);

        // changing the element by using the set() method
        l.set(1, "Sandeep");

        System.out.println("Elenets inthe linked list are ::");
        l.forEach(System.out::println);
    }
}
