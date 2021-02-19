import java.util.Scanner;

public class Digiroot 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num;
        //input validation...
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
        while(num>0)//checks whether number is greater than zero and sum is greater than 9
        {
            
            sum=sum+(num%10);//seperate each digit and adds to sum
             num=num/10;
        }
        while(sum>0||sum>9)
        {
            sum1=sum1+sum%10;//seperate each digit and adds to sum1
            sum=sum/10;
        }
        System.out.println("Digiroot of given number is "+sum1);
         scan.close();
        
    }
    
}
