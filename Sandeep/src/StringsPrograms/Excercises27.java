package StringsPrograms;

import java.util.*;

public class Excercises27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();

        System.out.println("Enter number to divide the string into parts : ");
        int n = sc.nextInt();

        int length = s1.length();
        int n1 = length / n;
        String s;
        if (length % n == 0) {
            for (int i = 0; i < n; i++) {
                s = " ";
                for (int j = i * n1; j < n1 * (i + 1); j++) {
                    s = s + s1.charAt(j);
                }
                System.out.println(s);
            }
        } else {
            System.out.println("String cannot be splited ito equal parts");
        }
        sc.close();

    }

}
