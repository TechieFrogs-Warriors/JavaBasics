package Advanced_Programs;

import java.util.Scanner;

public class Program4 
{
    //Program to Sort an Integer Two Dimensional Array
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of  rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int cols = sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("Enter the Array Elements: ");
                arr[i][j] = sc.nextInt();
            }
        }
        //printing original elements in matrix form
        System.out.println("The original matrix:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
 
        // Sorting the 2D Array 
        int temp=0;
        for(int x=0;x<rows;x++)
        {
            for(int y=0;y<cols;y++)
            {
                for(int i=0;i<rows;i++)
                {
                    for(int j=0;j<cols;j++)
                    {
                        if(arr[i][j]>arr[x][y])
                        {
                            temp = arr[x][y];
                            arr[x][y] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
            }
        }
        
        //printing sorted array elements in matrix form
        System.out.println("The Sorted Array is:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
