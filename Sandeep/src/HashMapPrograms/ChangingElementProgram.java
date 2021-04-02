package HashMapPrograms;

import java.util.*;

public class ChangingElementProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Change Value using put method
        hm.put(1, "Sandeep");
        hm.put(2, "Answini");
        hm.put(3, "karthik");
        hm.put(4, "chandra");
        hm.put(5, "Kalyani");

        System.out.println("Initial Map is :: " + hm);

        hm.put(1, "Sai Sandeep");

        System.out.println("Updated Map :: " + hm);
    }
}
