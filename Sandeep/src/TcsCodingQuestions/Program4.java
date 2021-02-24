package TcsCodingQuestions;

import java.util.*;

public class Program4 {
    // validation method String
    public static String inputValidationS(Scanner sc) {
        String str;
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[A-Za-z]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            str = sc.nextLine();
        } while (str.equals(""));

        return str;

    }

    // method for integer input validation
    public static int inputValidationI(Scanner sc) {
        int number;
        do {
            // System.out.println("enter Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        // Reading user input and validating it
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Plain text :: ");
        String originalText = inputValidationS(sc);

        originalText = originalText.replace(" ", "");// deleting the spaces if any becasue according the output spaces
                                                     // should not be there

        System.out.println("Enter the key to encrypt the plain text ");
        int key = inputValidationI(sc);

        // converting prginal text into char array
        char[] encrptText = originalText.toCharArray();

        // using the key encrypting each character by using key
        for (int i = 0; i < encrptText.length; i++) {// loop literates till the end of the character
            encrptText[i] = (char) (encrptText[i] + 1);// to every character one is added and the charcter is
                                                       // incremented
                                                       // by 1
        }

        // converting char array to string again
        String encryptedText = new String(encrptText);// converting charArray to string

        System.out.println(encryptedText);
    }

}
