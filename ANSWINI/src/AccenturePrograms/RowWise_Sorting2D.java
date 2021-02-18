package AccenturePrograms;

import java.util.Scanner;
//program to sort rows of 2D array
public class RowWise_Sorting2D 
{
    public static void main(String args[]) 
    { 
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
             
        }
        //calling method that sort rows of 2D array elements
        sortRowWise(arr); 
        sc.close();
    } 

    //Logic
    public static int sortRowWise(int mat[][]) 
    { 
        // loop for rows of matrix 
        for (int i=0;i < mat.length;i++) 
        { 
            // loop for column of matrix 
            for (int j=0;j < mat[i].length;j++) 
            { 
                // loop for comparison and swapping 
                for (int k=0;k < mat[i].length-j-1;k++) 
                { 
                    if (mat[i][k] > mat[i][k + 1]) 
                    { 
                        // swapping of elements 
                        int temp = mat[i][k]; 
                        mat[i][k] = mat[i][k+1]; 
                        mat[i][k+1] = temp; 
                    } 
                } 
            } 
        } 
  
        // printing the Row sorted matrix 
        System.out.println("Row sorted matrix elements are: ");
        for (int i = 0; i < mat.length; i++) 
        { 
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " "); 
            }
            System.out.println(); 
        } 
        return 0; 
    } 
  
    
    
}
