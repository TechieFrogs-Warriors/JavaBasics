package PracticeCoddingQuestions;

import java.util.*;
/*
Algorithm: 
Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
Create a variable sum to store the sum of array elements.
Traverse the array from start to end.
Update the value of sum as sum = sum + array[i]
Print the missing number as sumtotal – sum
*/

public class Program7 {
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

        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;// formula for calculating sum of natural numbers

        for (int i = 0; i < arr.length; i++) {
            total -= arr[i];
        }
        System.out.println("Missing number is :: " + total);

    }
}
