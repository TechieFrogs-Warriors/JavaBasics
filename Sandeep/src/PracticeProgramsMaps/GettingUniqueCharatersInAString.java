package PracticeProgramsMaps;

import java.util.*;

public class GettingUniqueCharatersInAString {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<Character, Integer>();

        String s = "Sai Sandeep";

        char[] ch = s.toCharArray();

        for (char c : ch) {

            if (mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            } else {
                mp.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> me : mp.entrySet()) {

            if (me.getValue() == 1) {
                System.out.println(me.getKey() + "-" + me.getValue());
            }
        }
    }
}
