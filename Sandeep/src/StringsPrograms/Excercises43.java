package StringsPrograms;

import java.util.*;

public class Excercises43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Data");

        String s1 = sc.nextLine();

        String str[] = s1.split(" ");
        System.out.println("Number of words in a given data is : " + str.length);

        sc.close();
    }

}
