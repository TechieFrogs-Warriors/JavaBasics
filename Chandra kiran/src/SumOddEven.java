import java.util.Scanner;

public class SumOddEven 
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
        int sum=0,sum1=0;
        int i=0,rev=0,n=0;
        while(num!=0)
        {
          n=num%10;//gives last digit of number
          rev=(rev*10)+n;
          num=num/10;
        }
        System.out.println(rev);
        num=rev;
        while(num!=0)
        {
            if(i%2==0)
            {
                sum=sum+num%10;//sum of all even numbers
            }
            else
            {
                sum1=sum1+num%10;//sum of all odd numbers
            }
            
            num=num/10;
            i++;
        }
        System.out.println("Sum of even numbers "+sum);
        System.out.println("Sum of odd numbers "+sum1);
        scan.close();
    }
    
}
