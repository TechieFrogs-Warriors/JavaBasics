import java.util.Scanner;
public class AlphaPattern30 
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
           char ch='A';
           for(int i=0;i<=n;i++)
           {
               for(int j=0;j<=n-i;j++)
               {
                   System.out.print((char)(ch+j));
               }
               for(int k=1;k<=i*2-1;k++)
               {
                   System.out.print(" ");
                   
               }
               for(int j=n-i;j>=0;j--)
               {
                   if(j!=n)
                   {
                       System.out.print((char)(ch+j));
                   }
               }
              System.out.println();
           }
           for(int i=n-1;i>=0;i--)
           {
               for(int j=0;j<=n-i;j++)
               {
                   
                   System.out.print((char)(ch+j));
               }
               for(int k=1;k<=i*2-1;k++)
               {
                   System.out.print(" ");
               }
               for(int j=n-i;j>=0;j--)
               {
                   if(j!=n)
                   {
                    System.out.print((char)(ch+j));
                   }
               }
               System.out.println();
           }
           D.close();
    }
    
}
