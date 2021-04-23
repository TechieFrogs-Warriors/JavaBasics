package InterViewCoddingQuestions;

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // intilizing the use input
        String s = sc.nextLine();
        System.out.println("The String is :: " + s);

        String rev = "";// intilizing the varible to store the reverse string

        char[] ch = s.toCharArray();// converting string to char array

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println("Reverse of a given String is :: " + rev);

        sc.close();
    }
}
