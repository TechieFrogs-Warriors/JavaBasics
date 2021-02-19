import java.util.Scanner;
public class AlphaPattern33
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
         int k=1;
           char ch='A';
           for(int i=0;i<=n;i++) 
           {
               k=i;
               for(int j=0;j<=i;j++)
               {
                 System.out.print((char)(ch + k )+" ");
                 k=(k + n) - j;
               }
               System.out.println();
             }
           D.close();
    }
    
}
