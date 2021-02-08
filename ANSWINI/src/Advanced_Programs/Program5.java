package Advanced_Programs;

import java.util.Scanner;

public class Program5 
{
    //Program to Sort any one coloumn of matrix using Two Dimensional Array
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

        //Sorting any one coloumn logic
        System.out.println("Enter which column you want to sort within your matrix index size");
        int col_index=sc.nextInt();
        int col_index_len=col_index+1;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = col_index; j < col_index_len; j++)
            {
                for (int k = 0; k < rows; k++) 
                {
                    for (int l = col_index; l < col_index_len; l++) 
                    {
                        if (arr[i][j] < arr[k][l]) 
                        {
                            int temp = arr[k][l];
                            arr[k][l] = arr[i][j];
                            arr[i][j] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("\n--- Matrix after sorting ---");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr.length; j++) 
            {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        sc.close();
    }
}
