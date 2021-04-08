package InterViewCoddingQuestions;

import java.util.*;

public class CheckIfStringHasAllUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :: ");
        String word = sc.nextLine();

        System.out.println(word + "Has all Unique values :: " + HasUniqueValues(word));

        sc.close();
    }

    public static boolean HasUniqueValues(String word) {
        HashSet hs = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!hs.add(ch)) {// if hash set add() eturn false when the elelent is allredy exists
                return false;
            }
        }
        return true;
    }
}
