import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) 
    {
        Scanner even= new Scanner(System.in);
        int i;
        do
        {
            System.out.println("enter positive number");
            while(!even.hasNextInt())
            {
                String input = even.next();

                System.out.printf("\"%s\" is not a valid number.Please enter a valid number \n",input);
            }
          i=even.nextInt();
        }while(i<0);
      if(i%2==0)//checks the number
      {
    
          System.out.println("number is even");
      }       
        else
        {
            System.out.println("number is odd");
        }
        even.close();
    }
    
}
