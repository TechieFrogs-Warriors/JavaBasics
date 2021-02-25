package WiproPrograms;

import java.util.Scanner;

public class ReverseAtPosition 
{
    public static int size;

    // input validation
    public static int inputValidation(Scanner sc) 
    {
        do 
        {
            System.out.println("Enter  Postive Number: ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }

            size = sc.nextInt();

        } while (size <= 0);

        return size;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        size = inputValidation(sc);// input validation

        // Taking  different numbers as input
        System.out.println("Enter numbers ");
        int[] number = new int[size];
        for (int i = 0; i < size; i++) 
        {
            number[i] = sc.nextInt();
        }
        //Taking range to reverse elements
        System.out.println("Enter starting and ending range of elements you want to reverse");
        int start = sc.nextInt(),end = sc.nextInt();

        // printing original elements
        System.out.println("Original elements are : ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(number[i] + " ");
        }

        //Logic
        System.out.println("\nReverse order of elements in array are ");

        // loop to print the numbers before the start point
        for (int i = 0; i < end; i++) 
        {
            System.out.print(number[i] + " ");
            if (i == (start - 1)) // condition to start rev form the start point
            {
                for (int j = end-1; j >= start; j--) // reverse the values from start to end point
                {
                    System.out.print(number[j] + " ");
                }
                break;// after excuting the values the loop btreaks after the end point no values will be excuted
            }

        }

    }
    
}
