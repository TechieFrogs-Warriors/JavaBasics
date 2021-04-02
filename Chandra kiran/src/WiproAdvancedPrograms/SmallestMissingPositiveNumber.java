package WiproAdvancedPrograms;

import java.util.Scanner;

public class SmallestMissingPositiveNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int arraySize=InputValidation(scanner);
        int numberArray[]=new int[arraySize];
        System.out.println("Enter array elements");//for loop for entering array elements
        for(int i=0;i<numberArray.length;i++)
        {
            numberArray[i]=scanner.nextInt();
        }
        
        int smallestMissing=missingNumber(numberArray);//method calling
        System.out.println("The smallest missing positive number is "+smallestMissing);//prints the smallest missing number
    }
    public static int missingNumber(int numberArray[])
    {
        int j=0;
        int temp[]=new int[numberArray.length];
        for(int i=0;i<temp.length;i++)
        {
            if(numberArray[i]>0)//checks the value of elements is greater than zero
            {
                temp[j]=numberArray[i];//placing the positive numbers in the temperory array
                j++;//increaments the count
            }
        }
        int n=j;//storing the count of positive numbers in n
        int sum=(n+1)*(n+2)/2;//formula for calculating the sum of numbers upto given number 
        for(int i=0;i<j;i++)
        {
            sum=sum-temp[i];

        }
        return sum;
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
