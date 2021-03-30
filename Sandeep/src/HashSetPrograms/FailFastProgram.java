package HashSetPrograms;

import java.util.*;

public class FailFastProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Sai");
        h.add("Sandeep");
        h.add("Krishna");
        h.add("Maddipati");

        // iterator in HashSet is fail-fast
        // throws an exception ConcurrentModificationException
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            String e = i.next();
            System.out.println(e);
            h.add("Venkata");
        }
    }
}
