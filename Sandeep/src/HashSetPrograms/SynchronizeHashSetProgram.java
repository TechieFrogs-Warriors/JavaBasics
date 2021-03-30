package HashSetPrograms;

import java.util.*;

public class SynchronizeHashSetProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Sai");
        h.add("Sandeep");
        h.add("Krishna");
        h.add("Maddipati");

        // by default HashSet is not synchronized.
        // we can synchronize HashSet by using collectyions.synchronizedSet()
        Set<String> synst = Collections.synchronizedSet(h);
        System.out.println(synst);
    }
}
