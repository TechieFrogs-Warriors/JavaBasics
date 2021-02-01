package StringsPrograms;

import java.util.*;

public class Excercises35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First string :");
        String s1 = sc.nextLine();

        System.out.println("Enter Second string :");
        String s2 = sc.nextLine();

        String s3 = s1 + s1;
        if (s3.contains(s2)) {
            System.out.println("Second String is rotational of the First String");
        } else {
            System.out.println("Second String is not rotational of the First String");
        }
        sc.close();
    }

}
