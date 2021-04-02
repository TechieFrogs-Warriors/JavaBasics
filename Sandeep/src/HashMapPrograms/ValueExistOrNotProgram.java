package HashMapPrograms;

import java.util.*;

public class ValueExistOrNotProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Sandeep");
        hm.put(2, "Answini");
        hm.put(3, "karthik");
        hm.put(4, "chandra");
        hm.put(5, "Kalyani");

        String vl = "chandra";
        boolean flag = hm.containsValue(vl);
        if (flag) {
            System.out.println("value exist");
        } else {
            System.out.println("value does not exist");
        }
    }
}
