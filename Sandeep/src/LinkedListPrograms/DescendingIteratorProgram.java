package LinkedListPrograms;

import java.util.*;

public class DescendingIteratorProgram {
    public static void main(String[] args) {
        // creating object of TreeMap<Integer, String>
        LinkedList<Integer> l = new LinkedList<Integer>();

        // add some elements to list
        l.add(10);
        l.add(20);
        l.add(30);

        // print the linked list
        System.out.println("LinkedList Eelements are :: " + l);

        // set Iterator as descending
        // using descendingIterator() method
        System.out.println("LinkedList elements after DesecndingItrtaotr :: ");
        Iterator x = l.descendingIterator();

        // print list with descending order
        while (x.hasNext()) {
            System.out.println("Value is :: " + x.next());
        }
    }
}
