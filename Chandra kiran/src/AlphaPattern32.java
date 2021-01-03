import java.util.Scanner;
public class AlphaPattern32 
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
         int i,j,k=(n*(n-1))/2;
         char ch='A';
         for(i=1;i<n;i++)
         {
             k=k-i;
             
             for(j=1;j<=i;j++)
             {
                  System.out.print((char)(ch+k+j-1) +" ");
                 }
                 System.out.println();
            }
        
    }
    
}
