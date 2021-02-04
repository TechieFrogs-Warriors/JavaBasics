package StringsPrograms;

import java.util.*;

public class Excercises34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s1 = sc.nextLine();
        StringBuffer obj = new StringBuffer(s1);
        obj.reverse();
        String res = obj.toString();
        if (s1.equals(res)) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }
        sc.close();
    }

}
