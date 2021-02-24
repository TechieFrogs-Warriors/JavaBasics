package AccenturePrograms;

import java.util.Scanner;

//program to find sum of odd numbers between 100 and 1000
public class SumOfOddNumbers 
{
    public static void main(String[] args) 
    {
        //Taking user input to find factorial of that number
        Scanner sc=new Scanner(System.in);
        //validation for the first number
        int firstNum;
        do
        {
            System.out.println("Enter your first number of the range");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter positive integer value");
                sc.next();
            }
            firstNum = sc.nextInt();
        }while(firstNum <= 0);

        //validation for the second number
        int lastNum;
        do
        {
            System.out.println("Enter your last number of the range");
            while(!sc.hasNextInt())
            {
                System.out.println("Enter positive integer value");
                sc.next();
            }
            lastNum = sc.nextInt();
        }while(lastNum <= 0);
        
        //calling the method that performs logic
        odd_Sum(firstNum, lastNum); 

        sc.close();
    }
    public static void odd_Sum(int startNum,int endNum)
    {
        //Logic
        int oddNumSum = 0;
        for(int i=startNum;i<=endNum;i++)
        {
            if(i%2 != 0)
            oddNumSum = oddNumSum + i;
        }
        System.out.println("sum of odd numbers between "+startNum+" and "+endNum+" is : "+oddNumSum);
    }
    
}
