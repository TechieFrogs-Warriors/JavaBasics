package WiproPrograms;

import java.util.Scanner;

//program to find count of perfect cube numbers in an array
public class PerfectCube_NumberCount 
{
    public static int number;
	// input validation method
    public static int inputValidation(Scanner sc) 
    {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
			{
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        //input array to take  dimensions depending on size of array
        int arr[] = new int[inputValidation(sc)];
        //Enter dimensions into array
        System.out.println("Enter Array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        //Logic
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            //To find if the number is perfect cube or not
            int num = (int) Math.floor(Math.cbrt(arr[i])) ;//formula
            if(arr[i] == (num * num * num))
            {
                count++;
            }
        }
        System.out.println("number of perfect cubes are: "+count);
        sc.close();
        
    }
}
