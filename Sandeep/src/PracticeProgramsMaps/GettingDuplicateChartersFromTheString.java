package PracticeProgramsMaps;

import java.util.*;

public class GettingDuplicateChartersFromTheString {
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

        for (Map.Entry<Character, Integer> me : lhm.entrySet()) {

            if (me.getValue() > 1) {
                System.out.println(me.getKey() + "-" + me.getValue());
            }
        }
    }
}
