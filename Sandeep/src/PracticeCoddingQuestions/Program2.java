package PracticeCoddingQuestions;

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
        Scanner sc = new Scanner(System.in);// obj for Scanner class

        // intilizinh the array size
        System.out.println("Enter size of the array :: ");// intilizing the size
        int size = inputValidation(sc);// validating the input size

        // intilizing the elemnts in the array
        System.out.println("Enter elemnts in the array :: ");
        int arr[] = new int[size];// intilizingteh array
        for (int i = 0; i < size; i++) {
            arr[i] = inputValidation(sc);// validating the elemnts
        }

        // code for the separate zeros from non-zeros
        int j = 0;// intilizing the value j

        for (int i = 0; i < size; i++)// traversing the array elements
        {
            if (arr[i] != 0)// finding th enon zero values
            {
                arr[j] = arr[i];// storing the non zero values to the 1st of the array
                j++;
            }
        }

        while (j < arr.length)// itterates till the j and the lenth are equal
        {
            arr[j] = 0;// assiging th ezero values at the last of the array
            j++;
        }

        // printing the array
        System.out.println("the separate zeros from non-zeros are :: ");
        System.out.println(Arrays.toString(arr));
    }

}
