import java.util.Scanner;
public class AlphaPattern34 
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
         int temp=1;
         for(int i=1;i<=n/2+1;i++)
         {
             for(int j=1;j<=i;j++)
             {
                 System.out.print((char)(ch+(temp*j)-1)+" ");

             }
             System.out.println();
             temp++;
         }
         for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n/2+1-i;j++)
             {
                 System.out.print((char)(ch+(temp*j)-1)+" ");
             }
             System.out.println();
             temp++;
         }
         D.close();
    }
    
}
