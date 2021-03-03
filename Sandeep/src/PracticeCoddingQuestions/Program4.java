package PracticeCoddingQuestions;

import java.util.*;

public class Program4 {
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
        // intilizinh the array size
        System.out.println("Enter size of the array :: ");// intilizing the size
        int size = inputValidation(sc);// validating the input size

        // intilizing the elemnts in the array
        System.out.println("Enter elemnts in the array :: ");
        int arr[] = new int[size];// intilizingteh array
        for (int i = 0; i < size; i++) {
            arr[i] = inputValidation(sc);// validating the elemnts
        }

        // code for to find leaders in an integer array
        int rightMostElement = arr[size - 1];
        // as all wise the right most element is always ladder
        System.out.print(rightMostElement);

        int max = rightMostElement;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < arr[i])// if thr right value is less than anext next elemnt
            {
                max = arr[i];// assining the vale to the max
                System.out.print(" " + max);
            }
        }

    }

}
