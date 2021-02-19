package StringsPrograms;

import java.util.*;

public class Excercises39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();
        String str[] = s1.split(" ");

        System.out.println("Dublicate of Words are---");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println(str[j]);
                    break;
                }
            }
        }
        sc.close();
    }

}
