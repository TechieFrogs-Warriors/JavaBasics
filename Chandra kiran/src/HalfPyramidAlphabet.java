import java.util.Scanner;
public class HalfPyramidAlphabet 
{
    public static void main(String[] args) 
    {
        Scanner R=new Scanner(System.in);
        //input validation..
     char Last='E',alphabet='A';
     
        System.out.println("enter a alphabets");
        while(!R.hasNext("[a-zA-Z]+"))
        {
            String input = R.next();

            System.out.printf("\"%s\" is not a valid string.Please enter a valid string \n",input);
        }
      Last=R.next().charAt(0);
      alphabet=R.next().charAt(0);
      int i,j;
     for(i=1;i<=(Last-alphabet+1);++i)//outer for loop
     {
         for(j=1;j<=i;++j)//innner for loop
         {
             System.out.print(alphabet+ " ");
         }
         ++alphabet;//preincreaments the alphabet value
         System.out.println(); 
      } 
    
    }
    
}
