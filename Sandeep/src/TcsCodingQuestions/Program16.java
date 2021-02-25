package TcsCodingQuestions;

import java.util.*;

public class Program16 {
    // input validation for the string
    public static String inputValidation(Scanner sc) {
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
        // taking the input of 3 words and validating them
        String word1 = inputValidation(sc);
        String word2 = inputValidation(sc);
        String word3 = inputValidation(sc);

        word1 = word1.toLowerCase();
        word3 = word3.toUpperCase();

        // converting strings to char array
        char ch1[] = word1.toCharArray();

        char ch2[] = word2.toCharArray();
        char ch3[] = word3.toCharArray();
        // code for replace the charcter by the certan things
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] == 'a' || ch1[i] == 'e' || ch1[i] == 'i' || ch1[i] == 'o' || ch1[i] == 'u') {
                ch1[i] = '%';
            }
            System.out.print(ch1[i]);

        }
        for (int i = 0; i < ch2.length; i++) {
            if (!(ch2[i] == 'a' || ch2[i] == 'e' || ch2[i] == 'i' || ch2[i] == 'o' || ch2[i] == 'u')) {
                ch2[i] = '#';
            }
            System.out.print(ch2[i]);
        }
        for (int i = 0; i < ch3.length; i++) {
            if (ch3[i] >= 'a' && ch3[i] <= 'z') {
                ch3[i] = ' ';
            }
            System.out.print(ch3[i]);
        }

    }
}
