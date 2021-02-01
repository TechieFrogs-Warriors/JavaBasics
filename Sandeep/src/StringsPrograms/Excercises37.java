package StringsPrograms;

import java.util.*;

public class Excercises37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        StringBuffer s1 = new StringBuffer(sc.nextLine());
        System.out.println(s1.reverse());

        sc.close();

    }
}
