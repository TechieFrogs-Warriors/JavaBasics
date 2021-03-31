package LinkedHashSetPrograms;

import java.util.*;

public class FailFastPRogram {
    public static void main(String[] args) {
        LinkedHashSet<String> l = new LinkedHashSet<String>();

        l.add("Sai Sandeep");
        l.add("Answini");
        l.add("Karthik");
        l.add("Chandra");
        l.add("Karthik");
        l.add("Srikanth");
        Iterator<String> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            l.add("Sai");
        }
    }
}
