package HashMapPrograms;

import java.util.*;
import java.util.Map.Entry;

public class GettingKeysAndValuesProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Sandeep");
        hm.put(2, "Answini");
        hm.put(3, "karthik");
        hm.put(4, "chandra");
        hm.put(5, "Kalyani");

        Set<Entry<Integer, String>> st = hm.entrySet();
        
        Iterator<Entry<Integer, String>> i = st.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
