package Wipro_AdvancedPrograms2;

import java.util.Scanner;

import TCS_Programs.Validation;

public class NextLargerElement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Taking length of an array
        System.out.println("Enter Array size: ");
        int N = Validation.integerValidation(sc);

        //create an array
        int[] myArray = new int[N];
        //insert values to an array
        System.out.println("Enter values to an array");
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i] = sc.nextInt();
        }
        
        //calling logic method
        int result[]=nextLargeElement(myArray, N);

        //print the array
        for(int i=0;i<myArray.length;i++)
        {
            if(result[i]==0)
            {
                System.out.print ("-1"+" ");//if array conatin 0 it prints -1
            }
            else
            {
                System.out.print(result[i]+" ");
            }
        }

        sc.close();
    }
    //Logic method to find next larger element
    public static int[] nextLargeElement(int arr[],int N)
    {
        //logic to find next large element
        int result[] = new int[N];
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    result[i] =arr[j]; //it stores only 1st occured large value
                    break;
                }
            }
            
        }
        return result;
    }

}
