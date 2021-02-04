package Array_Concept;

import java.util.Scanner;

public class Program25 
{
    public static void main(String[] args) 
    {
        //program to check whether the matrix is a sparse matrix
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

            //Logic for sparse matrix
            int count=0,size=row*col;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i][j]==0)
                    {
                        count++;
                    }
                }
                
            }
            if(count>size/2)
            {
                System.out.println("The given matrix IS a sparse matrix");
            }
            else
            {
                System.out.println("The given matrix is NOT a sparse matrix");
            }

        }
        sc.close();
        
    }
    
}
