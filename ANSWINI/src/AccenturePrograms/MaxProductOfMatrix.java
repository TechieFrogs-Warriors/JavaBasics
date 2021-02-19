package AccenturePrograms;

import java.util.Scanner;
//program to find max product value of a 2D array
public class MaxProductOfMatrix 
{
    
    public static void main(String args[])
    {
        //Taking user input
        int r1, r2,c1,c2,i,j,k,sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of matrix1");
        r1 = sc.nextInt();
        
        System.out.println("Enter the number columns of matrix 1");
        c1 = sc.nextInt();

        System.out.println("Enter the number of rows of matrix2");
        r2 = sc.nextInt();
        
        System.out.println("Enter the number of columns of matrix 2");
        c2 = sc.nextInt();
        
        if(c1==r2)
        {
            //Declaring arrays
            int mat1[][] = new int[r1][c1]; 
            int mat2[][] = new int[r2][c2]; 
            int res[][] = new int[r1][c2];
            
            //Taking First matrix elements
            System.out.println("Enter the elements of matrix1");
            
            for (i=0;i<r1;i++)
            { 
            
                for (j=0;j<c1;j++)
                {
                    mat1[i][j] = sc.nextInt();
                }
                
            }
            //Taking second matrix elements
            System.out.println("Enter the elements of matrix2");
            
            for (i=0;i<r2;i++)
            { 
                
                for (j=0;j<c2;j++)
                {
                    mat2[i][j] = sc.nextInt();
                }
                
            }
            //Logic for multiplication of two matrices
            System.out.println("\noutput matrix : ");
            for (i=0;i<r1;i++)
            {
                for (j=0;j<c2;j++)
                {
                    sum=0;
                    for (k=0;k<r2;k++)
                    {
                        sum = sum + mat1[i][k]*mat2[k][j] ;
                    }
                    res[i][j]=sum;
                }
            }
            //printing result matrix after multiplication
            for (i=0;i<r1;i++)
            {
                for (j=0;j<c2;j++)
                {
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
            //finding max product from the result matrix
            int max=res[0][0];
            for(i=0;i<r1;i++)
            {
                for(j=i+1;j<c2;j++)
                {
                    if(max < res[i][j])
                    {
                        max = res[i][j];

                    }

                }
            }
            System.out.println("Max product value is: "+max);
        }
        else
        System.out.print("multipication does not exist ");
        sc.close();
    }
        
}
