import java.util.Scanner;
public class AlphaPattern4 
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
           
           for(int i=n;i>=1;i--)
           {
               int alphabet=65;
               for(int j=0;j<=i;j++)
               {
                   System.out.print((char)(alphabet+j)+" ");
               }
                System.out.println();
            }
              for(int i=0;i<=n;i++)
              {
                  int alphabet=65;
                  for(int j=0;j<=i;j++)
                  {
                      System.out.print((char)(alphabet+j)+" ");
                  }
                  System.out.println();
              }
        
           
           D.close();
    

        
    }
    
}
