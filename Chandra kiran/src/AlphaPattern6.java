import java.util.Scanner;
public class AlphaPattern6 
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
           int alphabet=65;
           for(int i=0;i<=n;i++)
           {
               for(int j=n;j>i;j--)
               {
                   System.out.print(" ");
               }
               for(int k=0;k<=i;k++)
               {
                   System.out.print((char) (alphabet+k)+" ");

               }
              System.out.println();
           }
           D.close();
       
    
        
    }
    
}
