package TreeSetPrograms;

import java.util.*;

public class AddingProgram {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();

        // adding Elements by using add() method
        t.add("Sai Sandeep");
        t.add("Answini");
        t.add("Karthik");
        t.add("Chandra");
        t.add("Karthik");
        t.add("Srikanth");

        System.out.println(t);
    }
}
