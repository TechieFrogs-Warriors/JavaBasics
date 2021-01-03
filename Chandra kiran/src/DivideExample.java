import java.util.Scanner;
public class DivideExample 
{
    public static void main(String[] args) 
    {
        Scanner d=new Scanner(System.in);
        //input validation..
        int a,b;
        do
        {
            System.out.println("enter positive number");
            while(!d.hasNextInt())
            {
                String input = d.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          a=d.nextInt();
          b=d.nextInt();
        }while(a<0&&b<0);
         int  div=0,mod=0;
         div=a/b;//here quotient is the output
         mod=a%b;//here remainder is the output
         System.out.println(div);
         System.out.println(mod);
         d.close();
    }
    
}
