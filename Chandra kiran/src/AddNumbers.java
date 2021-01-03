import java.util.Scanner;
public class AddNumbers  
{
    public static void main(String[] args) 
    {
        Scanner add= new Scanner(System.in);
      //input validation..
        int a,b;
      
        do
        {
            System.out.println("enter positive number");
            while(!add.hasNextInt())
            {
                String input = add.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          a=add.nextInt();
          b=add.nextInt();

        } while(a<0&&b<0);

       int c;
       c=a+b;//sum of two numbers is stored in c
      System.out.println(c);
      add.close();

    }
    
}
