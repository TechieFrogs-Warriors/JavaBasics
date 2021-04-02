package HashSetPrograms;

import java.util.*;

public class ReadonlyProgram {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        h.add("Sai");
        h.add("Sandeep");
        h.add("Krishna");
        h.add("Maddipati");

        // by default HashSet is mutable
        // we can make HashSet as read-only by using collections.unmodifiableSet()
        Set<String> modf = Collections.unmodifiableSet(h);
        modf.add("Venkata");

        // throws an exception i.e Collections$UnmodifiableCollection
        System.out.println(modf);
    }

}
