import java.util.Random;

public class StringsPrg11 
{
    public static void main(String[] args) 
    {
        String Uppercasewords="ABCDEFGHIJKLMNOPQRSTQVWXYZ";
        String Lowercasewords="abcdefghijklmnopqrstuvwxyz";
        String Numbers="1234567890";
        String S=Uppercasewords+Lowercasewords+Numbers;
        StringBuilder S1 = new StringBuilder();
         Random Ran = new Random();
         int len =10;
         for(int i =0;i<len;i++)
         {
             int j = Ran.nextInt(S.length());
             char ch = S.charAt(j);
             S1.append(ch);


         }
        
         System.out.println("Random Numeric String "+S1);
    }
    
}
