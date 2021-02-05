package Array_Concept;

import java.util.Scanner;

public class Program39 
{
    public static void main(String[] args) 
    {
        //program to check if array contains any element
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int[] arr=new int[sc.nextInt()];
        System.out.println("Enter elements into Array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element to search in the array");
        int search=sc.nextInt();

        //Logic
        boolean contain=false;
        for(int i:arr)
        {
            if(i==search)
            {
                contain=true;
                break;
            }
        }
        //To print input array elements
        System.out.println("Array elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //To print output
        System.out.println("\nDoes the array contains "+ search+" in it ? : "+contain);
        sc.close();
    }
    
}
