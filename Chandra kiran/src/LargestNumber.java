import java.util.Scanner;
public class LargestNumber 
{
    public static void main(String[] args) 
    {
        Scanner L= new Scanner(System.in);
        //input validation..
        int a,b,c;
        do
        {
            System.out.println("enter positive number");
            while(!L.hasNextInt())
            {
                String input = L.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          a=L.nextInt();
          b=L.nextInt();
          c=L.nextInt();
        }while(a<0&&b<0&&c<0);
        
        
        if(a>b&&a>c)//condition to check the lage num between a,b and c
        {
            System.out.println("a is greater than b and c");
        
        }
        else if(b>a&&b>c)//condition to check the large num between a,b,c
        {
            System.out.println("b is greater than a and c");
        }
     else
        {
          System.out.println("c is greater than a and b");
        }
        L.close();
        
    }
    
}
