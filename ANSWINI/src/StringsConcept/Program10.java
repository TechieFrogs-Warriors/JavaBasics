package StringsConcept;
import java.util.*;

public class Program10 
{
    public static void main(String[] args) 
    {
        String cAlphabets="ABCDEFGHIJKLMNOPQRSRUVWXYZ";
        String lAlphabets="abcdefghijklmnopqrstuvwxyz";
        String alphaNumeric=cAlphabets+lAlphabets;
        StringBuilder s1=new StringBuilder();
        Random obj=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter what length of random string you want:");
        int length=sc.nextInt();
        
        for(int i=0;i<length;i++)
        {
            int index=obj.nextInt(alphaNumeric.length());
            char ch=alphaNumeric.charAt(index);
            s1.append(ch);

        }
        System.out.println("Random value is: "+s1);
        sc.close();
        
    }
    
}
