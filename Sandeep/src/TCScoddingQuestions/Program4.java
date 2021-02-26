package TCScoddingQuestions;

import java.util.*;

public class Program4 {
    // string input validation
    public static String inputValidation(Scanner sc) {
        String word;
        do {
            System.out.println("Enter valid String");
            while (!sc.hasNext("[0-9=]*")) {
                System.out.println("Entered string is invalid.Please enter valid String");
                sc.next();
            }
            word = sc.nextLine();

        } while (word.equals(""));
        return word;
    }

    public static int minimumPulses(String A) {

        String word[] = A.split("=");// spliting the string into words by using = symbol using split method
        // now the string is separted into 2 words befor = one word and after = one word
        String w1 = word[0];// word1
        String w2 = word[word.length - 1];// word2

        int num = Integer.parseInt(w1);// converting string to integer
        int num1 = Integer.parseInt(w2);// converting string to integer

        int count = 0, reminder = 0, sum = 0;// intilzing the values
        while (num > 0) {
            reminder = num % 10;// reinder is takes that is last word in the digit

            sum = sum + (reminder);// every time reminder is added to sum

            count++;// count is incremnted as how may times we add

            num = num / 10;// here we are taking the queficient value i.e other than the last digit in a
                           // number

            if (num1 == (sum + num)) {// here we are checking the value with the next number after the =

                System.out.println(count);// if values are eaqal prints count and breaks the loop
                break;

            } else {
                System.out.println(-1);
            }

        }

        return count;// returns the count

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = inputValidation(sc);// input validation for the given input

        minimumPulses(A);
    }

}
