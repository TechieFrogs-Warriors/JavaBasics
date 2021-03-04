package WiproAdvancedPrograms;

import java.util.Scanner;

public class NextLargerElement 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new  Scanner(System.in);
        int N=InputValidation(scanner);
        int arr[]=new int[N];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scanner.nextInt();
        }
       int result[]= nextLargerElement(arr,N);//method calling
       for(int i=0;i<result.length;i++)
       {
           if(result[i]==0)//checks if any element is zero 
           {
               result[i]=-1;//if zero then replace it by -1
           }
           System.out.print(result[i]+" ");//prints the result array elements
       }
    }
    public static int[] nextLargerElement(int arr[],int N)
    {
        int arr1[]=new int[N];
        for(int i=0;i<arr.length;i++)//for loop for first element
        {
            for(int j=i+1;j<arr.length;j++)//for loop for next element
            {
                if(arr[i]<arr[j])//checks the if  the first element is less than next element
                {
                    arr1[i]=arr[j];//if less then assign second element to array
                    break;
                }
            }
            System.out.print(arr1[i]+" ");
        }
        return arr1;
    }
    public static int InputValidation(Scanner scanner)
    {
        int num;
        do
        {
            System.out.println("Enter the valid number");
            while(!scanner.hasNext())
            {
                System.out.println("Entered number  is not valid .Please enter valid number");
                scanner.next();
            }
            num=scanner.nextInt();
        }while(num<=0);
        return num;
    }
    
}
