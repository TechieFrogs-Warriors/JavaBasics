package PracticeProgramsMaps;

import java.util.*;

public class GettingDupicateWordsInTheString {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

        String s1 = "My name is Sai Sandeep My father name is Prasad";

        String s[] = s1.split(" ");

        for (String str : s) {
            if (lhm.containsKey(str)) {
                lhm.put(str, lhm.get(str) + 1);
            } else {
                lhm.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> i : lhm.entrySet()) {

            if (i.getValue() > 1) {
                System.out.println(i.getKey() + "-" + i.getValue());
            }
        }
    }
}
