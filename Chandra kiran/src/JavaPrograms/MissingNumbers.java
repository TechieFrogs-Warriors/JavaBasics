package JavaPrograms;


import java.util.Scanner;

public class MissingNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        int number=InputValidation(scanner);
        int numberArray[]=new int[number-1];
        int missingNumber=0;
        System.out.println("Enter array elements");
        for(int i=0;i<numberArray.length;i++)
        {
            numberArray[i]=scanner.nextInt();
        }
        int sumOfArray=0,sum=0;
        
        for(int i=0;i<numberArray.length;i++)
        { 
            sumOfArray=sumOfArray+numberArray[i];//sum of array elements
        
        }
        for(int i=1;i<=number;i++)//for loop for getting numbers upto given number
        {
            sum=sum+i;// the sum of numbers upto given number
        }
        missingNumber=sum-sumOfArray;
        System.out.println(missingNumber);//prints missing number
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
