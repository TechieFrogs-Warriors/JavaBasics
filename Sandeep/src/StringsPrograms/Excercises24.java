package StringsPrograms;

import java.util.*;

public class Excercises24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '!' || s1.charAt(i) == ',' || s1.charAt(i) == ';' || s1.charAt(i) == '.'
                    || s1.charAt(i) == ' ' || s1.charAt(i) == '\'' || s1.charAt(i) == '\"' || s1.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println("Count is : " + count);

        sc.close();
    }

}
