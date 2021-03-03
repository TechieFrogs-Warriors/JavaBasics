package Wiproprograms2;

import java.util.Arrays;
import java.util.Scanner;



public class UnionOfTwoSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int N=InputValidation(scanner);
        int M=InputValidation(scanner);
        int arr1[]=new int[N];
        int arr2[]=new int[M];
        System.out.println("Enter arr1 elements ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Enter arr2 elements");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scanner.nextInt();
        }
        Arrays.sort(arr1);//arr1 will be sorted
        Arrays.sort(arr2);//arr2 will be sorted
        findUnion(arr1,arr2);//method calling
    }
    public static void findUnion(int arr1[],int arr2[])
    {
        arr1=Arrays.stream(arr1).distinct().toArray();//removes all duplicate elements in the arr1
        arr2=Arrays.stream(arr2).distinct().toArray();//removes all duplicate elements in the arr2
        int i=0,j=0;
        while(i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[j])//checks the element of arr1 is less than arr2
            {
                System.out.print(arr1[i]+" ");//if less prints element of arr1
                i++;//i is increamented
            }
            else if(arr2[j]<arr1[i])//checks the element of arr2 is less than arr1
            {
                System.out.print(arr2[j]+" ");//if less prints element of arr2
                j++;//j is increamented
            }
            else 
            {
                System.out.print(arr1[j]+" ");//if both elements are equal prints any one element
                j++;
                i++;
            }
                
        }
        while(i<arr1.length)//checks the i value less than arr1 length
        {
            System.out.print(arr1[i]+" ");//prints the elements of array
            i++;
        }
        while(j<arr2.length)//checks the j value less than arr2 length
        {
            System.out.println(arr2[j]+" ");//prints the elements of array
            j++;
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
