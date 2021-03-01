package TCScoddingQuestions;

import java.util.*;

public class Program6 {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows :: ");
        int N = inputValidation(sc);// input validation

        System.out.println("Enter colums :: ");
        int M = inputValidation(sc);// input validation

        System.out.println("enter elemnts in 2D array");
        int C[][] = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j] = inputValidation(sc);
            }
        }

    }

}
