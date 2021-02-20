import java.util.Scanner;

public class PalindromeFunction 
{
    public static boolean Palindrome(String S1)
    {
        boolean flag =true;
        for(int i=0;i<S1.length()/2;i++)//for loop to check charaters upto half length
        {
            if(S1.charAt(i)!=S1.charAt(S1.length()-i-1))//checks whether the first character and last character in word are equal or not
            {
                flag =false;
                break;
            }

        }
        return flag;
    }
   
    public static void Palindromewords(String S)
    {
        
        int  temp=0;
        String word="";
        String words[]= new String[100];
        S=S.toLowerCase();
        S=S+" ";
        int len=S.length();
        for(int i=0;i<len;i++)
        {
            if(S.charAt(i)!=' ')//checks whether there are spaces 
            {
              word=word+S.charAt(i);//assigning character of string to word
            }
            else
            {
                words[temp]=word;
                temp++;
                word="";
            }
        }
          for(int i=0;i<temp;i++)
          {
            if(Palindrome(words[i])&&words[i]!=" ")//checks whether the words are palindrome or not by calling palindrome method
            {
               System.out.println("palindrome words are "+words[i]);
                
            }
            
          }

    }
        
     
   public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String S;
        //input validation...
        do
        {
            System.out.println("Enter Valid String ");
            while(!scan.hasNext("[A-Za-z]*"))
            {
                System.out.println("Entered string is not valid.Please enter valid String");
                scan.next();
            }
            S=scan.nextLine();
        }while(S==" ");
        Palindromewords(S);//palindromewords  method calling 
        scan.close();
    }


    
}
