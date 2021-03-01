package WiproPrograms.WiproCooding2;

import java.util.*;

public class Program14 {
    // valiation method for input String
    public static String inputValiadtionS(Scanner sc) {
        String word;
        do {
            System.out.println("Enetr String: ");
            while (!sc.hasNext("[0-9]*")) {
                System.out.println("This is not a string please enter String: ");
                sc.next();
            }
            word = sc.nextLine();
        } while (word.equals(""));
        return word;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number String :: ");
        String number = inputValiadtionS(sc);// validating the input

        int sum = 0;// intilizing the sum variable to add the values

        for (int i = 0; i < number.length(); i++) {
            for (int j = i + 1; j <= number.length(); j++) {
                // fund the sub sets of the number and converts them to integer values and add
                // to get the answer
                sum += Integer.parseInt(number.substring(i, j));
            }
        }
        System.out.println("\n" + sum);
    }

}
