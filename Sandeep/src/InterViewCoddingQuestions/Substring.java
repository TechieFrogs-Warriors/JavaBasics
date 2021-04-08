package InterViewCoddingQuestions;

import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :: ");
        String word = sc.nextLine();

        System.out.println("The substrings Of given string is :: ");

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i, j));
            }
        }
    }
}
