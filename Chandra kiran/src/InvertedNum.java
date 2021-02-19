import java.util.Scanner;
public class InvertedNum 
{
     public static void main(String[] args) 
    {
        Scanner N= new Scanner(System.in);
        //input validation..
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!N.hasNextInt())
            {
                String input = N.next();
                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          n=N.nextInt();
        }while(n<0);
         int i,j;
         for(i=n;i>=1;i--)
         {
               for(j=1;j<=i;j++)
              {
                 System.out.print(j);
              }
             System.out.println();
         }
           N.close();
    }
    
}

    
    

