import java.util.Scanner;
public class MultiplicationTable 
{
  public static void main(String[] args) 
  {
        Scanner M= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("enter positive number");
            while(!M.hasNextInt())
            {
                String input = M.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
              n=M.nextInt();
        }while(n<0);
          int i,mul;
          for(i=1;i<=10;i++)
          {
            mul=n*i;//stores the multiplied value
           System.out.println(n+"*"+i+"="+mul);  
           M.close();
         }
        
    }
    
}
