package StringsPrograms;

import java.util.Arrays;

public class Excercises26 {
    public static void main(String[] args) {
        String s1 = "Caer";
        String s2 = "Race";

        s1 = s1.toLowerCase();// coverting to lowercase
        s2 = s2.toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("String are not Anagram");
        } else {
            char[] str1 = s1.toCharArray();// converting to char array
            char[] str2 = s2.toCharArray();

            Arrays.sort(str1);// soring the arrays
            Arrays.sort(str2);

            if (Arrays.equals(str1, str2) == true) {
                System.out.println("Strings are Anagram");
            } else {
                System.out.println("Strings are not Anagram");
            }

        }
    }

}
