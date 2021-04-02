package HashMapPrograms;

import java.util.*;

public class KeyExistOrNotProgram {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Sandeep");
        hm.put(2, "Answini");
        hm.put(3, "karthik");
        hm.put(4, "chandra");
        hm.put(5, "Kalyani");

        int ky = 3;
        boolean flag = hm.containsKey(ky);
        if (flag) {
            System.out.println("key exist");
        } else {
            System.out.println("key does not exist");
        }
    }
}
