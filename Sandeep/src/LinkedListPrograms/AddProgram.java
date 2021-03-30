package LinkedListPrograms;

import java.util.*;

/*
add(Object): This method is used to add an element at the end of the LinkedList.
add(int index, Object): This method is used to add an element 
at a specific index in the LinkedList.
*/
public class AddProgram {
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

        l.forEach(System.out::println);
    }
}
