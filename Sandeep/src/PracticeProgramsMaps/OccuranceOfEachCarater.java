package PracticeProgramsMaps;

import java.util.*;

public class OccuranceOfEachCarater {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();

        String s = "Sai Sandeep";

        // converting string to array
        char[] ch = s.toCharArray();

        // using the for loop we are travresing through the array
        for (char c : ch) {

            // now checking the caharter varible is avilabe in the map or not
            // if not avilable allocating the memory
            // if variable avilable then increments the count

            if (lhm.containsKey(c)) {
                lhm.put(c, lhm.get(c) + 1);
            } else {
                lhm.put(c, 1);
            }
        }
        System.out.println(lhm);
    }
}
