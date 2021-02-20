import java.util.Scanner;

public class NonZeroFactorial 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int size;
        //input validation....
        do
        {
            System.out.println("Enter valid number");
            while(!scan.hasNextInt())
            {
                System.out.println("Entered number is invalid.Please enter valid number");
                scan.next();
            }
            size=scan.nextInt();
    
        }while(size<=0);
        int fact=1,num=0;
        for(int i=0;i<size;i++)
        {
            fact=fact*(size-i);//gives factorial of given number
        }
        System.out.println(fact);
            num=fact%10;//gives the last digit of number
            if(num>0)//checks whether it is greater than zero
            {
                System.out.println("Last non zero digit of factorial "+num);//
            }
            else if(num==0)
            {
                
                fact=fact/10;//gives the remaing digits in number
                 num=fact%10;//again gives the last digit
                 if(num>0)
                System.out.println("Last non zero digit of factorial "+num);
                else
                fact=fact/10;
                num=fact%10;
                System.out.println("Last non zero digit of factorial "+num);
                
            }
            scan.close();
        
    }
    
}
