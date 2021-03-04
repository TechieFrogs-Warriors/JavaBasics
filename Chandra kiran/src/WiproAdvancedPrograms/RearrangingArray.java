package WiproAdvancedPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangingArray 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int arraySize=InputValidation(scanner);
        int originalArray[]= new int[arraySize];
        System.out.println("Enter the array elements");
        for(int i=0;i<originalArray.length;i++)//for loop for entering array elements
        {
            originalArray[i]=scanner.nextInt();
        }
        rearrange(originalArray);//calling method 

        
    }
    public static void rearrange(int originalArray[])
    {
        int rearrangedArray[]=new int[originalArray.length];
        int end=originalArray.length-1,start=0;//end is starting from last element of array and start is starting from first element
        Arrays.sort(originalArray);//sorting the given array
        for(int i=0;i<originalArray.length;i++)
        {
            
            if(i%2==0)//checks the if is even
            {
                rearrangedArray[i]=originalArray[end];//prints the largest elements
                end--;//decreaments the end position
                
            }
            else
            {
                rearrangedArray[i]=originalArray[start];//else prints the small elements
                start++;//increaments the start position 
            }
            
        }
        for(int i=0;i<rearrangedArray.length;i++)
        {
            System.out.print(rearrangedArray[i]+" ");//prints the rearranged array
        }
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
