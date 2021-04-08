package ConcurrentHashMapPrograms;

import java.util.concurrent.*;
import java.util.*;

public class TraversingProgram {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();

        // Add elements using put()
        chm.put(8, "Sai");
        chm.put(6, "Sandeep");
        chm.put(3, "Krishna");
        chm.put(11, "Venkat");

        // Create an Iterator over the
        // ConcurrentHashMap
        Iterator<ConcurrentHashMap.Entry<Integer, String>> itr = chm.entrySet().iterator();

        // The hasNext() method is used to check if there is
        // a next element The next() method is used to
        // retrieve the next element
        while (itr.hasNext()) {
            ConcurrentHashMap.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
