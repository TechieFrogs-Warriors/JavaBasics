package LinkedListPrograms;

import java.util.*;

public class AddFirstLastProgram {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();

        l.add("Karthik");
        l.add("Chandra");
        l.add("Answini");
        System.out.println("The LinkedList is :: ");

        // adding the elemnts at the first place by using the addFirst() method
        l.addFirst("Sai");
        l.addFirst("Sandeep");

        // adding teh elements at the last place by using the addLast() method
        l.addLast("Kalyani");
        l.addLast("Sai Sandeep");

        System.out.println("\nThe elements in the linked list is :: " + l);

        System.out.println("\nThe First Element in the LIkedList is :: " + l.getFirst());
        System.out.println("\nThe Last Element in the LinkedList is :: " + l.getLast());
    }
}
