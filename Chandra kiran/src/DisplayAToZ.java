import java.util.Scanner;
public class DisplayAToZ 
{
   public static void main(String[] args) 
     {
        Scanner A =new Scanner(System.in);
        //input validation..
        char ch;
     
        System.out.println("enter a string");
        while(!A.hasNext("[a-zA-Z]+"))
        {
            String input = A.next();

            System.out.printf("\"%s\" is not a valid string.Please enter a valid string \n",input);
        }
      
        System.out.println("lowerCase");
        for(ch='a';ch<='z';ch++)
       {
    
         System.out.println(ch);//prints lower case alphabets
      }
       System.out.println("UpperCase");
       for(ch='A';ch<='Z';ch++)
       {
          
          System.err.println(ch);//prints uppercase alphabets
       }

       A.close();
     }
}