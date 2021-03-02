package JavaPrograms;

import java.util.Scanner;

public class IntersectionOfArrays 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int arraySize1=InputValidation(scanner);
        int arraySize2=InputValidation(scanner);
        int firstArray[]=new int [arraySize1];
        int secondArray[]=new int [arraySize2];
        System.out.println("Enter the first array elements");
        for(int i=0;i<firstArray.length;i++)
        {
            firstArray[i]=scanner.nextInt();
        }
        System.out.println("Enter the second array elements");
        for(int j=0;j<secondArray.length;j++)
        {
            secondArray[j]=scanner.nextInt();
        }
        for(int i=0;i<firstArray.length;i++)//for loop for firstArray
        {
            for(int j=0;j<secondArray.length;j++)//for loop for secondArray
            {
                if(firstArray[i]==secondArray[j])//checks if the elements of both arrays are equal
                {
                    System.out.print(firstArray[i]+" ");//prints the common elements in both arrays
                }
            }
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
