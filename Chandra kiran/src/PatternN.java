import java.util.Scanner;
public class PatternN 
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
         int i,j;
         for(i=1;i<=n;i++)
         {
             for(j=1;j<=n;j++)
             {
                 if(j==1||j==n||i==j)
                 {
                     
                     System.out.print(i);
                 }
                 
                 else
                 {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         D.close();
    }
    
}