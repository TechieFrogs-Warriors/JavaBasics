package LinkedHashSetPrograms;

import java.util.*;

public class AddProgram {
    public static void main(String[] args) {
        // create an instance of LinkedHashSet
        LinkedHashSet<String> h = new LinkedHashSet<String>();

        // Elements are added using add() method
        // insertion order is maintained by defalut it is asceneding order
        h.add("Geek");
        h.add("For");
        h.add("Geeks");

        System.out.println("LinkedHashSet : " + h);
    }
}
