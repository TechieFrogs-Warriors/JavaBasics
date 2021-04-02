package LinkedHashMapPrograms;

import java.util.*;

public class AddingProgram {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

        lhm.put(1, "Sandeep");
        lhm.put(2, "Answini");
        lhm.put(3, "karthik");
        lhm.put(4, "chandra");
        lhm.put(5, "Kalyani");

        lhm.remove(1);
        System.out.println(lhm.toString());
    }
}
