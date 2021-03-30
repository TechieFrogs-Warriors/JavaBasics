package HashSetPrograms;

import java.util.*;

public class CloneProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Sai");
        h.add("Sandeep");
        h.add("Maddipati");

        // creating the clone hashset using the clone() method
        Object clone = h.clone();
        System.out.println(clone);
    }
}
