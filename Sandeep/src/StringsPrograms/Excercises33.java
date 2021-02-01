package StringsPrograms;

import java.util.*;

public class Excercises33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s1 = sc.nextLine();

        // remove white spaces
        System.out.println(s1.replaceAll("\\s", ""));

        sc.close();

    }

}
