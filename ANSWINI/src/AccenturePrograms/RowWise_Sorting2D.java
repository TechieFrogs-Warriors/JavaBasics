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
        rowSorting(arr); 
        sc.close();
    } 

    //Logic
    public static void rowSorting(int mat[][]) 
    { 
        for (int i=0;i < mat.length;i++) 
        { 
            for (int j=0;j < mat.length;j++) 
            {  
                //sorting loop
                for (int k=0;k < mat.length-j-1;k++)  
                { 
                    if (mat[i][k] > mat[i][k + 1]) 
                    { 
                        // swapping the matrix elements  
                        int temp = mat[i][k]; 
                        mat[i][k] = mat[i][k+1]; 
                        mat[i][k+1] = temp; 
                    } 
                } 
            } 
        } 
        //print the elements after sorting rows
        System.out.println("Matrix elements after sorting rows are : ");
        for (int i=0;i<mat.length;i++) 
        { 
            for (int j=0;j<mat.length;j++)
            {
                System.out.print(mat[i][j] + " "); 
            }
            System.out.println(); 
        } 
    
    } 
    
}
