package PracticeProgramsMaps;

import java.util.*;

public class MostRepatedCharcterInTheSTring {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

        String s = "Sai Sandeep";

        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (lhm.containsKey(c)) {
                lhm.put(c, lhm.get(c) + 1);
            } else {
                lhm.put(c, 1);
            }
        }

        char ky = ' ';
        int vl = 0;

        for (Map.Entry<Character, Integer> me : lhm.entrySet()) {

            if (me.getValue() > vl) {
                ky = me.getKey();
                vl = me.getValue();
            }
        }

        System.out.println(ky + "-" + vl);
    }
}
