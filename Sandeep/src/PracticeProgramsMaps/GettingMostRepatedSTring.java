package PracticeProgramsMaps;

import java.util.*;

public class GettingMostRepatedSTring {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        String s1 = "My name is Sandeep Sai Sandeep My father name is Prasad Sandeep";

        String s[] = s1.split(" ");

        for (String str : s) {
            if (lhm.containsKey(str)) {
                lhm.put(str, lhm.get(str) + 1);
            } else {
                lhm.put(str, 1);
            }
        }

        String ky = " ";
        int vl = 0;

        for (Map.Entry<String, Integer> i : lhm.entrySet()) {

            if (i.getValue() > vl) {
                ky = i.getKey();
                vl = i.getValue();
            }
        }

        System.out.println(ky + "-" + vl);
    }

}
