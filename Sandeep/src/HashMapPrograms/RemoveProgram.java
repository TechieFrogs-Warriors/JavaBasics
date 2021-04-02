package HashMapPrograms;

import java.util.*;

public class RemoveProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Sandeep");
        hm.put(2, "Answini");
        hm.put(3, "karthik");
        hm.put(4, "chandra");
        hm.put(5, "Kalyani");

        hm.remove(3);
        hm.remove(4, "chandra");
        System.out.println(hm);
    }
}
