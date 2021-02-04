package StringsPrograms;

import java.util.*;

public class Excercises18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();
        for (char alpha : s1.toCharArray()) {
            System.out.print(alpha + " ");
        }

        sc.close();

    }

}
