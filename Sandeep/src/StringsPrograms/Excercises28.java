package StringsPrograms;

import java.util.*;

public class Excercises28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();

        System.out.println("Subsets of given String are--");
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i; j < s1.length(); j++) {
                System.out.println(s1.substring(i, j + 1));
            }
        }
        sc.close();

    }

}
