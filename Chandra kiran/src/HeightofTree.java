import java.util.Arrays;
import java.util.Scanner;

public class HeightofTree 
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
        int arr1[]= new int[size];
        int trees[]= new int[size];
        System.out.println("Enter 1st array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter 2nd array elements");
        for(int i=0;i<size;i++)
        {
            arr1[i]=scan.nextInt();
        }
        for(int i=0;i<size;i++)//for loop for traverse  elements
        {
            trees[i]=(arr[i]*12)+arr1[i];
            System.out.print(trees[i]+" ");
        }
        System.out.println();
        Arrays.sort(trees);//Array is sorted
        for(int i=0;i<size;i++)
        { 
            if(i==size-1)//checks last element of array
           {
              System.out.println("The maximum height of the tree "+trees[i]);//maximum height is printed
           }
        }
        scan.close();
    }
    
}
