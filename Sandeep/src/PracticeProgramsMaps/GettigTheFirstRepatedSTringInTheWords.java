package PracticeProgramsMaps;

import java.util.*;

public class GettigTheFirstRepatedSTringInTheWords {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lmp = new LinkedHashMap<String, Integer>();

        String s1 = "My name is Sai Sandeep My father name is Prasad";

        String s[] = s1.split(" ");

        for (String str : s) {
            if (lmp.containsKey(str)) {
                lmp.put(str, lmp.get(str) + 1);
            } else {
                lmp.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> i : lmp.entrySet()) {

            if (i.getValue() > 1) {
                System.out.println(i.getKey() + "-" + i.getValue());
                break;
            }
        }
    }
}
