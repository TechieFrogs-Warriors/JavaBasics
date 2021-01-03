import java.util.Scanner;
public class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner Z=new Scanner(System.in);
        int n;
         do{
             System.out.println("enter positive number");
             while(!Z.hasNextInt())
             {
                 String input = Z.next();
    
                 System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
             }
           n=Z.nextInt();
    
        }while(n<0);
        int m;
        String S1="HELLO",S2="WORLD";
        
        m=S2.length();

        for(int i=1;i<=n;i++)
        {
            System.out.print(S1.substring(0,i));
        
            
        if(m>=1)
        {
                 System.out.print(S2.substring(0,m));
                 m--;
                }
                System.out.println();
        }
        Z.close();
    }
}
