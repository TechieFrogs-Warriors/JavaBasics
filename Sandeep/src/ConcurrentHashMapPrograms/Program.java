package ConcurrentHashMapPrograms;

import java.util.concurrent.*;

public class Program {
    public static void main(String[] args) {
        // create an instance of
        // ConcurrentHashMap
        ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();

        // Insert mappings using put method
        m.put(100, "Sai Sandeep");
        m.put(101, "Venkata");
        m.put(102, "Krishna");

        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
        m.putIfAbsent(101, "Sai Sandeep");

        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "Sai Sandeep");

        // Now we can add Hello
        m.putIfAbsent(103, "Sai Sandeep");

        // We cant replace Hello with For
        m.replace(101, "Sai Sandeep", "Sandeep");
        System.out.println(m);
    }
}
