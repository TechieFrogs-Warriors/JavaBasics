import java.util.Scanner;
public class AlphabetOrNot  
{
    public static void main(String[] args)
     {
        Scanner c=new Scanner(System.in);
        //input validation..
        char ch;
      System.out.println("enter a string");
        while(!c.hasNext("[a-zA-Z]+"))
        {
            String input = c.next();

            System.out.printf("\"%s\" is not a valid string.Please enter a valid string \n",input);
        }
      ch=c.next().charAt(0);
      if((ch>='a'&& ch<='z') || (ch>='A'&&ch<='Z'))
      {
          System.out.println("it is Alphabet");
      }
     else
        {
           System.out.println("not a Alphabet");
         }
       c.close();
        
    }
    
}
