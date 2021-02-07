package Array_Concept;

import java.util.Scanner;

public class Program26 
{
    public static void main(String[] args) 
    {
        //program to check two matrices are equal or not
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        //Initially checking whether it's a squared matrix size or not
        if(row1!=col1)
        {
            System.out.println("This is not a matrix ");
        }
        else
        {
            System.out.println("Enter the array size");
            int row2=sc.nextInt();
            int col2=sc.nextInt();
            if(row2!=col2 ||row1!=row2||col1!=col2)
            {
                System.out.println("This is not a matrix (or) Two matrices sizes are  different");
            }
            else
            {
                //Taking input first matrix
                int[][] arr=new int[row1][col1];
                System.out.println("Enter first matrix elements ");
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=0;j<arr.length;j++)
                    {
                        arr[i][j]=sc.nextInt();
                    }
                }
                //Taking input into second matrix
                int[][] arr2=new int[row2][col2];
                System.out.println("Enter second matrix elements ");
                for(int i=0;i<arr2.length;i++)
                {
                    for(int j=0;j<arr2.length;j++)
                    {
                        arr2[i][j]=sc.nextInt();
                    }
                }
                //printing first matrix elements
                System.out.println("The first matrix elements are");
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=0;j<arr.length;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    
                    }
                    System.out.println();
                }
            
                //printing second matrix elements
                System.out.println("The second matrix elements are");
                for(int i=0;i<arr2.length;i++)
                {
                    for(int j=0;j<arr2.length;j++)
                    {
                        System.out.print(arr2[i][j]+" ");
                    
                    }
                    System.out.println();
                }

                //Logic
                boolean same=true;
                for(int i=0;i<arr.length;i++)
                {
                    for(int j=0;j<arr.length;j++)
                    {
                        if(arr[i][j]!=arr2[i][j])
                        {
                            same=false;
                            break;
                        }
                    
                    }
                }
                if(same==true)
                {
                    System.out.println("Two matrices are equal");
                }
                else
                {
                    System.out.println("Two matrices are not equal");
                }

            }

        }
        sc.close();
    }
    
}
