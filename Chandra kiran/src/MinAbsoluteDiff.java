import java.util.Arrays;
import java.util.Scanner;

public class MinAbsoluteDiff 
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
        int arr[] = new int[size];
        int Min=0,sum=0;
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++)//for loop to enter elements of arr
        {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);//Sorts the array
        sum=sum+Math.abs(arr[0]-arr[1]);//absolute value of difference between 1 and 2 elements
        sum=sum+Math.abs(arr[size-1]-arr[size-2]);//absolute value of difference between last  and last but one elements
        for(int i=1;i<size-1;i++)
        {
             Min=Math.min(Math.abs(arr[i]-arr[i-1]), Math.abs( arr[i]-arr[i+1]));//caluclates the min value of absloute diiferen between each element
             sum=sum+Min;//Adds the min values
        }
        System.out.println("Sum of Minimum Absolute Difference "+sum);
        scan.close();
        
    }
    
}
