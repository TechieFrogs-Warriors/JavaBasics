import java.util.Scanner;
public class Factorial 
{
   public static void main(String[] args) 
    {
        Scanner f= new Scanner(System.in);
       // input validation..
        int i;
        do
        {
             System.out.println("enter positive number");
              while(!f.hasNextInt())
            {
                String input = f.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          i=f.nextInt();
        }while(i<0);
       
        int fact=1,j;
        for(j=i;j>0;j--)
        {
            fact=fact*j;//fact*j value is again stored into fact
        }
          System.out.println(fact);
         f.close();
     }
    
}
