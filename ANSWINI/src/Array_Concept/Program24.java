package Array_Concept;

import java.util.Scanner;

public class Program24 
{
    public static void main(String[] args) 
    {
        //program to check identity matrix or not
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
        
            //Logic
            boolean identity = true;
		    for(int i=0;i<arr.length;i++)
		    {
			    for(int j=0;j<arr.length;j++)
			    {
                    if(arr[i][j] != 1 && arr[j][i] != 0) 
                    {
					    identity = false;
					    break;
				    }
			    }
		    }
            if(identity == true) 
            {
			    System.out.println("\nMatrix is an Identity Matrix");
		    }
            else 
            {
			    System.out.println("\nMatrix is Not an Identity Matrix");
            }

        }
        sc.close();
    }
    
}
