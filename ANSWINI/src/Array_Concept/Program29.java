package Array_Concept;

import java.util.Scanner;

public class Program29 
{
    public static void main(String[] args) 
    {
        //program to check even and odd element frequencies in the matrix
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

            //Logic for checking even and odd element frequencies in the  matrix
            int even_Count=0,odd_Count=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i][j]%2==0)
                    {
                        even_Count++;
                    }
                    else
                    {
                        odd_Count++;
                    }
                }
                
            }
            System.out.println("The EVEN element frequency in the matrix is: "+even_Count);
            System.out.println("The ODD element frequency in the matrix is: "+odd_Count);

        }

        sc.close();
        
    }
    
}
