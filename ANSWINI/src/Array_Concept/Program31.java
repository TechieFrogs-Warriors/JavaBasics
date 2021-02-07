package Array_Concept;

import java.util.Scanner;

public class Program31 
{
    public static void main(String[] args) 
    {
        //program to find sum of each row and coloumn in the matrix
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

            //Logic to find sum of rows and sum of coloumn elements in the  matrix
            for(int i=0;i<arr.length;i++)
            {
                int row_sum=0,col_sum=0;
                for(int j=0;j<arr.length;j++)
                {
                    row_sum+=arr[i][j];//sum of rows
                    col_sum+=arr[j][i];//sum of coloumns
                }

                System.out.println("The row sum of "+(i+1)+ " row in the matrix is: "+row_sum);
                System.out.println("The row sum of "+(i+1)+ " coloumn in the matrix is: "+col_sum);
            }
        }
        sc.close();
        
    }
    
}
