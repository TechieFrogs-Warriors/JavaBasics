package TCScoddingQuestions;

import java.util.*;

public class Program3 {
    // method for input validation
    public static int inputValidation(Scanner sc) {
        int number;
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number < 0);

        return number;
    }

    // String validation
    public static String inputValidationS(Scanner sc) {

        String s;
        do {
            // System.out.println("Enter string ");
            while (!sc.hasNext("[0-9]*")) {
                System.out.println("Its not valid string.Enter again");
                sc.next();
            }
            s = sc.nextLine();

        } while (s.equals(""));
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the leng the string must be :: ");
        int n = inputValidation(sc);// input validation

        System.out.println("Enter string");
        String c = inputValidationS(sc);// input validation

        System.out.println(TOR(n, c));// calling method

    }

    public static String TOR(int n, String c) {
        // converting string to integer value
        int number = Integer.parseInt(c);

        int temp = number;

        int remainder = 0; // intilizing the reminder varaible

        String str = ""; // intiling the vsribsle s

        // code for calculating the trnary number
        while (temp != 0) {
            remainder = temp % 3; // getting remainder

            str = str.concat(Integer.toString(remainder)); // converting from integer and placing remainder in string

            temp = temp / 3; // getting quotient

        }

        // reversing the achived string of digits

        String s1 = "", s2 = "";// intilizing the two variables s1 and s2

        // intially ternary values are stored in a reverse order so to gain the orginal
        // oder agin performing the reverse operation
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            s1 = s1 + ch;
        }

        // getting the requred field or dight based on the taken length
        for (int i = s1.length() - n; i <= s1.length() - 1; i++) {
            char ch = s1.charAt(i);
            s2 = s2 + ch;
        }

        return s2; // returning output
    }

}
