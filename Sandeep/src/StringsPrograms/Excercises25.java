package StringsPrograms;

import java.util.*;

public class Excercises25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
                    || s1.charAt(i) == 'u') {
                vowels++;
            } else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {
                consonants++;
            }
        }
        System.out.println("vowels Count : " + vowels);
        System.out.println("consonants count : " + consonants);

        sc.close();

    }

}
