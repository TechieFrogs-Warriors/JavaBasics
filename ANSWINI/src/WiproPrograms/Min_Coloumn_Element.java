package WiproPrograms;

import java.util.Scanner;

public class Min_Coloumn_Element 
{
	public static int number;
	// input validation method
    public static int inputValidation(Scanner sc) 
    {
        do {
            System.out.println("enter  Postive Number: ");
            while (!sc.hasNextInt()) 
			{
                System.out.println("This is not a nuber.Please Enter Positive Number: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }
    //Method to find the minimum element of each coloumn
    public static void mini_Coloumn(int mat[][], int col, int row)
	{
		int i,j;
		for(i = 0; i < row; i++)
		{
			int min = mat[0][i];
			for(j = 1; j < col; j++)
			{	
				if(mat[j][i] < min)
				{
					min = mat[j][i];
				}
			}
			System.out.print(min+" ");
		}	
	}

	public static void main(String[] args)
	{
        //Reading input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of the matrix :");
		int row = inputValidation(sc);
		int col = inputValidation(sc);

		//Input array
		int[][] mat = new int[row][col];

        //Taking input into matrix
		System.out.print("\nEnter the matrix elements : ");
		int i, j;
		for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
            {
                mat[i][j] = sc.nextInt();
            }
			System.out.println();		
		}

        //Printing the matrix
        for(i = 0; i < row; i++)
		{
			for(j = 0; j < col; j++)
            {
                 
                System.out.print(mat[i][j]+" ");
            }
			System.out.println();		
		}

		//Calling Logic method
        System.out.println("Minimum elements of each coloumn of matrix  are: ");
		mini_Coloumn(mat,row,col); 
	}
    
}
