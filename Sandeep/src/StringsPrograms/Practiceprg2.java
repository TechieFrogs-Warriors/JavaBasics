package StringsPrograms;

import java.util.*;

public class Practiceprg2 {
    public static void main(String[] args) {
        String Uppperalphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Loweralphabets = "abcdefhijklmnopqrstuvwxyz";
        String Numbers = "0123456789";

        String Alphabetnumeric = Uppperalphabets + Loweralphabets + Numbers;

        StringBuilder s1 = new StringBuilder();

        Random obj = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");

        int length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            int index = obj.nextInt(Alphabetnumeric.length());
            char ch = Alphabetnumeric.charAt(index);
            s1.append(ch);
        }

        System.out.println("Randam value is : " + s1);
        sc.close();
    }

}
