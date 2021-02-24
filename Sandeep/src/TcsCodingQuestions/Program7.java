package TcsCodingQuestions;

import java.util.*;

public class Program7 {
    // method for integer input validation
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of monkey on the tree :: ");
        int n = inputValidation(sc);

        System.out.println("Enter the number of bananas eaten by a single monkry :: ");
        int k = inputValidation(sc);

        System.out.println("Enter the nuber of peanuts eaten by a single monkey :: ");
        int j = inputValidation(sc);

        System.out.println("Enter the total number of bananas :: ");
        int m = inputValidation(sc);

        System.out.println("Enter the total number of Peanuts :: ");
        int p = inputValidation(sc);

        int eatenbananas = 0, eatenpeanuts = 0;
        if (n <= 0 && k <= 0 || j <= 0 || m <= 0 || p <= 0) {
            System.out.println(" should not be zero");
        } else {
            if (k > 0) {
                eatenbananas = m / k;// number of bannas /number of bannas eaten

            }
            if (j > 0) {
                eatenpeanuts = p / j;// number of peanuts/number of peanuts eaten
            }
            n = n - eatenbananas - eatenpeanuts;// howm many mokeys have eaten the peants and banans
            System.out.println("Total number of monkeys left on the tree are :: " + n);
        }
    }

}
