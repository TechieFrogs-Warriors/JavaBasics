package StringsPrograms;

import java.util.*;

public class Excercises38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        char[] str = s1.toCharArray();

        System.out.println("Dublicate of charcter values are---");
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {
                if (str[i] == str[j]) {
                    System.out.println(str[j]);
                    break;
                    

                }
            }
        }
        sc.close();
    }

}
