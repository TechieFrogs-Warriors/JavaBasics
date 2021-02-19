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
         
        
         
        
         for(int i=1;i<n;i++)
         {
             int ch=97;
             String S="";
             for(int j=1;j<=i;j++)
             {
                 S=S+(char) ch+" + ";
                 ch++;
             }
              System.out.println("(" + S.substring(0,S.length() - 3)+")");
            }
          D.close();  
        
    }
    
}
