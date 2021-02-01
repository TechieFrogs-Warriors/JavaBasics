public class StringsPrg26 
{
    public static void main(String[] args) 
    {
        String S="race";
        String S1="care";
        int n=0;
        if(S.length()==S1.length())
        {
            for(int i=0;i<S.length();i++)
            {
                char ch = S.charAt(i);
                for(int j=0;j<S1.length();j++)
                {
                    char ch1 = S1.charAt(j);
                    if(ch==ch1)
                    {
                        n++;
                        
                    }
                }
            }
            if(n==S.length())
            {
                System.out.println("Two words are anagrams");
            }
            else
            {
                System.out.println("Two words not anagrams");
            }

        }
    
        
    }
    
}
