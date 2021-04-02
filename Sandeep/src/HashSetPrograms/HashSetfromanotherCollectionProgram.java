package HashSetPrograms;

import java.util.*;

public class HashSetfromanotherCollectionProgram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Sai sandeep");
        list.add("Answini");
        list.add("Karthik");
        list.add("Karthik");

        HashSet<String> h = new HashSet(list);
        h.add("Kalyani");
        h.add("Chandra");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
