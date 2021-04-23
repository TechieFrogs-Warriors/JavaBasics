package ConcurrentHashMapPrograms;

import java.util.concurrent.*;

public class AccessingTheElements {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();

        // insert mappings using put method
        chm.put(100, "Sai");
        chm.put(101, "Sandeep");
        chm.put(102, "Krishna");
        chm.put(103, "Venkata");

        // Displaying the HashMap
        System.out.println("The Mappings are: ");
        System.out.println(chm);

        // Display the value of 100
        System.out.println("The Value associated to " + "100 is : " + chm.get(100));

        // Getting the value of 103
        System.out.println("The Value associated to " + "103 is : " + chm.get(103));
    }
}
