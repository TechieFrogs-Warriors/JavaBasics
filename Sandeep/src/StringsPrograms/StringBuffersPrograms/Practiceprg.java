package StringsPrograms.StringBuffersPrograms;

import java.util.*;

public class Practiceprg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data : ");
        String s2 = sc.nextLine();
        String s1 = s2.toLowerCase();
        String str[] = s1.split(" ");
        for (int i = 0; i < str.length; i++)// 1 sandeep 2 chandra
        {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Sorted ordre ---- ");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        sc.close();
    }

}
