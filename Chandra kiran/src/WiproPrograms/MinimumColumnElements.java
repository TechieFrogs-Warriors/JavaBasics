package WiproPrograms;

import java.util.Scanner;

public class MinimumColumnElements 
{
    
    public static void minimumColoumn(int mat[][], int m, int n)
    {
        int i,j;
        for(i = 0; i < n; i++)
        {
            int min = mat[0][i];//first element of column is stored into min
            for(j = 1; j < m; j++)
            {   
                if(mat[j][i] < min)//checks the column elements
                {
                    min = mat[j][i];//gives the minimum value
                }
            }
            System.out.print(min+" ");
        }   
    }

    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
       int row = InputValidation(scan);
       int col = InputValidation(scan);

        int mat[][] = new int[row][col];

        System.out.println("Enter the matrix elements ");
        int i, j;
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                mat[i][j] = scan.nextInt();//takes the input into matrix
            }
            System.out.println();       
        }

        
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                 
                System.out.print(mat[i][j]+" ");//prints the matrix
            }
            System.out.println();       
        }
        System.out.println("Minimum elements of each coloumn are: ");
        minimumColoumn(mat,row,col); //Method calling
    }
    public static int InputValidation(Scanner scan)
    {
        int n;
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            n=scan.nextInt();
        }while(n<=0);
        return n;
    }
    
}

    


