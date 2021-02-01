package StringsPrograms;

import java.util.*;

public class Excercises41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s2 = sc.nextLine();

        String s1 = s2.toLowerCase();

        String[] words = s1.split(" ");
        int samll = Integer.MAX_VALUE;
        int large = 0;
        String samllword = "";
        String largeword = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = word.length();
            if (length > large) {
                large = length;
                largeword = word;
            }
            if (length < samll) {
                samll = length;
                samllword = word;
            }
        }
        System.out.println("Small word is : " + samllword);
        System.out.println("Large word is : " + largeword);

        sc.close();
    }
}
