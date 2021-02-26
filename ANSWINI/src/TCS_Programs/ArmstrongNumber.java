package TCS_Programs;

import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        //Reading user input and validating
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting range");
        int n1 = Validation.integerValidation(sc);
        System.out.println("Enter ending range");
        int n2 = Validation.integerValidation(sc);

        //Applying conditions given in question
        if((n1<=0 || n2<=0) || (n1>=n2))
        {
            System.out.println("wrong input");
        }
        else 
        {
            //LOGIC
            for(int i= n1;i<=n2;i++)
            {
                //placing the number to be checked into temporary variable
                int sum=0,temp=i,remainder;
                while(temp>0)
                {
                    remainder = temp % 10;
                    sum = sum+(remainder*remainder*remainder);
                    temp = temp/10;
                }
                //if original number is 'i' is same as 'sum' value then that number is armstrong number
                if(i==sum)
                {
                    System.out.println(i);
                }
            
            }
        }
        
        sc.close();
        
    }
    
}
