package LinkedListPrograms;

import java.util.*;

public class PollProgram {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();

        // Use add() method to add elements in the list
        l.add("Sai");
        l.add("Sandeep");
        l.add("Krishna");
        l.add("Venkata");
        l.add("sidhhu");

        System.out.println("The LinkedList is :: " + l);

        // now removing the element by using the Poll() method
        l.poll();
        System.out.println("The LinkedList is :: " + l);

        // now removing the first element by using the PollFirst() method
        l.pollFirst();

        // now removing the Last element by using the PollLast() method
        l.pollLast();

        System.out.println("The LinkedList is :: " + l);
    }
}
