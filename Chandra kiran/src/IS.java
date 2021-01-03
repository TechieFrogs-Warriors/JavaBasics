import java.util.Scanner;
public class IS 
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
        String S="ISTS";
        for(int i=1;i<=n;i++)
        {
            System.out.println(S.substring(0,i));
        }
        Z.close();
    }
    
}
