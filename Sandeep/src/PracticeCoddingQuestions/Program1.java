package PracticeCoddingQuestions;

import java.util.*;

public class Program1 {
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
        } while (number <= 0);
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// obj for the Scanner class

        // intilizing the 1st array
        System.out.println("Enter size of an 1st array :: ");
        int size1 = inputValidation(sc);// validating the input size

        System.out.println("Enter elements in the array :: ");
        int arr1[] = new int[size1];// intilizing the array
        for (int i = 0; i < size1; i++) {
            arr1[i] = inputValidation(sc);// validating the array elemnts entered
        }

        // intilizing the 2 array
        System.out.println("Enter size of 2nd array :: ");
        int size2 = inputValidation(sc);// input validation for the size

        System.out.println("Enetr elents inthe array :: ");
        int arr2[] = new int[size2];// intilizing the array
        for (int i = 0; i < size2; i++) {
            arr2[i] = inputValidation(sc);// input validation for the array elements
        }

        // code for find the insertion of 2 arrays
        System.out.println("Insertion of two arrays is :: ");
        int i = 0, j = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j])// ithe elemnt is less than the jth element
            {
                i++;
            } else if (arr1[i] > arr2[j])// if ith elemnt is greater than the jth element
            {
                j++;
            } else// if ith and th ejth elemnt are equal
            {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

    }

}
