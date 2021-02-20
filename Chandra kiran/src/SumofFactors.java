import java.util.Scanner;

public class SumofFactors 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            num=scan.nextInt();
            
    
        }while(num<=0);
        
       System.out.println(Sumoffactors(num));//function calling
        scan.close();
    }
  public static int Sumoffactors(int num)
  {
        int sum=0,sum1=0;
       int size=num/2;
        for(int i=1;i<=size;i++)//for loop for numbers
        {
            if(num%i==0)
            {
                sum=sum+i;//adds the factors of given number
            }
        }
        int size1=sum/2;
        for(int i=1;i<=size1;i++)//for loop for numbers
        {
            if(sum%i==0)
            {
                sum1=sum1+i;//adds the factors of the sum value
            }
        }
        if(sum==sum1)//checks the sum of factors and sum of factors of factors are equal 
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    

}
