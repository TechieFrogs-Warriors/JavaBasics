package Array_Concept;

import java.util.Scanner;

public class Program2 
{
    public static void main(String[] args) 
    {
        //program to find frequency of elements of an array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int[] arr=new int[sc.nextInt()];
        //Taking input values one by one from user
        System.out.println("Enter elements into array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //To print all the taken input values
        System.out.println("The array elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();//To print in next line

        //Logic
        int[] freq = new int[arr.length]; 
        for(int i = 0; i <arr.length; i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <arr.length; j++) 
            {  
                if(arr[i] == arr[j]) 
                {  
                    freq[i]++;    
                    arr[j] = '0';  //important to avoid duplication
                }  
            }  
        }  
        System.out.println("Elements and their frequencies");  
        for(int i = 0; i < freq.length; i++) 
        {  
            if(arr[i] != ' ' && arr[i] != '0')  
            System.out.print(arr[i] + "-" + freq[i]+" ");  
        }
        sc.close();  
        
    }
    
}
