import java.util.Scanner;
public class AlphaPattern28 
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
               for(int j=0;j<n-i;j++)
               {
                   System.out.print((char)(ch+j)+" ");
               }
               for(int k=n-i-2;k>=0;k--)
               {
                   System.out.print((char)(ch+k)+" ");
               }
              System.out.println();
           }
           D.close();
    }
    
}
