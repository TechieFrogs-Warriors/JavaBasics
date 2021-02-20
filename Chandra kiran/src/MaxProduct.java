import java.util.Scanner;

public class MaxProduct 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
       //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNext())
            {
                System.out.println("Entered value is not valid.Please enter valid number");
                scan.next();
            }
           size =scan.nextInt();
        }while(size<=0); 
        int arr[][] = new int[size][size];
        int arr1[][]= new int[size][size];
        int arr2[][]= new int[size][size];
        int max=1;
        System.out.println("Enter 1st array elements");
        for(int i=0;i<size;i++)//for loop for rows 
        {
            for(int j=0;j<size;j++)//for loop for coloumn
            {
                arr[i][j]=scan.nextInt(); 
            }
        }
        System.out.println("Enter 2nd array elements");
        for(int i=0;i<size;i++)//for loop for rows
        {
            for(int j=0;j<size;j++)//for loop  for column
            {
                arr1[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<size;i++)//for loop for rows
        {
            for(int j=0;j<size;j++)//for loop for coloumn
            {
                arr2[i][j]=0;
                for(int k=0;k<size;k++)
                 {
                     arr2[i][j]=arr2[i][j]+arr[i][k]*arr1[k][j];//multiplying both matrices
                 }
                    System.out.print(arr2[i][j]+" ");
            }
                System.out.println();
        }

        for(int i=0;i<size;i++)//for loop for rows
        {
            for(int j=0;j<size;j++)//for loop for column
            {
                if(arr2[i][j]>max)//compares each element with max value
                {
                    max=arr2[i][j];
                }

            }
        }
        System.out.println("Maximum Product of matrix is "+max);//printing max product 

        scan.close();
    }
    
}
