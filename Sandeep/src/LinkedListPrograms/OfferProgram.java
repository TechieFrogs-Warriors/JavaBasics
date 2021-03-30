package LinkedListPrograms;

import java.util.*;

public class OfferProgram {
    public static void main(String[] args) {
        // Creating an empty LinkedList
        LinkedList<String> l = new LinkedList<String>();

        // Use add() method to add elements in the list
        l.add("Sai");
        l.add("Sandeep");
        l.add("Krishna");
        l.add("Venkata");
        l.add("sidhhu");

        System.out.println("The LinkedList is :: " + l);

        // now adding the element in the linked list by using the offer() method
        l.offer("Chandra");
        l.offer("Kalyani");

        System.out.println("\nThe LinkedList is :: " + l);

        // now adding the elements at the first using the OfferFirst() method
        l.offerFirst("Karthik");

        // now adding the element at the last by using the OfferLAst() method
        l.offerLast("Answini");

        System.out.println("The LinkedList is :: " + l);
    }
}
