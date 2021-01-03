import java.util.Scanner;

public class Alphabet 
{
    public static void main(String[] args) 
    {
       Scanner c=new Scanner(System.in);
       // input validation
       char ch;
        System.out.println("enter a alphabet");
        while(!c.hasNext("[a-zA-Z]+"))
        {
            String input = c.next();

            System.out.printf("\"%s\" is not a valid string.Please enter a valid string \n",input);
        }
          ch=c.next().charAt(0);//c is intialized

          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
          System.out.println("Alphabet is Vowel");
        }
        
    
          else
        {
            System.out.println("Alphabet is Consonant");
        }
         c.close(); 
     }
    
}
