import java.util.Scanner;
public class AlphaPattern18 
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
           for(int i=0;i<=n;i++)
           {
               for(int j=0;j<=i;j++)
               {
                   System.out.print(" ");
               }
               for(int k=i;k<=n;k++)
               {
                   System.out.print((char)(Ch+k)+" ");
               }
               System.out.println();
            }
             for(int i=n;i>=0;i--)
           {
               for(int j=0;j<=i;j++)
               {
                   System.out.print(" ");
               }
               for(int k=i;k<=n;k++)
               {
                   System.err.print((char)(Ch+k)+" ");
               }
               System.out.println();
           }
           D.close();
    }
    
}
