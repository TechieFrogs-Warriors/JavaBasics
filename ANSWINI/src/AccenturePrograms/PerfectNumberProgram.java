package AccenturePrograms;

import java.util.Scanner;
//program to find perfect numbers between 5000 and 9000
public class PerfectNumberProgram 
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

        //calling method that performs logic
        checkPerfectNumber(firstNum, lastNum);
        sc.close();
        
    }
    //Logic
    public static void checkPerfectNumber(int fNum,int lNum)
    {
        int i,count=0;
        for(i=fNum;i<=lNum;i++)
        {
            int sum=0,number=1;
            //perfect number will be divided perfectly by the numbers less than it ,excluding itself .
            while(number<i)
            {
                if(i % number == 0)
                sum = sum + number;
                number++;
            }
            //comparing the number with its divisor's sum
            if(sum == i)
            {
                count++;//incrementing perfect number count
                System.out.println("Perfect number is : "+i);//printing perfect number
            
            }
            
        }
        
        System.out.println("Total number of perfect numbers between "+fNum+" and "+lNum+ " are: "+count);

    }
    
}
