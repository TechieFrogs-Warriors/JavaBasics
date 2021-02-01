import java.util.Arrays;

public class StringsPrg9 
{
    static void Anagram(String S,String S1)
    {
        String S2=S.replaceAll("\\s","");
        String S3=S1.replaceAll("\\s", "");
        boolean status = true;
        if(S.length()!=S1.length())
        {
            status=false;
        }
        else
        {
            char[] ch =S2.toLowerCase().toCharArray();
            char[] ch1=S3.toLowerCase().toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            status =Arrays.equals(ch, ch1);

        }
        if(status)
        {
            System.out.println(S2+" and "+S3+" are anagrams ");
        }
        else
        {
            System.out.println(S2+" and "+S3+" are not anagrams ");

        }
    }
    public static void main(String[] args) 
    {
        Anagram("Race","Care");
    
        
    }
    
}
