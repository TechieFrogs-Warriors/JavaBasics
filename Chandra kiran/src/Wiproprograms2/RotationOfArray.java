package Wiproprograms2;

import java.util.Scanner;

public class RotationOfArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N=InputValidation(scanner);
        int arr[]=new int[N];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int D=InputValidation(scanner);
        rotateArr(arr,D);//method calling
        
    }
    public static void rotateArr(int arr[],int D)
    {

        for(int i=0;i<D;i++)//for loop for rotating a given array 
        {
            int j,firstelement=arr[0];
            for( j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];//assigns the next element to a[j]
            }
            arr[j]=firstelement;//assigns the first element to last of array
            
        }
        for(int i=0;i<arr.length;i++)//for loop for printing the array
        {
            System.out.print(arr[i]+" ");
        }
    

    }
    public static int InputValidation(Scanner scanner)
    {
        int n;
        do
        {
            System.out.println("Enter valid number");
            while(!scanner.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scanner.next();
            }
            n=scanner.nextInt();
        }while(n<=0);
        return n;
    }
    
    
}
