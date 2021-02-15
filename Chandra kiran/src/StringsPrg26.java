public class StringsPrg26 
{
    public static void main(String[] args) 
    {
        String S="raced";
        String S1="caret";
        int n=0;
        if(S.length()!=S1.length())
        {
           System.out.println("Two are not anagram ");     
        }
        else
        {
             for(char i='a';i<='z';i++)
            {
               for(int j=0;j<S.length();j++)
                {
                    char ch = S.charAt(j);
                    char ch1=S1.charAt(j);
                    if(ch==i)
                    {
                        n++;
                        
                    }
                    if(ch1==i)
                    {
                        n--;
                    }
                }
            
        
                     if(n!=0)
                     {
                         System.out.println("Two words not are anagrams");
                     }
                     else
                     {
                        System.out.println("Two words are anagrams");
                     }
            }
        
         }
     }
    
        
 }
    

