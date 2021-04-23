package InterViewCoddingQuestions;

import java.util.*;

public class LengthOfStringWithOutInbultMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :: ");
        String word = sc.nextLine();

        int length = 0;// counter vat=raible to find the length

        char[] ch = word.toCharArray();

        for (char c : ch) {
            length++;
        }
        System.out.println("The length of given String is :: " + length);

    }
}
