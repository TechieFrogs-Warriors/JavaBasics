package LinkedListPrograms;

import java.util.*;

public class AddAllPRogram {
    public static void main(String[] args) {
        // Creating an empty LinkedList
        LinkedList<String> l = new LinkedList<String>();

        // Use add() method to add elements in the list
        l.add("Sai");
        l.add("Sandeep");
        l.add("Krishna");
        l.add("Venkata");
        l.add("sidhhu");

        // A collection is created
        Collection<String> list = new ArrayList<String>();
        list.add("Sai Sandeep");
        list.add("Karthik");
        list.add("Chandra");
        list.add("Answini");
        list.add("Kalyani");

        // Displaying the list
        System.out.println("The LinkedList is: " + l);

        // Appending the collection to the list
        l.addAll(list);

        System.out.println("The new linked list is: " + l);
    }
}
