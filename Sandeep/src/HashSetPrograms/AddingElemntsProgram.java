package HashSetPrograms;

import java.util.*;

public class AddingElemntsProgram {
    public static void main(String[] args) {
        // Instantiate an object of HashSet
        HashSet<String> h = new HashSet<String>();

        // Elements are added using add() method
        h.add("Sai Sandeep");
        h.add("Krihna");
        h.add("Anuradha");
        h.add("Sai Sandeep");
        h.add(null);

        // Print the contents on the console
        System.out.println("HashSet elements : " + h);

        System.out.println("The size of HashSet is :: " + h.size());
    }
}
