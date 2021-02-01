package StringsPrograms;

import java.util.*;

public class Excercises2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s2 = sc.nextLine();
        String s1 = s2.toLowerCase();
        String[] str = s1.split(" ");

        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {// because campareTO will returm -1 0 1
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("lexicographic order : ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        sc.close();
    }

}
