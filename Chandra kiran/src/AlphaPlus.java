import java.util.Scanner;
public class AlphaPlus 
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
         int i,j,k=0;
         char ch='a';
         for(i=0;i<=n;i++)
         {
             for(j=0;j<=i;j++)
             {
                 System.out.print(k);
                 k=ch+j;
             }
             System.out.println();
         }
          D.close();
        
    }
    
}
