package HashSetPrograms;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class CoppyArraySetProgram {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> h = new CopyOnWriteArraySet<String>();

        h.add("Sai");
        h.add("Sandeep");
        h.add("Krishna");
        h.add("Maddipati");

        // iterator in HashSet is fail-fast
        // this CopyOnWriteArraySet will ignore exception
        // ConcurrentModificationException

        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            String str = i.next();
            System.out.println(str);
            h.add("Venkata");
        }
    }
}
