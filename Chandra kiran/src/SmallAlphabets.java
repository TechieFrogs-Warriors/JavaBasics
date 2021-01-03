import java.util.Scanner;
public class SmallAlphabets 
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
         char ch='a';
         int i,j;
        for(i=n;i>=1;i--)
         {
             for(j=0;j<=i;j++)
             {
                 System.out.print((char)(ch+j));
             }
             System.out.print(" ");
             for(int k=i;k>=0;k--)
             {
                 if(k!=n)
                 {
                     System.out.print((char)(ch+k));
                 }
                 else
                 {
                  System.out.print("");
                 }
             }
             System.out.println();
             
         }
             for(i=0;i<=n;i++)
            {
                 for(j=0;j<=i;j++)
                 {
                     System.out.print((char)(ch+j));
                 }
                System.out.print(" ");
                 for(int k=i;k>=0;k--)
                 {
                     if(k==n)
                     {
                         System.out.print("");

                     }
                     
                     if(k!=n)
                     {
                       System.out.print((char)(ch+k));
                     }

                 }
                    System.out.println();
                }
            
    }
    
}
