package WiproPrograms;

import java.util.*;

public class  Diff_LargeSum_SecondLargeSum
{

    public static int size;

    // input validation
    
    public static int inputValidation(Scanner sc) 
    {
        do 
        {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("This is not a number.Please Enter Positive Number: ");
                sc.next();
            }
            size = sc.nextInt();
        } while (size <= 0);

        return size;
    }

    // Method for finding large digit in a number
    public static int large(int num) 
    {
        int large = 0;
        while (num != 0) 
        {
            int remainder = num % 10;// returned reminder i.e last digit in a number
            large = Math.max(remainder, large);// finds the largest value
            num = num / 10;// returns quefient i.e gives the number except last digit

        }
        // System.out.println(large);
        return large;

    }
    //Method to find second large digit in a number
    public static int secondL(int num) 
    {
        int remainder = 0, Largest = 0;
        int secondL = 0;
        while (num != 0) 
        {
            remainder = num % 10;
            if (Largest < remainder) 
            {
                secondL = Largest;
                Largest = remainder;
            } 
            else if (remainder >= secondL)
            {
                secondL = remainder;
            }
               
            num = num / 10;
        }
        return secondL;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        size = inputValidation(sc);// input validation
        System.out.println("Enter three 4-digit numbers ");

        int[] number = new int[size];
        // Taking elements into array from user
        for (int i = 0; i < size; i++) 
        {
            number[i] = sc.nextInt();
        }

        int arr[] = new int[size];
        arr = number.clone();//cloning/copying the number array to 'arr'

        // checking every digit to find the largest digit in the number
        for (int i = 0; i < size; i++) 
        {
            number[i] = large(number[i]);
            arr[i] = secondL(arr[i]);
        }
        //Adding first and second Largest numbers individually
        int result = 0,result2 = 0;
        for (int i = 0; i < size; i++) 
        {
            result += number[i];
            result2 += arr[i];
        }
        System.out.println("sum of 1st & 2nd largest values : " + result+" "+result2);


        //Finding the difference between first largesum and second largesum
        int diff = result - result2;//formula from question
        System.out.println("The difference between first largesum and second largesum is: "+diff);

    }

}
