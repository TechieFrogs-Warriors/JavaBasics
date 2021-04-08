package InterViewCoddingQuestions;

import java.util.*;

public class FirstRepatingElementInTheArray {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> lmp = new LinkedHashMap<Character, Integer>();

        String s = "Sai Sandeep";

        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (lmp.containsKey(c)) {
                lmp.put(c, lmp.get(c) + 1);
            } else {
                lmp.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> me : lmp.entrySet()) {

            if (me.getValue() > 1) {
                System.out.println(me.getKey() + "-" + me.getValue());
                break;
            }
        }
    }
}
