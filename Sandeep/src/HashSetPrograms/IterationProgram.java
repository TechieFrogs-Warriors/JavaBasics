package HashSetPrograms;

import java.util.*;

public class IterationProgram {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> h = new HashSet();
        h.add("Sai Sandeep");
        h.add("Answini");
        h.add("Karthik");
        h.add("Kalyani");
        h.add("chandra");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
