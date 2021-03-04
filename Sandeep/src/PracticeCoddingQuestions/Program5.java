package PracticeCoddingQuestions;

import java.util.*;

public class Program5 {
    public static String inputValidationS(Scanner sc) {
        String word;
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            word = sc.nextLine();
        } while (word.equals(""));
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr String :: ");
        String scentance = inputValidationS(sc);

        // converting string ito char array
        char ch[] = scentance.toCharArray();

        // intilizing the new array to store the revrse data
        char arr[] = new char[ch.length];

        // first we store the spases in the array
        for (int i = 0; i < arr.length; i++) {
            if (ch[i] == ' ') {
                arr[i] = ' ';
            }
        }

        // intilizing the j value with the array length
        int j = arr.length - 1;

        // now we store the non space values to the array
        for (int i = 0; i < arr.length; i++) {
            if (ch[i] != ' ') {
                // if reault arry has a space value index value then that postion is skiped
                if (arr[j] == ' ') {
                    j--;
                }
                arr[j] = ch[i];
                j--;
            }
        }
        // displaying the reverse elemnts
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
