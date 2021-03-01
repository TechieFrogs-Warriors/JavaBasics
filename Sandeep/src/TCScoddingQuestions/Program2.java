package TCScoddingQuestions;

import java.util.*;

public class Program2 {
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
        System.out.println("Enter the size :: ");
        int N = inputValidation(sc);// input validation for length

        System.out.println("enetr the elements in array");
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = inputValidation(sc);// intilzing the values into array
        }

        System.out.println("Enetr the value to replace :: ");
        int X = inputValidation(sc);// intilizing the value to replace

        // code for replacing the value in the array
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != X)// if the value in the integer array is eqaul to th erepalce valu then it
                          // repalces
            {
                A[i] = X;// replaces the value
                count++;// count is incremented how may times the value is replaced
            }
        }
        // printing the replace array

        // System.out.println("\n\n");
        // for (int i = 0; i < A.length; i++) {
        // System.out.println(A[i]);
        // }
        System.out.println("Moves to change the value is :: " + count);
    }

}
