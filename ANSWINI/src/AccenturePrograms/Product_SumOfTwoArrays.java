package AccenturePrograms;

import java.util.Scanner;

//program to check product and sum of two arrays of equal length are equal or not
public class Product_SumOfTwoArrays 
{
    public static void main(String[] args) 
    {
        //Taking user input for two array sizes and elements of those arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your two arrays size");
        int[] arr1=new int[sc.nextInt()];//first array
        int[] arr2=new int[sc.nextInt()];//second array
        //Taking first array elements
        System.out.println("Enter elements into first array");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        //Taking second array elements
        System.out.println("Enter elements into second array");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }

        //calling methods that perform logic
        System.out.println("The array elements sum is: ");
        System.out.println(display(arraySum(arr1,arr2)));
        System.out.println("The array elements product is: ");
        System.out.println(display(arrayProduct(arr1,arr2)));

        //checking both arrays for equality
        if(display(arraySum(arr1,arr2))==display(arrayProduct(arr1,arr2)))
        {
            System.out.println("\nBoth arrays are equal");
        }
        else
        System.out.println("\nBoth arrays are not equal");
    
        sc.close();
    
        
    }

    //Displaying Array elements
    public static int[] display(int[] result)
    {
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+" ");
        }
        return result;
    }

    //Adding two arrays
    public static int[] arraySum(int[] first,int[] second)
    {
        int[] resultSum = new int[first.length];
        for(int i=0;i<first.length;i++)
        {
           resultSum[i]=first[i] + second[i];
        }
        return resultSum;
        
    }

    //Multilplying two arrays
    public static int[] arrayProduct(int[] first,int[] second)
    {
        int[] resultProduct = new int[first.length];
        for(int i=0;i<first.length;i++)
        {
            
            resultProduct[i]=first[i] * second[i];
            
        }
        return resultProduct;
        
    }
    
}
