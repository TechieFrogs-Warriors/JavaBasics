package WiproPrograms;

import java.util.*;

public class Program1 {
    public static String str;

    // input validation method
    public static String inputValidation(Scanner sc) {
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            str = sc.nextLine();
        } while (str.equals(""));
        System.out.println("Enter  String Is valid ");
        sc.close();

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the old password : ");

        String s1 = inputValidation(sc);// validating the input
        StringBuffer obj = new StringBuffer(s1);// creating a objects using string buffer

        for (int i = 0; i < s1.length(); i++) {// for to iterate every chharater
            if (Character.isLowerCase(s1.charAt(i))) {// if lower case charter then thie condition is executed
                obj.setCharAt(i, Character.toUpperCase(s1.charAt(i)));// every lower cases is converted to upper case
                                                                      // caracter
            } else if (Character.isUpperCase(s1.charAt(i))) {// if uper case this condition is excuted
                obj.setCharAt(i, Character.toLowerCase(s1.charAt(i)));// every upper case is converted to lower case
                                                                      // charcter
            }

        }
        System.out.println("New Password is  : " + obj);// prining the final output

        sc.close();
    }

}
