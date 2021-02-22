package WiproPrograms;

import java.util.Scanner;

public class Program13 
{
    public static int size;

    // input validation
    public static int inputValidation(Scanner sc) 
    {
        do {
            System.out.println("enter  Postive Number: ");
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
        size = inputValidation(sc); // validation for user input
        System.out.println("Enter numbers : ");

        int[] num = new int[size];
        // taking elements into array
        for (int i = 0; i < size; i++) 
        {
            num[i] = sc.nextInt();
        }

        System.out.println("Elements in array are: ");
        for (int i = 0; i < size; i++) 
        {
            System.out.print(num[i] + " ");
        }

        //Logic
        System.out.println("Enter the starting range and Ending range: ");
        int range1 = sc.nextInt(), range2 = sc.nextInt();
        System.out.println("\nElements which are not within the range are: ");
        for (int i = 0; i < size; i++) 
        {
            if (num[i] >= range1 && num[i] <= range2) 
            {
                continue;//skips printing that particular element if condition is satisfied
            } 
            else 
            {
                System.out.print(num[i] + " ");
            }
        }

    }
    
}
