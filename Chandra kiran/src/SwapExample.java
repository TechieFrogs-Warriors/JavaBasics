import java.util.Scanner;

public class SwapExample 
{
    public static void main(String[] args) 
    {
        Scanner swap=new Scanner(System.in);
        //input validation..
        int a,b,c;
        do
        {
            System.out.println("enter positive number");
            while(!swap.hasNextInt())
            {
                String input = swap.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          a=swap.nextInt();
          b=swap.nextInt();
        
        }while(a<0&&b<0);

         
         c=a;//a value is stored in c
         a=b;//b vlue value is stored in a
         b=c;//c value is stored in c
         System.out.println("a="+a);
         System.out.println("b="+b);
         swap.close();
    }
    
}
