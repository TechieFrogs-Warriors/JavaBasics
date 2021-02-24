package AccenturePrograms;

import java.util.Scanner;
//program to find nth or mth series element from the series
public class Nth_elementOfSeries 
{
    public static int m;
    public static int n;

    public static int inputValidation(Scanner sc) 
    {
        do 
        {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            m = sc.nextInt();
        } while (m <= 0);

        return m;
    }

    public static void main(String[] args) 
    {
        //Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m value : ");
        m = inputValidation(sc);// user input for m
        System.out.println("Enter n value : ");
        n = inputValidation(sc);// user input for n
        System.out.println("Enter array size");
        //Array to store series elements
        int arr[] = new int[2 * inputValidation(sc)];
        int len = arr.length;

        //Logic
        // If array length is greater than the m and n then the loop continue
        if (len >= m && len >= n) 
        {
            series(arr, m);// method that performs logic is called

        } else 
        {
            System.out.println("element index is gretaer than the array size");
        }

    }
    
    //Logic method implementation
    public static void series(int arr[], int m) 
    {

        for (int x = 0; x < arr.length; x++) 
        {
            if (x % 2 == 0) 
            {
                arr[x] = (int) Math.pow(1, m) + x;// odd series formula
                System.out.print(arr[x] + "  ");

            } 
            else 
            {
                arr[x] = (int) Math.pow(1, n) + x;// even series formula
                System.out.print(arr[x] + "  ");
            }
        }

        System.out.println("\n\nmth element in odd series :: " + arr[m]);// printing the mth value in series

        System.out.println("\nnth element in even series :: " + arr[n]);// printing the nth value in series

    }

}
