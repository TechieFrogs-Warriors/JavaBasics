package LinkedListPrograms;

import java.util.*;

/*remove(Object): This method is used to simply remove an object from the LinkedList. If there are multiple such objects, then the first occurrence of the object is removed.
remove(int index): Since a LinkedList is indexed, this method takes an integer value which simply removes the element present at that specific index in the LinkedList.
 After removing the element, all the elements are moved to the left to fill the space and the indices of the objects are updated.
*/
public class RemovingElementProgram {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();

        l.add("Sai sandeep");
        l.add("answini");
        l.add(1, "Kalyani");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Sai sandeep");
        l.add(null);

        System.out.println("Initial LinkedList ");
        l.forEach(System.out::println);

        l.remove(0);

        System.out.println("\nAfter the Index Removal ");
        l.forEach(System.out::println);

        l.remove("sai");

        System.out.println("\nAfter the Object Removal ");
        l.forEach(System.out::println);
    }
}
