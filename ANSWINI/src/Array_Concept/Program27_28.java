package Array_Concept;

import java.util.Scanner;

public class Program27_28 
{
    public static void main(String[] args) 
    {
        //program to display lower triangular matrix 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix size");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        //Initially checking whether it's a squared matrix size or not
        if(row!=col)
        {
            System.out.println("This is not a matrix");
        }
        else
        {
            System.out.println("Enter elements into matrix");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("The matrix elements are");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                    
                }
                System.out.println();
            }

            //Logic for lower triangular matrix
            System.out.println("The lower triangular matrix is");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(j>i)
                    {
                        System.out.print("0 ");
                    }
                    else
                    System.out.print(arr[i][j]+" ");
                    
                }
                System.out.println();
            }

            //Logic for upper triangular matrix
            System.out.println("The upper triangular matrix is");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(i>j)
                    {
                        System.out.print("0 ");
                    }
                    else
                    System.out.print(arr[i][j]+" ");
                    
                }
                System.out.println();
            }

        }
        sc.close();
        
    }
    
}
