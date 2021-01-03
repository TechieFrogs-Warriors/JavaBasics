import java.util.Scanner;
public class AlphaPattern13 
{
    public static void main(String[] args) 
    {
        Scanner D=new Scanner(System.in);
        int n;
         do{
             System.out.println("enter positive number");
             while(!D.hasNextInt())
             {
                 String input = D.next();
    
                 System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
             }
           n=D.nextInt();
    
    
         }while(n<0);
           char Ch='A';
           for(int i=1;i<=n;i++)
           {
               for(int j=n;j>i;j--)
               {
                   System.out.print(" ");
               }
               int p=1;
               for(int k=1;k<=i;k++)
               {
                   System.out.print((char) (Ch-1+p)+" " );
                   p=p*(i-k)/k;
               }
              System.out.println();
           }
           D.close();
    }
    
}
