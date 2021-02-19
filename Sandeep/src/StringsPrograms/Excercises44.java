package StringsPrograms;

import java.util.*;

public class Excercises44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            char alpha = s1.charAt(i);
            System.out.print(alpha + " ");
        }

        sc.close();
    }

}
