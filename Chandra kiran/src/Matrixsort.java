import java.util.Arrays;
import java.util.Scanner;

public class Matrixsort 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            size=scan.nextInt();
    
        }while(size<=0);
        int arr[][]=new int[size][size];
        System.out.println("Enter the elements into the array");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<size;i++)//for loop for row elements
        {
            Arrays.sort(arr[i]);//function to sort only row of matrix
        }
            for(int j=0;j<size;j++)//for loop to print rows
            {
                for(int k=0;k<size;k++)//for loop to print columns
                {
                    System.out.print(arr[j][k]+" ");//prints the sorted matrix
                }
                System.out.println();
            }
        
        scan.close();
    }
    
}
