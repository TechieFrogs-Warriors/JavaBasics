import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner P= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!P.hasNextInt())
            {
                String input = P.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=P.nextInt();
          
        }while(n<0);

        int temp,sum=0,rev;
         temp=n;//n value is stored in temp
         while(n>0)
         {
           rev=n%10;//remainder value is stored in rev
           sum=(sum*10)+rev;//sum value is stored in sum
           n=n/10;
         }
         if(temp==sum)//condition for checking palindrome
         {
          System.out.println("given number is palindrome");

         }
        else
        {
          System.out.println("given number is not palindrome");
        }
        P.close();
    }
    
}
