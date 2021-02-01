package StringsPrograms;

import java.util.*;

public class Excercises15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        String s1 = sc.nextLine();
        String line = " ";
        Scanner sc1 = new Scanner(s1);
        while (sc1.hasNext()) {
            String word = sc1.next();
            line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

        }
        System.out.println(line);

        sc.close();
        sc1.close();

    }

}
