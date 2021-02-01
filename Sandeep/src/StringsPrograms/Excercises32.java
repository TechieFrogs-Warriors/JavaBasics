package StringsPrograms;

import java.util.*;

public class Excercises32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        String s1 = sc.nextLine();
        StringBuffer obj = new StringBuffer(s1);
        //StringBuffer s2=new StringBuffer(obj);
        

        for (int i = 0; i < s1.length(); i++) {
            if (Character.isLowerCase(s1.charAt(i))) {
                obj.setCharAt(i, Character.toUpperCase(s1.charAt(i)));
            } else if (Character.isUpperCase(s1.charAt(i))) {
                obj.setCharAt(i, Character.toLowerCase(s1.charAt(i)));
            }

        }
        System.out.println("Data : " + obj);

    }

}
