package WiproPrograms;
//program to find sum of all individual element numbers in an array

import java.util.Scanner;

public class SumOf_EachElementNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int arr[]=new int[inputValidation(sc)]; // Initial input array
        int sumArr[] = new int[arr.length]; //Final output array
        //Entering elements into array
        System.out.println("Enter Array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        //Logic method
        individualSumOfNumber(arr, sumArr);
        
        sc.close();
        
    }
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
    //Method for implementing logic
    public static void individualSumOfNumber(int arr[],int sumArr[]) 
    {
        int r=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            while(arr[i] > 0)
            {
                r = arr[i] % 10;
                sum = sum + r;
                arr[i] = arr[i] / 10;

            }
            sumArr[i] = sum;//placing individual number sum into another array

        }
        //printing loop of output with sums of individual array elements 
        for(int a : sumArr)
        {
            System.out.print(a+" ");
        }
        
    }
    
    
}
